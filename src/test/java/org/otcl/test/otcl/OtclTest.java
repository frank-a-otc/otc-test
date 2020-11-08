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
	private static String pkg;
	
 	@Test
	public void test() {
 		
// 		pkg = "org.otcl";   
 		
		kronosAirlinePassenger = loadKronosXml();
		AthenaAirlinePassenger airlinePassenger = null;

//		for (int i = 0; i < 5; i++) {
		otclEngine.compileOtcl();
		otclEngine.compileSourceCode();
		otclEngine.deploy();
//		}
		try {
	//		for (int i = 0; i < 5; i++) {
				airlinePassenger = otclEngine.executeOtcl(pkg, kronosAirlinePassenger, AthenaAirlinePassenger.class, null);
				JAXBContext jaxbContext = JAXBContext.newInstance(AthenaAirlinePassenger.class);
				print(airlinePassenger, jaxbContext); 
	//		}
//			DateFields sourceDateFields = new DateFields();
//			DateFields targetDateFields = otclEngine.executeOtcl(pkg, sourceDateFields, DateFields.class, null);
//			JAXBContext jaxbContext = JAXBContext.newInstance(DateFields.class);
//			print(targetDateFields, jaxbContext); 
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
 	
}
