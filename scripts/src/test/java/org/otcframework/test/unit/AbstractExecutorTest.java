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

import com.sun.xml.bind.v2.model.runtime.RuntimeTypeInfo;
import org.otcframework.test.exception.NotImplementedExceptiion;
import org.xmlunit.builder.Input;
import org.xmlunit.diff.*;

import javax.xml.transform.Source;

class AbstractExecutorTest {

	protected void verify(String compareWithFileName, String actualResult) {
		String expected = TestUtil.getTestCase(compareWithFileName);
		Source control = Input.fromString(expected).build();

		Source test = Input.fromString(actualResult).build();
		DifferenceEngine diff = new DOMDifferenceEngine();
		diff.addDifferenceListener(new ComparisonListener() {
	        public void comparisonPerformed(Comparison comparison, ComparisonResult outcome) {
//	            TODO - implement method
				throw new NotImplementedExceptiion();
	        }
	    });
		diff.compare(control, test);
	}
}
