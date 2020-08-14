package org.otcl.core.helper;

import com.athena.airlines.dto.AthenaAirlinePassenger;
import com.athena.airlines.dto.TravelerCoreType;
import com.athena.airlines.dto.TravelerDetailType;
import com.athena.airlines.dto.TravelerGenderSimpleType;
import com.kronos.airlines.dto.KronosAirlinePassenger;

public class TestFactoryHelper {

	public static void setMainPassenger(AthenaAirlinePassenger athenaAirlinePassenger, String mainPassengerName) {
		athenaAirlinePassenger.setMainPassengerName(mainPassengerName); 
	}

	public static String getMainPassenger(KronosAirlinePassenger kronosAirlinePassenger) {
		return kronosAirlinePassenger.getMainPassengerName(); 
	}

	public static void setPtc(TravelerDetailType travelerDetailType, TravelerCoreType.PTC ptc) {
		travelerDetailType.setPTC(ptc);
	}
	
	public static TravelerCoreType.PTC getPtc(TravelerDetailType travelerDetailType) {
		return travelerDetailType.getPTC();
	}

	public static void setPtc(TravelerCoreType travelerCoreType, TravelerCoreType.PTC ptc) {
		travelerCoreType.setPTC(ptc);
	}
	
	public static TravelerCoreType.PTC getPtc(TravelerCoreType travelerCoreType) {
		return travelerCoreType.getPTC();
	}

	public static void setGender(TravelerDetailType.Gender gender, String value) {
		gender.setValue(TravelerGenderSimpleType.fromValue(value));
	}
}
