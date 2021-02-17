
package org.otcl.test.benchmark.mapstruct;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.bind.JAXBContext;

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
import org.otcl.test.AbstractTest;

import benchmark.test.ContractEmployee;
import benchmark.test.ContractEmployees;
import benchmark.test.PermanentEmployee;

public class JmhTest extends AbstractTest {

	private static ContractEmployee contractEmployee;
	private static ContractEmployees contractEmployees;
	private static JAXBContext jaxbContext;

	static {
		contractEmployee = new ContractEmployee();
		contractEmployee.setEmployeeName("Otcl-Jack");
		contractEmployees = new ContractEmployees();
		List<ContractEmployee> list = new ArrayList<>();
		contractEmployees.setEmployees(list);
		list.add(contractEmployee);
	}
	
	public static void main(String[] args) throws IOException  {
		org.openjdk.jmh.Main.main(args);
	}

    @State(Scope.Thread)
    public static class MyState {

    	public static int counter;
    	
    	@Setup(Level.Trial)
        public void doSetup() {
    		counter = 0;
    		System.out.println("initialized MapStruct test..............."); 
        }

        @TearDown(Level.Trial)
        public void doTearDown() {
        	System.out.println("\n\nTotal operations in this iteration - " + counter);
        }

    }
    
//    @Benchmark
//    @Fork(value = 1, warmups = 2)
//    @BenchmarkMode(Mode.Throughput)
//    @Warmup(iterations = 10, time = 500, timeUnit = TimeUnit.MILLISECONDS)
//    @Measurement(iterations = 50, time = 200, timeUnit = TimeUnit.MILLISECONDS)
    public void test(MyState myState) {
//    	MapstructContractEmployeesToPermananent mapper = Mappers.getMapper(MapstructContractEmployeesToPermananent.class);
    	MapstructContractToPermanentEmployee mapper = Mappers.getMapper(MapstructContractToPermanentEmployee.class);
		PermanentEmployee permanentEmployee = mapper.convertContractToPermanent(contractEmployee);
    }

}
