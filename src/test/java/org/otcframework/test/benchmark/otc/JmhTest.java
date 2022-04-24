
package org.otcframework.test.benchmark.otc;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.xml.bind.JAXBContext;

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
import org.otcframework.executor.OtcExecutor;
import org.otcframework.executor.OtcExecutorImpl;
import org.otcframework.executor.OtcRegistry;
import org.otcframework.executor.OtcRegistryImpl;

import benchmark.test.ContractEmployee;
import benchmark.test.ContractEmployees;
import benchmark.test.PermanentEmployee;

public class JmhTest {
	
	/** The Constant otcRegistry. */
	private static final OtcRegistry otcRegistry = OtcRegistryImpl.instance;
	
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

    @State(Scope.Thread)
    public static class MyState {
    	
    	@Setup(Level.Trial)
        public void doSetup() {
    		otcRegistry.register();
    		System.out.println("initialized OTC 2 test ..............."); 
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
//    	PermanentEmployee permanentEmployee = contractToPermananentEmployee.execute(contractEmployee, null, null);
		PermanentEmployee permanentEmployee = otcExecutor.execute(pkg, contractEmployee, PermanentEmployee.class,
				 null);
		return;
    }
    
}
