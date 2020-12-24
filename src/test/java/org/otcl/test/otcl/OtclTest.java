package org.otcl.test.otcl;

import javax.xml.bind.JAXBContext;

import org.junit.jupiter.api.Test;
import org.otcl.test.AbstractTest;
import org.otcl2.common.engine.OtclEngine;
import org.otcl2.core.engine.OtclEngineImpl;

import com.athena.airlines.dto.AthenaAirlinePassenger;
import com.kronos.airlines.dto.KronosAirlinePassenger;

public class OtclTest extends AbstractTest {

	private static KronosAirlinePassenger kronosAirlinePassenger;
	private static OtclEngine otclEngine = OtclEngineImpl.instance;
	
	private void compileAndDeploy() {
		// -- compile script and generated source code
		otclEngine.compileOtcl();
		otclEngine.compileSourceCode();
		
		// -- deploy the generated .dep files.
		otclEngine.deploy();
	}
	
// 	@Test
	public void testCopyValues() {
 		
 		compileAndDeploy();
		AthenaAirlinePassenger airlinePassenger = null;
		
 		String pkg = null;
		try {
			// -- execute ID - "com.athena.airlines.dto.AthenaAirlinePassenger.otcl" (CopyValues)
	 		pkg = "scenario2";   
			airlinePassenger = otclEngine.executeOtcl(pkg, AthenaAirlinePassenger.class, null);

			JAXBContext jaxbContext = JAXBContext.newInstance(AthenaAirlinePassenger.class);
			print(airlinePassenger, jaxbContext); 
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
 	@Test
	public void testCopyKronosToAthena() {
 		
 		compileAndDeploy();
		kronosAirlinePassenger = loadKronosXml();
		
		AthenaAirlinePassenger airlinePassenger = null;
 		String pkg = null;
		try {
//			-- execute ID - "org / otcl / com.kronos.airlines.dto.KronosAirlinePassenger_com.athena.airlines.dto.AthenaAirlinePassenger.otcl".
//	 		-- Copy from  KronosAirlinePassenger to AthenaAirlinePassenger
			
	 		pkg = "scenario5";   
			airlinePassenger = otclEngine.executeOtcl(pkg, kronosAirlinePassenger, AthenaAirlinePassenger.class, null);

			JAXBContext jaxbContext = JAXBContext.newInstance(AthenaAirlinePassenger.class);
			print(airlinePassenger, jaxbContext); 
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
