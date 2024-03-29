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

import com.athena.airlines.dto.AthenaAirlinePassenger;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.otcframework.common.OtcConstants;
import org.otcframework.common.util.OtcUtils;
import org.otcframework.executor.OtcExecutor;
import org.otcframework.executor.OtcExecutorImpl;
import org.otcframework.executor.OtcRegistry;
import org.otcframework.executor.OtcRegistryImpl;


class ExecutorCopyValuesOnlyTest extends AbstractExecutorTest {
	
	/** The Constant otcRegistry. */
	private static final OtcRegistry otcRegistry = OtcRegistryImpl.INSTANCE;

	@Test
	@Disabled
	void testExecuteCopyValuesOnly() {

		CompilerTest.compileOtcsFiles();
		//--comment out above line if source files are already generated

		CompilerTest.compileSourceCode();
		OtcExecutor otcExecutor = OtcExecutorImpl.getInstance();

		String pkg = "cpyvalues_string";

		AthenaAirlinePassenger airlinePassenger = otcExecutor.execute(pkg, AthenaAirlinePassenger.class, null);
//		DateFields dateFields = otcExecutor.execute(pkg, DateFields.class, null);

		String result = TestUtil.createXML(airlinePassenger);
//		String result = TestUtil.createJson(airlinePassenger);

		String otclFile = OtcUtils.createRegistryId(pkg, null, AthenaAirlinePassenger.class) +
				OtcConstants.OTC_SCRIPT_EXTN;
		System.out.println("\n\nResults for OTCL file: " + otclFile);
		System.out.println("\n" + result);

//		String otcExpectedResultFile = OtcUtils.createRegistryId(pkg, AthenaAirlinePassenger.class) + ".xml";
//		verify(otcExpectedResultFile, result);
	}

}
