package org.otcl.test.otcl;

import java.io.IOException;
import java.util.Collection;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLStreamException;

import org.junit.jupiter.api.Test;
import org.otcl.test.AbstractTest;
import org.otcl2.common.engine.OtclEngine;
import org.otcl2.common.engine.compiler.CompilationReport;
import org.otcl2.core.engine.OtclEngineImpl;

import com.athena.airlines.dto.AthenaAirlinePassenger;
import com.kronos.airlines.dto.KronosAirlinePassenger;

public class OtclTest extends AbstractTest {

	private static KronosAirlinePassenger kronosAirlinePassenger;
	private static OtclEngine otclEngine = OtclEngineImpl.instance;
	
 	@Test
	public void executeXmlTest() throws JAXBException, IOException, XMLStreamException, FactoryConfigurationError, InstantiationException, IllegalAccessException, ClassNotFoundException {

//		for (int i = 0; i < 5; i++) {
			Collection<CompilationReport> compilationReports = otclEngine.deploy();
//		}
		kronosAirlinePassenger = loadKronosXml();
		AthenaAirlinePassenger airlinePassenger = null;
//		for (int i = 0; i < 5; i++) {
			airlinePassenger = otclEngine.executeOtcl(AthenaAirlinePassenger.class, kronosAirlinePassenger, null);
//		}
		JAXBContext jaxbContext = JAXBContext.newInstance(AthenaAirlinePassenger.class);
		print(airlinePassenger, jaxbContext); 
	}
	
}
