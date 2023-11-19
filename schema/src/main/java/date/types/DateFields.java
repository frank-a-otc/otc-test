package date.types;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "", propOrder = {
//    "coreQuery",
//    "preference",
//    "dataLists",
//    "travelers",
//    "aliases",
//    "ptc",
//    "mainPassengerName",
//    "travelerDetailType",
//    "recognizedTravelerMap",
//    "customObjectsMap",
//    "customStringMap",
//    "integerIntegerMap",
//    "integerStringMap",
//    "stringIntegerMap",
//    "enumsMap"
//})
@XmlRootElement(name = "DateFields")
public class DateFields {

    @XmlElement(name = "Date")
	private Date date;
    @XmlElement(name = "SqlDate")
    @XmlJavaTypeAdapter(value = SqlDateAdapter.class)
	private java.sql.Date sqlDate;
    @XmlElement(name = "Time")
    @XmlJavaTypeAdapter(value = TimeAdapter.class)
	private Time time;
    @XmlElement(name = "Timestamp")
	private Timestamp timestamp;
    @XmlElement(name = "Calendar")
	private Calendar calendar;
    @XmlElement(name = "XMLGregorianCalendar")
    @XmlSchemaType(name = "date")
	private XMLGregorianCalendar xmlGregorianCalendar;
    @XmlElement(name = "Instant")
    @XmlJavaTypeAdapter(value = InstantAdapter.class)
	private Instant instant;
    @XmlElement(name = "LocalDate")
    @XmlJavaTypeAdapter(value = LocalDateAdapter.class)
	private LocalDate localDate;
    @XmlElement(name = "LocalTime")
    @XmlJavaTypeAdapter(value = LocalTimeAdapter.class)
	private LocalTime localTime;
    @XmlElement(name = "LocalDateTime")
    @XmlJavaTypeAdapter(value = LocalDateTimeAdapter.class)
	private LocalDateTime localDateTime;
    @XmlElement(name = "OffsetDateTime")
    @XmlJavaTypeAdapter(value = OffsetDateTimeAdapter.class)
	private OffsetDateTime offsetDateTime;
    @XmlElement(name = "ZonedDateTime")
    @XmlJavaTypeAdapter(value = ZonedDateTimeAdapter.class)
	private ZonedDateTime zonedDateTime;
    @XmlElement(name = "DateString")
	private String dateString;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public java.sql.Date getSqlDate() {
		return sqlDate;
	}
	public void setSqlDate(java.sql.Date sqlDate) {
		this.sqlDate = sqlDate;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	public java.util.Calendar getCalendar() {
		return calendar;
	}
	public void setCalendar(java.util.Calendar calendar) {
		this.calendar = calendar;
	}
	public XMLGregorianCalendar getXmlGregorianCalendar() {
		return xmlGregorianCalendar;
	}
	public void setXmlGregorianCalendar(XMLGregorianCalendar xmlGregorianCalendar) {
		this.xmlGregorianCalendar = xmlGregorianCalendar;
	}
	public Instant getInstant() {
		return instant;
	}
	public void setInstant(Instant instant) {
		this.instant = instant;
	}
	public LocalDate getLocalDate() {
		return localDate;
	}
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	public LocalTime getLocalTime() {
		return localTime;
	}
	public void setLocalTime(LocalTime localTime) {
		this.localTime = localTime;
	}
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
	public OffsetDateTime getOffsetDateTime() {
		return offsetDateTime;
	}
	public void setOffsetDateTime(OffsetDateTime offsetDateTime) {
		this.offsetDateTime = offsetDateTime;
	}
	public ZonedDateTime getZonedDateTime() {
		return zonedDateTime;
	}
	public void setZonedDateTime(ZonedDateTime zonedDateTime) {
		this.zonedDateTime = zonedDateTime;
	}
	public String getDateString() {
		return dateString;
	}
	public void setDateString(String dateString) {
		this.dateString = dateString;
	}
}
