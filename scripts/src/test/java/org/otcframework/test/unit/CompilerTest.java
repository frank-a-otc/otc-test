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

import org.junit.jupiter.api.Test;
import org.otcframework.common.config.OtcConfig;
import org.otcframework.compiler.OtcsCompiler;
import org.otcframework.compiler.OtcsCompilerImpl;
import org.otcframework.compiler.SourceCodeCompiler;
import org.otcframework.compiler.SourceCodeCompilerImpl;
import org.otcframework.executor.OtcRegistryImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class CompilerTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(OtcRegistryImpl.class);

	private static final String OTC_HOME = OtcConfig.getOtcHomeDirectory();

	private static final OtcsCompiler OTCS_COMPILER = new OtcsCompilerImpl();

	private static final SourceCodeCompiler SOURCE_CODE_COMPILER = new SourceCodeCompilerImpl();

	@Test
	void testCompile() {
		compile();
	}

	public static void compile() {
		compileOtcsFiles();
		if (OtcConfig.isDefaultLocations()) {
			compileSourceCode();
		}
	}
	public static void compileOtcsFiles() {
		// -- compile script and generate source code
		OTCS_COMPILER.compileOtcsFiles();
	}

	public static void compileSourceCode() {
		// -- compile script and generate source code
		SOURCE_CODE_COMPILER.compileSourceCode();
	}

}
