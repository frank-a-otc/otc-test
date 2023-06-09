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
package org.otcframework.test.unit;

import java.io.File;

import javax.xml.transform.Source;

import org.junit.jupiter.api.Test;
import org.otcframework.common.OtcConstants;
import org.otcframework.common.config.OtcConfig;
import org.otcframework.common.util.OtcUtils;
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


public class ExecutorTest {
	
	/** The Constant otcRegistry. */
	private static final OtcRegistry otcRegistry = OtcRegistryImpl.instance;
	
	/** The Constant otcExecutor. */
	private static final OtcExecutor otcExecutor = OtcExecutorImpl.getInstance();

	private static enum OTCS_COMMAND_TYPE {
		FROM_VALUES, 
		FROM_SOURCE_OBJECT  
	}
	
	private enum OUTPUT_TYPE {
		XML,
		JSON
	}
	
	private static final String OTC_HOME = OtcConfig.getOtcHomeLocation();

	// - set 'otcsCommandType' to OTCS_COMMAND_TYPE.FROM_VALUES when the OTC file has 'from: values:' only and does 
	//    not have even a single reference to a source object
	// 
	//   set 'otcsCommandType' to  OTCS_COMMAND_TYPE.FROM_SOURCE_OBJECT when the OTC file has references to a source object 
	//    with or without 'from: values:'.
	

	@Test
	public void testExecute() {

		otcRegistry.register();
		OTCS_COMMAND_TYPE otcsCommandType;
		OUTPUT_TYPE outputType;
		String pkg = null; 
		String otclFile = null;
		AthenaAirlinePassenger airlinePassenger = null;
		String otcExpectedResultFile = null;
		
		otcsCommandType = OTCS_COMMAND_TYPE.FROM_VALUES;
//		otcsCommandType = OTCS_COMMAND_TYPE.FROM_SOURCE_OBJECT;
		pkg = "cpyvalues4";
		outputType= OUTPUT_TYPE.XML;
		
 		if (otcsCommandType == OTCS_COMMAND_TYPE.FROM_VALUES) {
 			airlinePassenger = otcExecutor.execute(pkg, AthenaAirlinePassenger.class, null);
 			otcExpectedResultFile = OtcUtils.createRegistryId(pkg, AthenaAirlinePassenger.class) + ".xml"; 
 			otclFile = OtcUtils.createRegistryId(pkg, null, AthenaAirlinePassenger.class) +
 					OtcConstants.OTC_SCRIPT_EXTN; 
		} else if (otcsCommandType == OTCS_COMMAND_TYPE.FROM_SOURCE_OBJECT) {
			String fileName = OTC_HOME + File.separator + "test-samples" + File.separator +
					"Kronos-passenger-map.xml";
 			KronosAirlinePassenger kronosAirlinePassenger = TestUtil.loadXml(fileName, KronosAirlinePassenger.class);
 			airlinePassenger = otcExecutor.execute(pkg, kronosAirlinePassenger, AthenaAirlinePassenger.class, null);
 			otcExpectedResultFile = OtcUtils.createRegistryId(pkg, kronosAirlinePassenger, 
 					AthenaAirlinePassenger.class) + ".xml"; 
 			otclFile = OtcUtils.createRegistryId(pkg, kronosAirlinePassenger, AthenaAirlinePassenger.class) +
 					OtcConstants.OTC_SCRIPT_EXTN; 
		}
		//-- compare results.
		String result = null;
		if (outputType == OUTPUT_TYPE.XML) {
			result = TestUtil.createXML(airlinePassenger); 
		} else {
			result = TestUtil.createJson(airlinePassenger); 
		}
		System.out.println("\n\nResults for OTCL file: " + otclFile);
		System.out.println("\n" + result);
		
//		verify(otcExpectedResultFile, result);

	}
 	
	/**
	 * Verify.
	 *
	 * @param compareWithFileName the compare with file name
	 * @param actualResult the actual result
	 */
	private void verify(String compareWithFileName, String actualResult) {
		String expected = TestUtil.getTestCase(compareWithFileName);
		Source control = Input.fromString(expected).build();

		Source test = Input.fromString(actualResult).build();
		DifferenceEngine diff = new DOMDifferenceEngine();
		diff.addDifferenceListener(new ComparisonListener() {
	        public void comparisonPerformed(Comparison comparison, ComparisonResult outcome) {
//	            TODO
	        }
	    });
		diff.compare(control, test);
	}
}
