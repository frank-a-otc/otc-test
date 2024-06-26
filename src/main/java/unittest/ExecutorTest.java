/**
* Copyright (c) otcframework.org
*
* @author  Franklin J Abel
* @version 1.0
* @since   2020-06-08 
*
* This file is part of the OTC framework.
* 
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      https://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*
*/
package unittest;

import java.io.File;

import com.athena.airlines.dto.AthenaAirlinePassenger;
import com.kronos.airlines.dto.KronosAirlinePassenger;
import org.junit.jupiter.api.Test;
import org.otcframework.common.OtcConstants;
import org.otcframework.common.config.OtcConfig;
import org.otcframework.common.util.OtcUtils;
import org.otcframework.executor.OtcExecutor;
import org.otcframework.executor.OtcExecutorImpl;
//import org.xmlunit.builder.Input;
//import org.xmlunit.diff.Comparison;
//import org.xmlunit.diff.ComparisonListener;
//import org.xmlunit.diff.ComparisonResult;
//import org.xmlunit.diff.DOMDifferenceEngine;
//import org.xmlunit.diff.DifferenceEngine;


class ExecutorTest {

	private enum OUTPUT_TYPE {
		XML,
		JSON
	}
	
	private static final String RESOURCES_LOCATION = OtcConfig.getOtcConfigLocation();

	private static final OtcExecutor otcExecutor = OtcExecutorImpl.getInstance();

	ExecutorTest() { }

	@Test
	void runCopyFromSourceObjectTestCases() {

		String pkg = "cpysource_mixedpath";
		OUTPUT_TYPE outputType = OUTPUT_TYPE.XML;

		String fileName = RESOURCES_LOCATION + File.separator + "test-samples" + File.separator + "Kronos-passenger-map.xml";
		KronosAirlinePassenger kronosAirlinePassenger = TestUtil.loadXml(fileName, KronosAirlinePassenger.class);

		//----------------------------------------------------------------------------------
		// --- this below single line is the only code what you need to write in your actual project.
		AthenaAirlinePassenger airlinePassenger = otcExecutor.copyFromSource(pkg, kronosAirlinePassenger,
				AthenaAirlinePassenger.class, null);
		//----------------------------------------------------------------------------------

		String otcsFile = OtcUtils.createRegistryId(pkg, kronosAirlinePassenger, AthenaAirlinePassenger.class) +
				OtcConstants.OTC_SCRIPT_EXTN;
		System.out.println("Executed test case - " + otcsFile);
		printOutput(airlinePassenger, otcsFile, outputType);

//		String otcExpectedResultFileName = OtcUtils.createRegistryId(pkg, kronosAirlinePassenger,
//				AthenaAirlinePassenger.class) + ".xml";
//		assert verify(otcExpectedResultFile, result);
	}

	@Test
	void runCopyFromLiteralsTestCases() {

		String pkg = "cpyvalues_string";
		OUTPUT_TYPE outputType = OUTPUT_TYPE.XML;

		//----------------------------------------------------------------------------------
		// --- this below single line is the only code what you need to write in your actual project.
		AthenaAirlinePassenger airlinePassenger = otcExecutor.copyFromLiterals(pkg, AthenaAirlinePassenger.class);
		//----------------------------------------------------------------------------------

		String otcsFile = OtcUtils.createRegistryId(pkg, null, AthenaAirlinePassenger.class) +
				OtcConstants.OTC_SCRIPT_EXTN;
		System.out.println("Executed test case - " + otcsFile);
		printOutput(airlinePassenger, otcsFile, outputType);

//		DateFields dateFields = otcExecutor.execute(pkg, DateFields.class, null);
//		String otcExpectedResultFileName = OtcUtils.createRegistryId(pkg, AthenaAirlinePassenger.class) + ".xml";
//		assert verify(otcExpectedResultFile, result);
	}

	private void printOutput(AthenaAirlinePassenger airlinePassenger, String otcsFile, OUTPUT_TYPE outputType) {
		//-- compare results.
		String result = null;
		if (outputType == OUTPUT_TYPE.XML) {
			result = TestUtil.createXML(airlinePassenger);
		} else {
			result = TestUtil.createJson(airlinePassenger);
		}
		System.out.println("\n\nResults for OTCL file: " + otcsFile);
		System.out.println("\n" + result);

	}

//	/**
//	 * Verify.
//	 *
//	 * @param compareWithFileName the compare with file name
//	 * @param actualResult the actual result
//	 */
//	private true verify(String compareWithFileName, String actualResult) {
//		String expected = TestUtil.getTestCase(compareWithFileName);
//		Source control = Input.fromString(expected).build();
//
//		Source test = Input.fromString(actualResult).build();
//		DifferenceEngine diff = new DOMDifferenceEngine();
//		diff.addDifferenceListener(new ComparisonListener() {
//	        public void comparisonPerformed(Comparison comparison, ComparisonResult outcome) {
////	            TODO - throw exception if both are not the same DOM document
//	        }
//	    });
//		diff.compare(control, test);
//	    return true;
//	}
}
