package org.otcl.test.unit;

import javax.xml.bind.JAXBContext;

import org.junit.Test;
import org.otcl.test.AbstractTest;
import org.otcl2.common.engine.OtclEngine;
import org.otcl2.core.engine.OtclEngineImpl;

import com.athena.airlines.dto.AthenaAirlinePassenger;
import com.kronos.airlines.dto.KronosAirlinePassenger;

public class OtclTest extends AbstractTest {

	private static OtclEngine otclEngine = OtclEngineImpl.instance;
	
	private static enum TEST_METHOD {
		VALUES_TO_TARGET, 
		SOURCE_TO_TARGET
	}
	private static TEST_METHOD testMethod = TEST_METHOD.VALUES_TO_TARGET;
	private static String pkg = "cpyvalues1";

	@Test
	public void runTest() {
		
 		compileAndDeploy();
 		
		AthenaAirlinePassenger airlinePassenger = null;
 		if (TEST_METHOD.VALUES_TO_TARGET == testMethod) {
 			airlinePassenger = otclEngine.executeOtcl(pkg, AthenaAirlinePassenger.class, null);
 		} else if (TEST_METHOD.SOURCE_TO_TARGET == testMethod) {
 			KronosAirlinePassenger kronosAirlinePassenger = loadKronosXml();
 			airlinePassenger = otclEngine.executeOtcl(pkg, kronosAirlinePassenger, AthenaAirlinePassenger.class, null);
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
	
}
