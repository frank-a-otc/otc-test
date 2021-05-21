package org.otcl.test.unit;

import org.apache.commons.io.IOUtils;
import org.otcl2.common.config.OtclConfig;

import com.kronos.airlines.dto.KronosAirlinePassenger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.FactoryConfigurationError;

public class TestUtil {
    public static final Path EXPECTED_RESULT_PATH = Paths.get(OtclConfig.getTestCaseExpectedResultLocation());

	private static final String OTCL_HOME = OtclConfig.getOtclHomeLocation();

	protected static KronosAirlinePassenger loadKronosXml() {
		KronosAirlinePassenger kronosAirlinePassenger = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(KronosAirlinePassenger.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			String fileName = OTCL_HOME + File.separator + "test-samples" + File.separator + "Kronos-passenger-map.xml";
			String xml = new String(Files.readAllBytes(Paths.get(fileName)));
			StringReader reader = new StringReader(xml);
			kronosAirlinePassenger = (KronosAirlinePassenger) unmarshaller.unmarshal(reader); 
		} catch (IOException | JAXBException | FactoryConfigurationError ex) {
			ex.printStackTrace();
		}
		return kronosAirlinePassenger;

	}
	
    public static String getTestCase(String testcaseFilePath){
        try {
            FileInputStream fis = new FileInputStream(EXPECTED_RESULT_PATH.resolve(testcaseFilePath).toString());
            return IOUtils.toString(fis, "UTF-8");
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
