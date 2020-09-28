package miscellaneous;

import java.io.File;
import java.io.IOException;

import javax.xml.datatype.DatatypeConfigurationException;

import org.otcl2.common.dto.OtclFileDto;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;

public class Verify {

//	private static Map<String, String> dateStr = new LinkedHashMap<>();
//	static {
//		dateStr.put("2009-05-08 17:57:51 +0000", "May 8, 2009 5:57:51 PM");
//	    dateStr.put("1970-10-07 00:00:00 +0000", "oct 7, 1970");
//	    dateStr.put("1970-10-07 00:00:00 +0000", "oct 7, '70");
//	    dateStr.put("1970-10-07 00:00:00 +0000", "oct. 7, 1970");
//	    dateStr.put("1970-10-07 00:00:00 +0000", "oct. 7, 70");
//	    dateStr.put("2006-01-02 15:04:05 +0000", "Mon Jan  2 15:04:05 2006");
//	    dateStr.put("2006-01-02 15:04:05 -0700", "Mon Jan  2 15:04:05 MST 2006");
//	    dateStr.put("2006-01-02 15:04:05 -0700", "Mon Jan 02 15:04:05 -0700 2006");
//	    dateStr.put("2006-01-02 15:04:05 -0700", "Monday, 02-Jan-06 15:04:05 MST");
//	    dateStr.put("2006-01-02 15:04:05 -0700", "Mon, 02 Jan 2006 15:04:05 MST");
//	    dateStr.put("2017-07-11 16:28:13 +0200", "Tue, 11 Jul 2017 16:28:13 +0200 (CEST)");
//	    dateStr.put("2006-01-02 15:04:05 -0700", "Mon, 02 Jan 2006 15:04:05 -0700");
//	    dateStr.put("2018-01-04 17:53:36 +0000", "Thu, 4 Jan 2018 17:53:36 +0000");
//	    dateStr.put("2015-08-10 15:44:11 +0100", "Mon Aug 10 15:44:11 UTC+0100 2015");
//	    dateStr.put("2018-01-04 17:53:36 +0000", "Thu, 4 Jan 2018 17:53:36 +0000");
//	    dateStr.put("2015-08-10 15:44:11 +0100", "Mon Aug 10 15:44:11 UTC+0100 2015");
//	    dateStr.put("2015-07-03 18:04:07 +0100", "Fri Jul 03 2015 18:04:07 GMT+0100 (GMT Daylight Time)");
//	    dateStr.put("2012-09-17 10:09:00 +0000", "September 17, 2012 10:09am");
//	    dateStr.put("2012-09-17 10:09:00 -0800", "September 17, 2012 at 10:09am PST-08");
//	    dateStr.put("2012-09-17 10:10:09 +0000", "September 17, 2012, 10:10:09");
//	    dateStr.put("1970-10-07 00:00:00 +0000", "October 7, 1970");
//	    dateStr.put("1970-10-07 00:00:00 +0000", "October 7th, 1970");
//	    dateStr.put("2006-02-12 19:17:00 +0000", "12 Feb 2006, 19:17");
//	    dateStr.put("2006-02-12 19:17:00 +0000", "12 Feb 2006 19:17");
//	    dateStr.put("1970-10-07 00:00:00 +0000", "7 oct 70");
//	    dateStr.put("1970-10-07 00:00:00 +0000", "7 oct 1970");
//	    dateStr.put("2013-02-03 00:00:00 +0000", "03 February 2013");
//	    dateStr.put("2013-07-01 00:00:00 +0000", "1 July 2013");
//	    dateStr.put("2013-02-03 00:00:00 +0000", "2013-Feb-03");
//	
//	    dateStr.put("2014-03-31 00:00:00 +0000", "3/31/2014");
//	    dateStr.put("2014-03-31 00:00:00 +0000", "03/31/2014");
//	    dateStr.put("1971-08-21 00:00:00 +0000", "08/21/71");
//	    dateStr.put("1971-08-01 00:00:00 +0000", "8/1/71");
//	    dateStr.put("2014-04-08 22:05:00 +0000", "4/8/2014 22:05");
//	    dateStr.put("2014-04-08 22:05:00 +0000", "04/08/2014 22:05");
//	    dateStr.put("2014-04-08 22:05:00 +0000", "4/8/14 22:05");
//	    dateStr.put("2014-04-02 03:00:51 +0000", "04/2/2014 03:00:51");
//	    dateStr.put("2014-04-02 03:00:51 +0000", "04/2/2014 03:00:51");
//	    dateStr.put("1965-08-08 00:00:00 +0000", "8/8/1965 12:00:00 AM");
//	    dateStr.put("1965-08-08 13:00:01 +0000", "8/8/1965 01:00:01 PM");
//	    dateStr.put("1965-08-08 13:00:00 +0000", "8/8/1965 01:00 PM");
//	    dateStr.put("1965-08-08 13:00:00 +0000", "8/8/1965 1:00 PM");
//	    dateStr.put("1965-08-08 00:00:00 +0000", "8/8/1965 12:00 AM");
//	    dateStr.put("2014-04-02 03:00:51 +0000", "4/02/2014 03:00:51");
//	    dateStr.put("2014-04-02 03:00:51 +0000", "4/02/2014 03:00:51");
//	    dateStr.put("2012-03-19 10:11:59 +0000", "03/19/2012 10:11:59");
//	    dateStr.put("2012-03-19 10:11:59.318636 +0000", "03/19/2012 10:11:59.318636");
//	    dateStr.put("2014-03-31 00:00:00 +0000", "2014/3/31");
//	    dateStr.put("2014-03-31 00:00:00 +0000", "2014/03/31");
//	    dateStr.put("2014-04-08 22:05:00 +0000", "2014/4/8 22:05");
//	    dateStr.put("2014-04-08 22:05:00 +0000", "2014/04/08 22:05");
//	    dateStr.put("2014-04-02 03:00:51 +0000", "2014/04/2 03:00:51");
//	    dateStr.put("2014-04-02 03:00:51 +0000", "2014/4/02 03:00:51");
//	    dateStr.put("2012-03-19 10:11:59 +0000", "2012/03/19 10:11:59");
//	    dateStr.put("2012-03-19 10:11:59.318636 +0000", "2012/03/19 10:11:59.318636");
//	
//	    dateStr.put("2014-04-08 00:00:00 +0000", "2014年04月08日");
//	    dateStr.put("2006-01-02 15:04:05 +0000", "2006-01-02T15:04:05+0000");
//	    dateStr.put("2009-08-12 22:15:09 -0700", "2009-08-12T22:15:09-07:00");
//	    dateStr.put("2009-08-12 22:15:09 +0000", "2009-08-12T22:15:09");
//	    dateStr.put("2009-08-12 22:15:09 +0000", "2009-08-12T22:15:09Z");
//	    dateStr.put("2014-04-26 17:24:37.318636 +0000", "2014-04-26 17:24:37.318636");
//	    dateStr.put("2012-08-03 18:31:59.257 +0000", "2012-08-03 18:31:59.257000000");
//	    dateStr.put("2014-04-26 17:24:37.123 +0000", "2014-04-26 17:24:37.123");
//	    dateStr.put("2013-04-01 22:43:00 +0000", "2013-04-01 22:43");
//	    dateStr.put("2013-04-01 22:43:22 +0000", "2013-04-01 22:43:22");
//	    dateStr.put("2014-12-16 06:20:00 +0000", "2014-12-16 06:20:00 UTC");
//	    dateStr.put("2014-12-16 06:20:00 +0000", "2014-12-16 06:20:00 GMT");
//	    dateStr.put("2014-04-26 17:24:37 +0000", "2014-04-26 05:24:37 PM");
//	    dateStr.put("2014-04-26 13:13:43 +0800", "2014-04-26 13:13:43 +0800");
//	    dateStr.put("2014-04-26 13:13:43 +0800", "2014-04-26 13:13:43 +0800 +08");
//	    dateStr.put("2014-04-26 13:13:44 +0900", "2014-04-26 13:13:44 +09:00");
//	    dateStr.put("2012-08-03 18:31:59.257 +0000", "2012-08-03 18:31:59.257000000 +0000 UTC");
//	    dateStr.put("2015-09-30 18:48:56.35272715 +0000", "2015-09-30 18:48:56.35272715 +0000 UTC");
//	    dateStr.put("2015-02-18 00:12:00 +0000", "2015-02-18 00:12:00 +0000 GMT");
//	    dateStr.put("2015-02-18 00:12:00 +0000", "2015-02-18 00:12:00 +0000 UTC");
//	    dateStr.put("2015-02-08 03:02:00 +0300", "2015-02-08 03:02:00 +0300 MSK m=+0.000000001");
//	    dateStr.put("2015-02-08 03:02:00.001 +0300", "2015-02-08 03:02:00.001 +0300 MSK m=+0.000000001");
//	    dateStr.put("2017-07-19 03:21:51 +0000", "2017-07-19 03:21:51+00:00");
//	    dateStr.put("2014-04-26 00:00:00 +0000", "2014-04-26");
//	    dateStr.put("2014-04-01 00:00:00 +0000", "2014-04");
//	    dateStr.put("2014-01-01 00:00:00 +0000", "2014");
//	    dateStr.put("2014-05-11 08:20:13.787 +0000", "2014-05-11 08:20:13,787");
//	
//	    dateStr.put("2014-03-31 00:00:00 +0000", "3。31.2014");
//	    dateStr.put("2014-03-31 00:00:00 +0000", "3.31.2014");
//	    dateStr.put("2014-03-31 00:00:00 +0000", "03.31.2014");
//	    dateStr.put("1971-08-21 00:00:00 +0000", "08.21.71");
//	    dateStr.put("2014-03-01 00:00:00 +0000", "2014.03");
//	    dateStr.put("2014-03-30 00:00:00 +0000", "2014.03.30");
//	
//	    // test ZoneOffset
//	    dateStr.put("2014-03-30 00:00:00 -1400", "2014.03.30 00:00:00 -1400");
//	    dateStr.put("2014-03-30 14:00:00 +0000", "2014.03.30 00:00:00 -1400");
//	    dateStr.put("2014-03-30 00:00:00 +1300", "2014.03.30 00:00:00 +1300");
//	    dateStr.put("2014-03-30 00:00:00 +0000", "2014.03.30 13:00:00 +1300");
//	
//	    dateStr.put("2014-06-01 00:00:00 +0000", "20140601");
//	    dateStr.put("2014-07-22 10:52:03 +0000", "20140722105203");
//	
//	    dateStr.put("2012-03-19 10:11:59 +0000", "1332151919");
//	    dateStr.put("2013-11-12 00:32:47.189 +0000", "1384216367189");
//	    dateStr.put("2013-11-12 00:32:47.111222 +0000", "1384216367111222");
//	    dateStr.put("2013-11-12 00:32:47.111222333 +0000", "1384216367111222333");
//	}
	
