
package org.otcl.test.benchmark;

import java.io.IOException;

import javax.xml.bind.JAXBContext;

import org.mapstruct.factory.Mappers;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;
import org.otcl.test.AbstractTest;
import org.otcl.test.mapstrut.KronosToAthenaMapStrutMapper;

import com.athena.airlines.dto.AthenaAirlinePassenger;
import com.kronos.airlines.dto.KronosAirlinePassenger;

public class MapStruct extends AbstractTest {

	private static KronosToAthenaMapStrutMapper mapper;
	private static KronosAirlinePassenger kronosAirlinePassenger;
	private static JAXBContext jaxbContext;

	static {
		kronosAirlinePassenger = loadKronosXml();
		mapper = Mappers.getMapper(KronosToAthenaMapStrutMapper.class);
//		try {
//			jaxbContext = JAXBContext.newInstance(AthenaAirlinePassenger.class);
//		} catch (JAXBException e) {
//			e.printStackTrace();
//		}
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
		AthenaAirlinePassenger airlinePassenger = mapper.convertKronosToAthena(kronosAirlinePassenger);
		myState.counter++;
//		print(airlinePassenger, jaxbContext); 
    }

}
