package testcase.examples.helper;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.athena.airlines.dto.*;
import com.kronos.airlines.dto.KronosAirlinePassenger;

public class TestFactoryHelper {

	private static final String err = "But helper method is not complete ! Pls fix it.";
	
	public static void setMainPassenger(AthenaAirlinePassenger athenaAirlinePassenger, String mainPassengerName) {
		athenaAirlinePassenger.setMainPassengerName(mainPassengerName); 
	}

	public static String getMainPassenger(KronosAirlinePassenger kronosAirlinePassenger) {
		return kronosAirlinePassenger.getMainPassengerName(); 
	}

	public static void setPtc(TravelerDetailType travelerDetailType, TravelerCoreType.PTC ptc) {
		travelerDetailType.setPTC(ptc);
	}
	
	public static void writeValue(TravelerDetailType travelerDetailType,
                                  TravelerDetailType.Gender gender) {
		System.out.println("Called method - writeValue(com.athena.airlines.dto.TravelerDetailType travelerDetailType, "
				+ "com.athena.airlines.dto.TravelerDetailType.Gender gender)");
		System.out.println(err);
//		throw new RuntimeException(err);
		return;
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

	public static void setValue(TravelerDetailType.Gender gender, String value) {
		gender.setValue(TravelerGenderSimpleType.valueOf(value.toUpperCase()));
	}

	public static void setValue(AnonymousTravelerType anonymousTravelerType, TravelerDetailType.Gender gender) {
		System.out.println("Called method - setValue(AnonymousTravelerType, TravelerDetailType.Gender)");
		System.out.println(err);
//		throw new RuntimeException(err);
		return;
	}
	
	public static void setGenderValue(TravelerGenderSimpleType travelerGenderSimpleType, String value) {
		System.out.println("Called method - setGenderValue(TravelerGenderSimpleType, String)");
		System.out.println(err);
//		throw new RuntimeException(err);
		return;
	}
	
	public static void setGender(IdentityDocumentType identityDocumentType, TravelerDetailType.Gender gender) {
		System.out.println("Called method - setGender(com.athena.airlines.dto.IdentityDocumentType, com.athena.airlines.dto.TravelerDetailType.Gender)");
		System.out.println(err);
//		throw new RuntimeException(err);
		return;
	}
	
	public static void setGenderEnum(TravelerDetailType.Gender gender, TravelerGenderSimpleType travelerGenderSimpleType) {
		System.out.println("Called method - setGenderEnum(TravelerDetailType.Gender, com.athena.airlines.dto.TravelerGenderSimpleType)");
		System.out.println(err);
//		throw new RuntimeException(err);
		return;
	}

	public static void setGenderEnum(TravelerDetailType.Gender gender, String value) {
		gender.setValue(TravelerGenderSimpleType.valueOf(value));
		System.out.println("Called method - setGenderEnum(TravelerDetailType.Gender, String)");
	}

	public static void setGenderEnum(TravelerDetailType.Gender gender, com.kronos.airlines.dto.TravelerGenderSimpleType travelerGenderSimpleType) {
		System.out.println("Called method - setGenderEnum(TravelerDetailType.Gender, com.kronos.airlines.dto.TravelerGenderSimpleType)");
		System.out.println(err);
//		throw new RuntimeException(err);
		return;
	}

	// --- setting value using reflection API when a setter is missing.
	public static void setOriginDestination(AirShopReqAttributeQueryType airShopReqAttributeQueryType,
                                            java.util.List list) {
		System.out.println("Called method - setOriginDestination(com.athena.airlines.dto.AirShopReqAttributeQueryType, java.util.List)");
    	try {
			Field field = AirShopReqAttributeQueryType.class.getField("originDestination");
			List<AirShopReqAttributeQueryType.OriginDestination> originDestinations = new ArrayList<>();
			field.setAccessible(true);
			field.set(airShopReqAttributeQueryType, originDestinations); 
			field.setAccessible(false);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
