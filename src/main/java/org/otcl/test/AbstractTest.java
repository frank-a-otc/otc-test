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

import org.otcl2.common.config.OtclConfig;

import com.kronos.airlines.dto.KronosAirlinePassenger;

public abstract class AbstractTest {

	private static String otclHome = OtclConfig.getOtclHomeLocation();

	protected static KronosAirlinePassenger loadKronosXml() {
		KronosAirlinePassenger kronosAirlinePassenger = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(KronosAirlinePassenger.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			String fileName = otclHome + "\\test-samples\\Kronos-passenger-map.xml";
			String xml = new String(Files.readAllBytes(Paths.get(fileName)));
			StringReader reader = new StringReader(xml);
			kronosAirlinePassenger = (KronosAirlinePassenger) unmarshaller.unmarshal(reader);
			
//			List<Travelers.Traveler> travelers = kronosAirlinePassenger.getTravelers().getTraveler();
//			for (int idx = 0; idx < travelers.size(); idx++) {
//				Travelers.Traveler traveler = travelers.get(idx);
////				Map<Integer, TravelerDetailType> mapTravelerDetailTypes = new HashMap<>();
////				traveler.setRecognizedTravelerMap(mapTravelerDetailTypes);
////				TravelerDetailType travelerDetailType = new TravelerDetailType();
////				mapTravelerDetailTypes.put(Integer.valueOf(idx), travelerDetailType);
////				travelerDetailType.setName(traveler.getRecognizedTraveler().get(0).getName());
////				
////				Map<String, AnonymousTravelerType> mapAnonymousTravelerTypes = new HashMap<>();
////				traveler.setAnonymousTravelerMap(mapAnonymousTravelerTypes);
////				AnonymousTravelerType anonymousTravelerType = new AnonymousTravelerType();
////				mapAnonymousTravelerTypes.put(Integer.toString(idx), anonymousTravelerType);
////				anonymousTravelerType.setAge(traveler.getAnonymousTraveler().get(0).getAge());
////				anonymousTravelerType.setPTC(traveler.getAnonymousTraveler().get(0).getPTC());
//				Map<AnonymousTravelerType, TravelerDetailType> customObjectsMap = new HashMap<>();
//				traveler.setCustomObjectsMap(customObjectsMap);
//				AnonymousTravelerType anonymousTravelerType = new AnonymousTravelerType();
//				TravelerDetailType travelerDetailType = new TravelerDetailType();
//				customObjectsMap.put(anonymousTravelerType, travelerDetailType);
//				anonymousTravelerType.setResidenceCode("560300");
//				TravelerSummaryType.Name name = new TravelerSummaryType.Name();
//				travelerDetailType.setName(name);
//				TravelerSummaryType.Name.Given given = new TravelerSummaryType.Name.Given();
//				name.getGiven().add(given);
//				given.setValue("Anand K");
//			}
//			print(kronosAirlinePassenger, jaxbContext); 
		} catch (IOException | JAXBException | FactoryConfigurationError ex) {
			ex.printStackTrace();
		}
		return kronosAirlinePassenger;

	}
	
	protected static void print(Object value, JAXBContext jaxbContext)  {
		try {
			Marshaller marshaller = jaxbContext.createMarshaller();
			StringWriter stringWriter = new StringWriter();
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.marshal(value, stringWriter);
			String xml = stringWriter.toString();
			System.out.println(xml);
		} catch (JAXBException | FactoryConfigurationError e) {
			e.printStackTrace();
		}
	}
}
