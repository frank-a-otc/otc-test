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
package org.otcframework.test.benchmark.mapstruct;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.xml.bind.JAXBContext;

import benchmark.transformers.mapstruct.MapstructContractToPermanentEmployee;
import org.mapstruct.factory.Mappers;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;
import org.openjdk.jmh.annotations.Warmup;

import benchmark.dto.ContractEmployee;
import benchmark.dto.ContractEmployees;
import benchmark.dto.PermanentEmployee;

public class JmhTest {

	private static ContractEmployee contractEmployee;
	private static ContractEmployees contractEmployees;
	private static JAXBContext jaxbContext;

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

    @State(Scope.Thread)
    public static class MyState {
    	
    	@Setup(Level.Trial)
        public void doSetup() {
    		System.out.println("initialized MapStruct test..............."); 
        }

        @TearDown(Level.Trial)
        public void doTearDown() {
        }

    }
    
    @Benchmark
    @Fork(value = 1, warmups = 2)
    @BenchmarkMode(Mode.Throughput)
    @Warmup(iterations = 10, time = 500, timeUnit = TimeUnit.MILLISECONDS)
    @Measurement(iterations = 50, time = 200, timeUnit = TimeUnit.MILLISECONDS)
    public void test(MyState myState) {
//    	MapstructContractEmployeesToPermanent mapper = Mappers.getMapper(MapstructContractEmployeesToPermananent.class);
    	MapstructContractToPermanentEmployee mapper = Mappers.getMapper(MapstructContractToPermanentEmployee.class);
		PermanentEmployee permanentEmployee = mapper.convertContractToPermanent(contractEmployee);
    }

}
