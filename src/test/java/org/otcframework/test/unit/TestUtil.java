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

import com.kronos.airlines.dto.KronosAirlinePassenger;
import org.apache.commons.io.IOUtils;
import org.otcframework.common.config.OtcConfig;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestUtil {
	
    public static final Path EXPECTED_RESULT_PATH = Paths.get(OtcConfig.getTestCaseExpectedResultDirectoryPath());
	
	private static final ObjectMapper objectMapper = new ObjectMapper();

	static {
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		objectMapper.setSerializationInclusion(Include.NON_EMPTY);
	}

	/**
	 * Load xml.
	 *
	 * @param <T> the generic type
	 * @param fileName the file name
	 * @param cls the cls
	 * @return the t
	 */
	protected static <T> T loadXml(String fileName, Class<T> cls) {
		T t = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(cls);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			String xml = new String(Files.readAllBytes(Paths.get(fileName)));
			StringReader reader = new StringReader(xml);
			t = (T) unmarshaller.unmarshal(reader); 
		} catch (IOException | JAXBException | FactoryConfigurationError ex) {
			ex.printStackTrace();
		}
		return t;
	}
	
    /**
     * Creates the XML.
     *
     * @param jaxbObject the jaxb object
     * @return the string
     */
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

    /**
     * Load json.
     *
     * @param <T> the generic type
     * @param cls the cls
     * @param fileName the file name
     * @return the t
     */
    public static <T> T loadJson(Class<T> cls, String fileName)  {
		T t = null;
		try {
			t = objectMapper.readValue(new File(fileName), cls);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return t;
	}

    /**
     * Creates the json.
     *
     * @param object the object
     * @return the string
     */
    public static String createJson(Object object)  {
    	String json = null;
		try {
			json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
    	return json;
    }
    
    
    /**
     * Gets the test case.
     *
     * @param testcaseFilePath the testcase file path
     * @return the test case
     */
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
		String OTC_HOME = OtcConfig.getOtcHomeDirectory();
		String fileName = OTC_HOME + File.separator + "test-samples" + File.separator +
				"Kronos-passenger-map.xml";
		KronosAirlinePassenger kronosAirlinePassenger = loadXml(fileName, KronosAirlinePassenger.class);
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
