package org.otcl.test.unit;

import javax.xml.transform.Source;

import org.junit.Assert;
import org.junit.Test;
import org.otcl2.common.OtclConstants;
import org.otcl2.common.engine.OtclEngine;
import org.otcl2.common.util.OtclUtils;
import org.otcl2.core.engine.OtclEngineImpl;
import org.xmlunit.builder.Input;
import org.xmlunit.diff.Comparison;
import org.xmlunit.diff.ComparisonListener;
import org.xmlunit.diff.ComparisonResult;
import org.xmlunit.diff.DOMDifferenceEngine;
import org.xmlunit.diff.DifferenceEngine;

import com.athena.airlines.dto.AthenaAirlinePassenger;
import com.kronos.airlines.dto.KronosAirlinePassenger;


public class OtclTest {

	private static OtclEngine otclEngine = OtclEngineImpl.instance;
	
	private static enum TEST_METHOD {
		VALUES_TO_TARGET, 
		SOURCE_TO_TARGET  
	}
	
	private static TEST_METHOD testMethod = TEST_METHOD.SOURCE_TO_TARGET;
	// - set 'testMethod' to TEST_METHOD.VALUES_TO_TARGET when the OTCL file has 'from: values:' only and does 
	//    not have even a single reference to a source object
	// 
	// set 'testMethod' to  TEST_METHOD.SOURCE_TO_TARGET when the OTCL file has references to a source object with
	//    or without 'from: values:'.
	
	private static String pkg = null;

	@Test
	public void runTest() {
		
 		compileAndDeploy();
 		
		AthenaAirlinePassenger airlinePassenger = null;
 		if (TEST_METHOD.VALUES_TO_TARGET == testMethod) {
 			airlinePassenger = otclEngine.executeOtcl(pkg, AthenaAirlinePassenger.class, null);
 		} else if (TEST_METHOD.SOURCE_TO_TARGET == testMethod) {
 			KronosAirlinePassenger kronosAirlinePassenger = TestUtil.loadKronosXml();
 			airlinePassenger = otclEngine.executeOtcl(pkg, kronosAirlinePassenger, AthenaAirlinePassenger.class, null);
 			
 			//-- compare results.
			String result = PrintUtil.jaxbObjectToXML(airlinePassenger); 
			System.out.println(result);
			
			String otclFile = OtclUtils.createDeploymentId(pkg, kronosAirlinePassenger, AthenaAirlinePassenger.class) +
					OtclConstants.OTCL_SCRIPT_EXTN; 
			String expected = TestUtil.getTestCase(otclFile);
			Source control = Input.fromString(expected).build();

			Source test = Input.fromString(expected).build();
			DifferenceEngine diff = new DOMDifferenceEngine();
			diff.addDifferenceListener(new ComparisonListener() {
		        public void comparisonPerformed(Comparison comparison, ComparisonResult outcome) {
		            Assert.fail("found a difference: " + comparison);
		        }
		    });
			diff.compare(control, test);
		}
	}
 	
	private void compileAndDeploy() {
		// -- compile script and generated source code
		otclEngine.compileOtcl();
		otclEngine.compileSourceCode();
		
		// -- register the generated .tmd and the executable files.
		otclEngine.register();
	}
	
}
