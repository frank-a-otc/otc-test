
package org.otcl.test.benchmark.otcl2;

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
import org.otcl.test.AbstractTest;
import org.otcl2.common.config.OtclConfig;
import org.otcl2.common.engine.OtclEngine;
import org.otcl2.core.engine.OtclEngineImpl;

import com.athena.airlines.dto.AthenaAirlinePassenger;
import com.kronos.airlines.dto.KronosAirlinePassenger;

public class Otcl2Jmh extends AbstractTest {

	private static KronosAirlinePassenger kronosAirlinePassenger;
	private static OtclEngine otcl2Engine = (OtclEngineImpl) OtclEngineImpl.instance;
	private static JAXBContext jaxbContext;
	private static String otclFileName = "com.kronos.airlines.dto.KronosAirlinePassenger_com.athena.airlines.dto.AthenaAirlinePassenger.otcl";
	private static String pkg = "";

	static {
//		kronosAirlinePassenger = loadKronosXml();
//		try {
//			jaxbContext = JAXBContext.newInstance(AthenaAirlinePassenger.class);
//		} catch (JAXBException e) {
//			e.printStackTrace();
//		}
	}
	

	public static void main(String[] args) throws IOException  {
		org.openjdk.jmh.Main.main(args);
//		Otcl2 otcl2 = new Otcl2();
//		MyState myState = new MyState();
//		myState.doSetup();
//		otcl2.testOtcl(myState);
	}

    @State(Scope.Thread)
    public static class MyState {

    	public static int counter;
    	@Setup(Level.Trial)
        public void doSetup() {
			kronosAirlinePassenger = loadKronosXml();
    		OtclConfig.enableTestProfile();
    		otcl2Engine.deploy();
    		counter = 0;
    		System.out.println("initilized OTCL 2 test ..............."); 
        }

        @TearDown(Level.Trial)
        public void doTearDown() {
        	System.out.println("\n\nTotal operations in this iteration - " + counter);
        }
    }

    @Benchmark
    @Fork(value = 1, warmups = 2)
    @BenchmarkMode(Mode.Throughput)
    @Warmup(iterations = 10, time = 500, timeUnit = TimeUnit.MILLISECONDS)
    @Measurement(iterations = 50, time = 200, timeUnit = TimeUnit.MILLISECONDS)
	public void test(MyState myState) {
//		AthenaAirlinePassenger athenaAirlinePassenger = otcl2Engine.executeOtcl(pkg, otclFileName, kronosAirlinePassenger,
//				 null);
		myState.counter++;
//		print(airlinePassenger, jaxbContext); 
		return;
    }
    
}
