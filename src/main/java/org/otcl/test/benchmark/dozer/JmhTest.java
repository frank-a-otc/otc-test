
package org.otcl.test.benchmark.dozer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.bind.JAXBContext;

import org.dozer.DozerBeanMapper;
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
import benchmark.test.PermanentEmployee;

public class JmhTest extends AbstractTest {

	private static ContractEmployee contractEmployee;
	private static DozerBeanMapper  mapper;
	private static JAXBContext jaxbContext;
	private static String pkg = "";

	static {
		contractEmployee = new ContractEmployee();
		contractEmployee.setEmployeeName("Dozer-Jack");
	}
	

	public static void main(String[] args) throws IOException  {
		org.openjdk.jmh.Main.main(args);
	}

    @State(Scope.Thread)
    public static class MyState {

    	public static int counter;
    	@Setup(Level.Trial)
        public void doSetup() {
            List<String> list = new ArrayList<String>();
            list.add("dozer-mapping.xml");

    	    mapper = new DozerBeanMapper(list);
    		counter = 0;
    		System.out.println("initialized Dozer test ..............."); 
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
		PermanentEmployee permanentEmployee = mapper.map(contractEmployee, PermanentEmployee.class);
		return;
    }
    
}
