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

import java.io.File;

public class CompilerTest {

	private static final String OTC_HOME = OtcConfig.getOtcHomeLocation();

	/** The Constant otclCompiler. */
	private static final OtcsCompiler otcsCompiler = OtcsCompilerImpl.getInstance();
	
	@Test
	public void testCompile() {
		cleanupGeratedFiles();
		// -- compile script and generate source code
		otcsCompiler.compile();
		otcsCompiler.compileSourceCode();
	}

	private void cleanupGeratedFiles() {
		deleteRecursive(new File(OTC_HOME + File.separator + "tmd"));
		deleteRecursive(new File(OTC_HOME + File.separator + "src"));
		deleteRecursive(new File(OTC_HOME + File.separator + "target"));
	}

	private void deleteRecursive(File folder) {
		if (!folder.isDirectory()) {
			return;
		}
		File[] allContents = folder.listFiles();
		if (allContents != null) {
			for (File file : allContents) {
				if (file.isDirectory()) {
					deleteRecursive(file);
				} else {
					file.delete();
				}
			}
		}
		folder.delete();
	}
}
