package miscellaneous;

import java.io.IOException;
import java.util.Optional;

import javax.xml.datatype.DatatypeConfigurationException;

public class Verify {

	public static void main(String[] args) throws DatatypeConfigurationException, IOException {
//		for testing purposes
		Optional<String> optional = Optional.of(null);
		System.out.println(optional.isPresent());
	}

	
}
