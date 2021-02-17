package org.otcl.test.unit;

import javax.xml.bind.JAXBContext;

import org.junit.Test;
import org.otcl.test.AbstractTest;
import org.otcl2.common.engine.OtclEngine;
import org.otcl2.core.engine.OtclEngineImpl;

import com.athena.airlines.dto.AthenaAirlinePassenger;
import com.kronos.airlines.dto.KronosAirlinePassenger;

public class OtclTest extends AbstractTest {

	private static OtclEngine otclEngine = OtclEngineImpl.instance;
	
	private static enum TEST_METHOD {
		VALUES_TO_TARGET, 
		SOURCE_TO_TARGET
	}
	private static TEST_METHOD testMethod = TEST_METHOD.SOURCE_TO_TARGET;
	private static String pkg = "execute";

	@Test
	public void runTest() {
		AthenaAirlinePassenger airlinePassenger = null;
 		if (TEST_METHOD.VALUES_TO_TARGET == testMethod) {
 			airlinePassenger = testCopyValues(pkg);
 		} else if (TEST_METHOD.SOURCE_TO_TARGET == testMethod) {
 			airlinePassenger = testCopyKronosToAthena(pkg);
 			System.out.println(airlinePassenger);
 		} else {
//			PermanentEmployee permanentEmployee = testContractEmployeesToPermanent(null);
// 			System.out.println(permanentEmployee);
 		}
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(AthenaAirlinePassenger.class);
			print(airlinePassenger, jaxbContext); 
		} catch (Exception ex) {
			ex.printStackTrace();
		}
 	}
 	
	private void compileAndDeploy() {
		// -- compile script and generated source code
		otclEngine.compileOtcl();
		otclEngine.compileSourceCode();
		
		// -- register the generated .tmd and the executable files.
		otclEngine.register();
	}
	
 	private AthenaAirlinePassenger testCopyValues(String pkg) {
 		compileAndDeploy();
		AthenaAirlinePassenger airlinePassenger = otclEngine.executeOtcl(pkg, AthenaAirlinePassenger.class, null);
		return airlinePassenger;
	}
	
	private AthenaAirlinePassenger testCopyKronosToAthena(String pkg) {
 		compileAndDeploy();
		KronosAirlinePassenger kronosAirlinePassenger = loadKronosXml();
		AthenaAirlinePassenger airlinePassenger = otclEngine.executeOtcl(pkg, kronosAirlinePassenger, AthenaAirlinePassenger.class, null);
		return airlinePassenger;
	}

//	private PermanentEmployee testContractEmployeesToPermanent(String pkg) {
// 		compileAndDeploy();
//		ContractEmployee contractEmployee = new ContractEmployee();
//		contractEmployee.setEmployeeName("Otcl-Jack");
//		ContractEmployees contractEmployees = new ContractEmployees();
//		List<ContractEmployee> list = new ArrayList<>();
//		contractEmployees.setEmployees(list);
//		list.add(contractEmployee);
//		PermanentEmployee permanentEmployee = otclEngine.executeOtcl(pkg, contractEmployees, PermanentEmployee.class,
//				 null);
//		return permanentEmployee;
//	}

}
