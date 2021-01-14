package org.otcl.test.unit;

import javax.xml.bind.JAXBContext;

import org.junit.jupiter.api.Test;
import org.otcl.test.AbstractTest;
import org.otcl2.common.engine.OtclEngine;
import org.otcl2.core.engine.OtclEngineImpl;

import com.athena.airlines.dto.AthenaAirlinePassenger;
import com.kronos.airlines.dto.KronosAirlinePassenger;

public class OtclTest extends AbstractTest {

	private static OtclEngine otclEngine = OtclEngineImpl.instance;
	
	private static enum TEST_METHOD {
		COPY_VALUES, 
		COPY_FROM_SOURCE
	}

	@Test
	public void runTest() {
 		TEST_METHOD testMethod = TEST_METHOD.COPY_FROM_SOURCE;
 		
		AthenaAirlinePassenger airlinePassenger = null;
 		if (TEST_METHOD.COPY_VALUES == testMethod) {
 			airlinePassenger = testCopyValues("cpyvalues2");
 		} else {
 			airlinePassenger = testCopyKronosToAthena("cpysource_collection");
 		}
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(AthenaAirlinePassenger.class);
			print(airlinePassenger, jaxbContext); 
		} catch (Exception ex) {
			ex.printStackTrace();
		}
 	}
 	
	private void compileAndDeploy() {
		// -- compile script and generated source code
		otclEngine.compileOtcl();
		otclEngine.compileSourceCode();
		
		// -- register the generated .tmd and the executable files.
		otclEngine.register();
	}
	
 	private AthenaAirlinePassenger testCopyValues(String pkg) {
 		compileAndDeploy();
		AthenaAirlinePassenger airlinePassenger = otclEngine.executeOtcl(pkg, AthenaAirlinePassenger.class, null);
		return airlinePassenger;
	}
	
	private AthenaAirlinePassenger testCopyKronosToAthena(String pkg) {
 		compileAndDeploy();
		KronosAirlinePassenger kronosAirlinePassenger = loadKronosXml();
		AthenaAirlinePassenger airlinePassenger = otclEngine.executeOtcl(pkg, kronosAirlinePassenger, AthenaAirlinePassenger.class, null);
		return airlinePassenger;
	}

}
