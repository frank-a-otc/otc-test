//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.02 at 08:30:56 PM IST 
//


package com.athena.airlines.dto;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FlightArrivalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightArrivalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirportCode">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="Application" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Area" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="UOM" type="{}DistanceUnitListType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChangeOfDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Terminal" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightArrivalType", propOrder = {
    "airportCode",
    "date",
    "time",
    "changeOfDay",
    "airportName",
    "terminal"
})
public class FlightArrivalType {

    @XmlElement(name = "AirportCode", required = true)
    protected FlightArrivalType.AirportCode airportCode;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Time")
    protected String time;
    @XmlElement(name = "ChangeOfDay")
    protected BigInteger changeOfDay;
    @XmlElement(name = "AirportName")
    protected String airportName;
    @XmlElement(name = "Terminal")
    protected FlightArrivalType.Terminal terminal;

    /**
     * Gets the value of the airportCode property.
     * 
     * @return
     *     possible object is
     *     {@link FlightArrivalType.AirportCode }
     *     
     */
    public FlightArrivalType.AirportCode getAirportCode() {
        return airportCode;
    }

    /**
     * Sets the value of the airportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightArrivalType.AirportCode }
     *     
     */
    public void setAirportCode(FlightArrivalType.AirportCode value) {
        this.airportCode = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the changeOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChangeOfDay() {
        return changeOfDay;
    }

    /**
     * Sets the value of the changeOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChangeOfDay(BigInteger value) {
        this.changeOfDay = value;
    }

    /**
     * Gets the value of the airportName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportName() {
        return airportName;
    }

    /**
     * Sets the value of the airportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportName(String value) {
        this.airportName = value;
    }

    /**
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link FlightArrivalType.Terminal }
     *     
     */
    public FlightArrivalType.Terminal getTerminal() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightArrivalType.Terminal }
     *     
     */
    public void setTerminal(FlightArrivalType.Terminal value) {
        this.terminal = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="Application" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Area" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="UOM" type="{}DistanceUnitListType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class AirportCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Application")
        protected String application;
        @XmlAttribute(name = "Area")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger area;
        @XmlAttribute(name = "UOM")
        protected DistanceUnitListType uom;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the application property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplication() {
            return application;
        }

        /**
         * Sets the value of the application property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplication(String value) {
            this.application = value;
        }

        /**
         * Gets the value of the area property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getArea() {
            return area;
        }

        /**
         * Sets the value of the area property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setArea(BigInteger value) {
            this.area = value;
        }

        /**
         * Gets the value of the uom property.
         * 
         * @return
         *     possible object is
         *     {@link DistanceUnitListType }
         *     
         */
        public DistanceUnitListType getUOM() {
            return uom;
        }

        /**
         * Sets the value of the uom property.
         * 
         * @param value
         *     allowed object is
         *     {@link DistanceUnitListType }
         *     
         */
        public void setUOM(DistanceUnitListType value) {
            this.uom = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "gate"
    })
    public static class Terminal {

        @XmlElement(name = "Name")
        protected String name;
        @XmlElement(name = "Gate")
        protected String gate;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the gate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGate() {
            return gate;
        }

        /**
         * Sets the value of the gate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGate(String value) {
            this.gate = value;
        }

    }

}
