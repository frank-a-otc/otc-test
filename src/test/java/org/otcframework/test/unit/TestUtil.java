/**
* Copyright (c) otcframework.org
*
* @author  Franklin J Abel
* @version 1.0
* @since   2020-06-08 
*
* This file is part of the OTC framework.
* 
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      https://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*
*/
package org.otcframework.test.unit;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.FactoryConfigurationError;

import org.apache.commons.io.IOUtils;
import org.otcframework.common.config.OtcConfig;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kronos.airlines.dto.KronosAirlinePassenger;

public class TestUtil {
	
    public static final Path EXPECTED_RESULT_PATH = Paths.get(OtcConfig.getTestCaseExpectedResultLocation());

	private static final String OTC_HOME = OtcConfig.getOtcHomeLocation();
	
	private static final ObjectMapper objectMapper = new ObjectMapper();
	private static final String sampleFileName = OTC_HOME + File.separator + "test-samples" + File.separator +
			"Kronos-passenger-map.xml";
	
	static {
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		objectMapper.setSerializationInclusion(Include.NON_EMPTY);
	}

	protected static KronosAirlinePassenger loadKronosXml() {
		KronosAirlinePassenger kronosAirlinePassenger = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(KronosAirlinePassenger.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			String xml = new String(Files.readAllBytes(Paths.get(sampleFileName)));
			StringReader reader = new StringReader(xml);
			kronosAirlinePassenger = (KronosAirlinePassenger) unmarshaller.unmarshal(reader); 
		} catch (IOException | JAXBException | FactoryConfigurationError ex) {
			ex.printStackTrace();
		}
		return kronosAirlinePassenger;
	}
	
    public static String createXML(Object jaxbObject)  {
    	String xml = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(jaxbObject.getClass());
			Marshaller marshaller = jaxbContext.createMarshaller();
			StringWriter stringWriter = new StringWriter();
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.marshal(jaxbObject, stringWriter);
			xml = stringWriter.toString();
		} catch (JAXBException | FactoryConfigurationError e) {
			e.printStackTrace();
		}
		return xml;
	}

    public static String createJson(Object object)  {
    	String json = null;
		try {
			json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
    	return json;
    }
    
    public static String getTestCase(String testcaseFilePath){
        try {
            FileInputStream fis = new FileInputStream(EXPECTED_RESULT_PATH.resolve(testcaseFilePath).toString());
            return IOUtils.toString(fis, "UTF-8");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String args[]) {
		ObjectMapper objectMapper = new ObjectMapper();
		FileOutputStream fos;
		KronosAirlinePassenger kronosAirlinePassenger = loadKronosXml();
		try {
			byte[] bytes = objectMapper.writeValueAsBytes(kronosAirlinePassenger);
			String str = objectMapper.writeValueAsString(kronosAirlinePassenger);
			File file = new File("d:/test-text-binary.bin");
			if (!file.exists()) {
				file.createNewFile();
			}
			fos = new FileOutputStream(file);
			PrintWriter printWriter = new PrintWriter(file);
			DataOutputStream dataOutputStream = new DataOutputStream(fos);
			ObjectOutputStream ous = new ObjectOutputStream(dataOutputStream);
			printWriter.write(str);
			printWriter.flush();
			printWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
}
