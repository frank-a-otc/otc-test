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
package org.otcframework.test.benchmark.otc;

import java.io.IOException;

import javax.xml.bind.JAXBContext;

import org.otcframework.executor.OtcExecutor;
import org.otcframework.executor.OtcExecutorImpl;
import org.otcframework.executor.OtcRegistry;
import org.otcframework.executor.OtcRegistryImpl;

import benchmark.dto.ContractEmployee;
import benchmark.dto.ContractEmployees;
import benchmark.dto.PermanentEmployee;

public class JmhTest {
	
	/** The Constant otcRegistry. */
	private static final OtcRegistry otcRegistry = OtcRegistryImpl.INSTANCE;
	
	/** The Constant otcExecutor. */
	private static final OtcExecutor otcExecutor = OtcExecutorImpl.getInstance();

	private static ContractEmployee contractEmployee;
	private static ContractEmployees contractEmployees;
	private static JAXBContext jaxbContext;
	private static String pkg = "";
//	private static ContractToPermananentEmployee contractToPermananentEmployee;

	static {
		contractEmployee = new ContractEmployee();
		contractEmployee.setEmployeeName("Otc-Jack");
//		contractEmployees = new ContractEmployees();
//		List<ContractEmployee> list = new ArrayList<>();
//		contractEmployees.setEmployees(list);
//		list.add(contractEmployee);
	}
	

	public static void main(String[] args) throws IOException  {
		org.openjdk.jmh.Main.main(args);
	}

//    @State(Scope.Thread)
    public static class MyState {
    	
//    	@Setup(Level.Trial)
        public void doSetup() {
    		otcRegistry.register();
    		System.out.println("initialized OTC 2 test ..............."); 
        }

//        @TearDown(Level.Trial)
        public void doTearDown() {
        }
    }

//    @Benchmark
//    @Fork(value = 1, warmups = 2)
//    @BenchmarkMode(Mode.Throughput)
//    @Warmup(iterations = 10, time = 500, timeUnit = TimeUnit.MILLISECONDS)
//    @Measurement(iterations = 50, time = 200, timeUnit = TimeUnit.MILLISECONDS)
	public void test(MyState myState) {
//    	PermanentEmployee permanentEmployee = contractToPermananentEmployee.execute(contractEmployee, null, null);
		PermanentEmployee permanentEmployee = otcExecutor.copyFromSource(pkg, contractEmployee, PermanentEmployee.class,
				 null);
		return;
    }
    
}
