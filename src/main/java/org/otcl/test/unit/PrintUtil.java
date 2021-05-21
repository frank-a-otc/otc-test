package org.otcl.test.unit;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.stream.FactoryConfigurationError;

import com.thoughtworks.xstream.XStream;

public class PrintUtil {

    private static final XStream xs = new XStream();
    
    public static String toXml(Object val){
        return xs.toXML(val);
    }

    public static String jaxbObjectToXML(Object jaxbObject)  {
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

}
