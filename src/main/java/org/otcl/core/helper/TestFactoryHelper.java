package org.otcl.core.helper;

import org.otcl.airlines.athena.dto.AthenaAirlinePassenger;
import org.otcl.airlines.athena.dto.TravelerCoreType;
import org.otcl.airlines.athena.dto.TravelerDetailType;
import org.otcl.airlines.kronos.dto.KronosAirlinePassenger;

public class TestFactoryHelper {

	public static void setPtc(TravelerDetailType travelerDetailType, TravelerCoreType.PTC ptc) {
		travelerDetailType.setPTC(ptc);
	}
	
	public static TravelerCoreType.PTC getPtc(TravelerDetailType travelerDetailType) {
		return travelerDetailType.getPTC();
	}

	public static void setMainPassenger(AthenaAirlinePassenger athenaAirlinePassenger, String mainPassengerName) {
		athenaAirlinePassenger.setMainPassengerName(mainPassengerName); 
	}

	public static String getMainPassenger(KronosAirlinePassenger kronosAirlinePassenger) {
		return kronosAirlinePassenger.getMainPassengerName(); 
	}
}
