package org.otcl.test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import org.otcl.test.dto.ContractEmployee;
import org.otcl2.common.config.OtclConfig;

import com.kronos.airlines.dto.KronosAirlinePassenger;

public abstract class AbstractTest {

	private static String otclHome = OtclConfig.getOtclHomeLocation();

	protected static ContractEmployee loadContractEmployeeFromXml() {
		ContractEmployee contractEmployee = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ContractEmployee.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			String fileName = otclHome + "\\otcl-test-source\\samples\\ContractEmployee.xml";
			String xml = new String(Files.readAllBytes(Paths.get(fileName)));
			StringReader reader = new StringReader(xml);
			contractEmployee = (ContractEmployee) unmarshaller.unmarshal(reader);
		} catch (IOException | JAXBException | FactoryConfigurationError ex) {
			ex.printStackTrace();
		}
		return contractEmployee;
	}

	protected static KronosAirlinePassenger loadKronosXml() {
		KronosAirlinePassenger kronosAirlinePassenger = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(KronosAirlinePassenger.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			String fileName = otclHome + "\\QA-test-cases\\samples\\Kronos-passenger-map.xml";
			String xml = new String(Files.readAllBytes(Paths.get(fileName)));
			StringReader reader = new StringReader(xml);
			kronosAirlinePassenger = (KronosAirlinePassenger) unmarshaller.unmarshal(reader);
			
	//		List<Travelers.Traveler> travelers = kronosAirlinePassenger.getTravelers().getTraveler();
	//		for (int idx = 0; idx < travelers.size(); idx++) {
	//			Travelers.Traveler traveler = travelers.get(idx);
	//			Map<Integer, TravelerDetailType> mapTravelerDetailTypes = new HashMap<>();
	//			traveler.setRecognizedTravelerMap(mapTravelerDetailTypes);
	//			TravelerDetailType travelerDetailType = new TravelerDetailType();
	//			mapTravelerDetailTypes.put(Integer.valueOf(idx), travelerDetailType);
	//			travelerDetailType.setName(traveler.getRecognizedTraveler().get(0).getName());
	//			
	//			Map<Object, AnonymousTravelerType> mapAnonymousTravelerTypes = new HashMap<>();
	//			traveler.setAnonymousTravelerMap(mapAnonymousTravelerTypes);
	//			AnonymousTravelerType anonymousTravelerType = new AnonymousTravelerType();
	//			mapAnonymousTravelerTypes.put(Integer.valueOf(idx), anonymousTravelerType);
	//			anonymousTravelerType.setAge(traveler.getAnonymousTraveler().get(0).getAge());
	//			anonymousTravelerType.setPTC(traveler.getAnonymousTraveler().get(0).getPTC());
	//		}
	//		print(kronosAirlinePassenger, jaxbContext); 
		} catch (IOException | JAXBException | FactoryConfigurationError ex) {
			ex.printStackTrace();
		}
		return kronosAirlinePassenger;

	}
	
	protected void print(Object value, JAXBContext jaxbContext)  {
		try {
			Marshaller marshaller = jaxbContext.createMarshaller();
			StringWriter stringWriter = new StringWriter();
			XMLStreamWriter xmlStreamWriter = XMLOutputFactory.newInstance().createXMLStreamWriter(stringWriter); 
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			marshaller.marshal(value, xmlStreamWriter);
			String xml = stringWriter.toString();
			System.out.println(xml);
		} catch (JAXBException | XMLStreamException | FactoryConfigurationError e) {
			e.printStackTrace();
		}
	}
}