	public static void main(String[] args) throws DatatypeConfigurationException, IOException {

//	    int cnt = 0;
//	    System.out.println("private static final Map<String, String> mapDateStr = new HashMap<>();");
//	    for (Entry<String, String> entry : dateStr.entrySet()) {
//	    	System.out.println("mapDateStr.put(\"dateStr" + cnt + "\",\"" + entry.getKey() + "\");");
//	    	System.out.println("mapDateStr.put(\"dateStr" + cnt + "_1\",\"" + entry.getValue() + "\");");
//	    	cnt++;
//	    }
		
		String fileName ="D:\\otcl-home\\otcl-test-source\\com.kronos.airlines.dto.KronosAirlinePassenger_com.athena.airlines.dto.AthenaAirlinePassenger.otcl";
		YAMLFactory yamlFactory = new YAMLFactory();
		yamlFactory.enable(YAMLGenerator.Feature.MINIMIZE_QUOTES);
		ObjectMapper objectMapper = new ObjectMapper(yamlFactory);
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		objectMapper.configure(SerializationFeature.INDENT_OUTPUT, false);

		OtclFileDto otclFileDto = objectMapper.readValue(new File(fileName), OtclFileDto.class);
		String yaml = objectMapper.writeValueAsString(otclFileDto);
		System.out.println(yaml);
	}

	
}
