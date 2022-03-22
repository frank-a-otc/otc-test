package org.otcframework.test.unit;

import javax.xml.transform.Source;

import org.junit.jupiter.api.Test;
import org.otcframework.common.OtcConstants;
import org.otcframework.common.engine.OtcEngine;
import org.otcframework.common.util.OtcUtils;
import org.otcframework.core.engine.OtcEngineImpl;
import org.otcframework.core.engine.compiler.OtclCompiler;
import org.otcframework.core.engine.compiler.OtclCompilerImpl;
import org.otcframework.executor.OtcExecutor;
import org.otcframework.executor.OtcExecutorImpl;
import org.otcframework.executor.OtcRegistry;
import org.otcframework.executor.OtcRegistryImpl;
import org.xmlunit.builder.Input;
import org.xmlunit.diff.Comparison;
import org.xmlunit.diff.ComparisonListener;
import org.xmlunit.diff.ComparisonResult;
import org.xmlunit.diff.DOMDifferenceEngine;
import org.xmlunit.diff.DifferenceEngine;

import com.athena.airlines.dto.AthenaAirlinePassenger;
import com.kronos.airlines.dto.KronosAirlinePassenger;


public class OtcTest {

	/** The Constant otcEngine. */
	private static final OtcEngine otcEngine = OtcEngineImpl.getInstance();

	/** The Constant otclCompiler. */
	private static final OtclCompiler otclCompiler = OtclCompilerImpl.getInstance();
	
	/** The Constant otcRegistry. */
	private static final OtcRegistry otcRegistry = OtcRegistryImpl.instance;
	
	/** The Constant otcExecutor. */
	private static final OtcExecutor otcExecutor = OtcExecutorImpl.getInstance();

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

 		compileAndRegister();
 		
		String pkg = null; 
		String otclFile = null;
		AthenaAirlinePassenger airlinePassenger = null;
		String otcExpectedResultFile = null;
		
//		TEST_METHOD testMethod = TEST_METHOD.VALUES_TO_TARGET;
		TEST_METHOD testMethod = TEST_METHOD.SOURCE_TO_TARGET;
		pkg = "overrides";
		
 		if (testMethod == TEST_METHOD.VALUES_TO_TARGET) {
 			airlinePassenger = otcExecutor.execute(pkg, AthenaAirlinePassenger.class, null);
 			otcExpectedResultFile = OtcUtils.createRegistryId(pkg, null, AthenaAirlinePassenger.class) + ".xml"; 
 			otclFile = OtcUtils.createRegistryId(pkg, null, AthenaAirlinePassenger.class) +
 					OtcConstants.OTC_SCRIPT_EXTN; 
		} else if (testMethod == TEST_METHOD.SOURCE_TO_TARGET) {
 			KronosAirlinePassenger kronosAirlinePassenger = (KronosAirlinePassenger) TestUtil.loadKronosXml();
 			airlinePassenger = otcExecutor.execute(pkg, kronosAirlinePassenger, AthenaAirlinePassenger.class, null);
 			otcExpectedResultFile = OtcUtils.createRegistryId(pkg, kronosAirlinePassenger, 
 					AthenaAirlinePassenger.class) + ".xml"; 
 			otclFile = OtcUtils.createRegistryId(pkg, kronosAirlinePassenger, AthenaAirlinePassenger.class) +
 					OtcConstants.OTC_SCRIPT_EXTN; 
		}
		//-- compare results.
		System.out.println("\n\nResults for OTCL file: " + otclFile);
		String result = TestUtil.jaxbObjectToXML(airlinePassenger); 
		System.out.println("\n" + result);
		
//		verify(otcExpectedResultFile, result);

	}
 	
	private void compileAndRegister() {
		// -- compile script and generated source code
		otclCompiler.compile();
		otclCompiler.compileSourceCode();
		
		// -- register the generated .tmd and the executable files.
		otcRegistry.register();
	}
	
	private void verify(String compareWithFileName, String actualResult) {
		String expected = TestUtil.getTestCase(compareWithFileName);
		Source control = Input.fromString(expected).build();

		Source test = Input.fromString(actualResult).build();
		DifferenceEngine diff = new DOMDifferenceEngine();
		diff.addDifferenceListener(new ComparisonListener() {
	        public void comparisonPerformed(Comparison comparison, ComparisonResult outcome) {
//	            Assert.fail("found a difference: " + comparison);
	        }
	    });
		diff.compare(control, test);
	}
}
