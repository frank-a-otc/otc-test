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

import date.types.DateFields;
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


public class ExecutorCopySourceTest extends AbstractExecutorTest {
	
	/** The Constant otcRegistry. */
	private static final OtcRegistry otcRegistry = OtcRegistryImpl.INSTANCE;
	
	/** The Constant otcExecutor. */
	private static final OtcExecutor otcExecutor = OtcExecutorImpl.getInstance();

	private static final String OTC_HOME = OtcConfig.getOtcHomeLocation();

	@Test
	public void testExecute() {

		otcRegistry.register();
		String pkg = "cpysource_flatpath";

		String fileName = OTC_HOME + "test-samples" + File.separator + "Kronos-passenger-map.xml";
 		KronosAirlinePassenger kronosAirlinePassenger = TestUtil.loadXml(fileName, KronosAirlinePassenger.class);
		AthenaAirlinePassenger airlinePassenger = otcExecutor.execute(pkg, kronosAirlinePassenger, AthenaAirlinePassenger.class, null);

		String result = TestUtil.createXML(airlinePassenger);
//		String result = TestUtil.createJson(airlinePassenger);

		String otclFile = OtcUtils.createRegistryId(pkg, kronosAirlinePassenger, AthenaAirlinePassenger.class) +
				OtcConstants.OTC_SCRIPT_EXTN;
		System.out.println("\n\nResults for OTCL file: " + otclFile);
		System.out.println("\n" + result);

//		String otcExpectedResultFile = OtcUtils.createRegistryId(pkg, kronosAirlinePassenger,
//				AthenaAirlinePassenger.class) + ".xml";
//		verify(otcExpectedResultFile, result);

	}

}
