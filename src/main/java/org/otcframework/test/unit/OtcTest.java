package org.otcframework.test.unit;

import javax.xml.transform.Source;

import org.junit.Assert;
import org.junit.Test;
import org.otcframework.common.OtcConstants;
import org.otcframework.common.engine.OtcEngine;
import org.otcframework.common.util.OtcUtils;
import org.otcframework.core.engine.OtcEngineImpl;
import org.xmlunit.builder.Input;
import org.xmlunit.diff.Comparison;
import org.xmlunit.diff.ComparisonListener;
import org.xmlunit.diff.ComparisonResult;
import org.xmlunit.diff.DOMDifferenceEngine;
import org.xmlunit.diff.DifferenceEngine;

import com.athena.airlines.dto.AthenaAirlinePassenger;
import com.kronos.airlines.dto.KronosAirlinePassenger;


public class OtcTest {

	private static OtcEngine otcEngine = OtcEngineImpl.instance;
	
	private static enum TEST_METHOD {
		VALUES_TO_TARGET, 
		SOURCE_TO_TARGET  
	}
	
	// - set 'testMethod' to TEST_METHOD.VALUES_TO_TARGET when the OTC file has 'from: values:' only and does 
	//    not have even a single reference to a source object
	// 
	// set 'testMethod' to  TEST_METHOD.SOURCE_TO_TARGET when the OTC file has references to a source object with
	//    or without 'from: values:'.
	

	@Test
	public void runTest() {
		
 		compileAndDeploy();
 		
		AthenaAirlinePassenger airlinePassenger = null;
		String otcFile = null;
		String otcExpectedResultFile = null;
		
		String pkg = "overrides";
//		TEST_METHOD testMethod = TEST_METHOD.VALUES_TO_TARGET;
		TEST_METHOD testMethod = TEST_METHOD.SOURCE_TO_TARGET;
		
 		if (TEST_METHOD.VALUES_TO_TARGET == testMethod) {
 			airlinePassenger = otcEngine.executeOtc(pkg, AthenaAirlinePassenger.class, null);
 			otcFile = OtcUtils.createDeploymentId(pkg, AthenaAirlinePassenger.class) +
 					OtcConstants.OTC_SCRIPT_EXTN; 
 			otcExpectedResultFile = OtcUtils.createDeploymentId(pkg, AthenaAirlinePassenger.class) + ".xml"; 
		} else if (TEST_METHOD.SOURCE_TO_TARGET == testMethod) {
 			KronosAirlinePassenger kronosAirlinePassenger = (KronosAirlinePassenger) TestUtil.loadKronosXml();
 			airlinePassenger = otcEngine.executeOtc(pkg, kronosAirlinePassenger, AthenaAirlinePassenger.class, null);
 			otcFile = OtcUtils.createDeploymentId(pkg, kronosAirlinePassenger, AthenaAirlinePassenger.class) +
 					OtcConstants.OTC_SCRIPT_EXTN; 
 			otcExpectedResultFile = OtcUtils.createDeploymentId(pkg, kronosAirlinePassenger, 
 					AthenaAirlinePassenger.class) + ".xml"; 
		}
		//-- compare results.
		System.out.println("\n\nResult of OTC file: " + otcFile);

//		String result = TestUtil.toXml(airlinePassenger); 
		String result = TestUtil.jaxbObjectToXML(airlinePassenger); 
		System.out.println("\n" + result);
		
		String expected = TestUtil.getTestCase(otcExpectedResultFile);
		Source control = Input.fromString(expected).build();

		Source test = Input.fromString(result).build();
		DifferenceEngine diff = new DOMDifferenceEngine();
		diff.addDifferenceListener(new ComparisonListener() {
	        public void comparisonPerformed(Comparison comparison, ComparisonResult outcome) {
	            Assert.fail("found a difference: " + comparison);
	        }
	    });
		diff.compare(control, test);
	}
 	
	private void compileAndDeploy() {
		// -- compile script and generated source code
		otcEngine.compileOtc();
		otcEngine.compileSourceCode();
		
		// -- register the generated .tmd and the executable files.
		otcEngine.register();
	}
	
}
