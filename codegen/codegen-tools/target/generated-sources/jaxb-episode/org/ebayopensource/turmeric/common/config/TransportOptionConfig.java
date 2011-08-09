//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.03 at 06:49:54 AM PDT 
//


package org.ebayopensource.turmeric.common.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportOptionConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportOptionConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="socket-connect-timeout-msec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="socket-read-timeout-msec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="invocation-timeout-msec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="num-connect-retries" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="skip-serialization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="use-detached-local-binding" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="other-options" type="{http://www.ebayopensource.org/turmeric/common/config}OptionList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportOptionConfig", propOrder = {
    "socketConnectTimeoutMsec",
    "socketReadTimeoutMsec",
    "invocationTimeoutMsec",
    "numConnectRetries",
    "skipSerialization",
    "useDetachedLocalBinding",
    "otherOptions"
})
public class TransportOptionConfig {

    @XmlElement(name = "socket-connect-timeout-msec")
    protected Integer socketConnectTimeoutMsec;
    @XmlElement(name = "socket-read-timeout-msec")
    protected Integer socketReadTimeoutMsec;
    @XmlElement(name = "invocation-timeout-msec")
    protected Integer invocationTimeoutMsec;
    @XmlElement(name = "num-connect-retries")
    protected Integer numConnectRetries;
    @XmlElement(name = "skip-serialization")
    protected Boolean skipSerialization;
    @XmlElement(name = "use-detached-local-binding")
    protected Boolean useDetachedLocalBinding;
    @XmlElement(name = "other-options")
    protected OptionList otherOptions;

    /**
     * Gets the value of the socketConnectTimeoutMsec property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSocketConnectTimeoutMsec() {
        return socketConnectTimeoutMsec;
    }

    /**
     * Sets the value of the socketConnectTimeoutMsec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSocketConnectTimeoutMsec(Integer value) {
        this.socketConnectTimeoutMsec = value;
    }

    /**
     * Gets the value of the socketReadTimeoutMsec property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSocketReadTimeoutMsec() {
        return socketReadTimeoutMsec;
    }

    /**
     * Sets the value of the socketReadTimeoutMsec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSocketReadTimeoutMsec(Integer value) {
        this.socketReadTimeoutMsec = value;
    }

    /**
     * Gets the value of the invocationTimeoutMsec property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInvocationTimeoutMsec() {
        return invocationTimeoutMsec;
    }

    /**
     * Sets the value of the invocationTimeoutMsec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInvocationTimeoutMsec(Integer value) {
        this.invocationTimeoutMsec = value;
    }

    /**
     * Gets the value of the numConnectRetries property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumConnectRetries() {
        return numConnectRetries;
    }

    /**
     * Sets the value of the numConnectRetries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumConnectRetries(Integer value) {
        this.numConnectRetries = value;
    }

    /**
     * Gets the value of the skipSerialization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipSerialization() {
        return skipSerialization;
    }

    /**
     * Sets the value of the skipSerialization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipSerialization(Boolean value) {
        this.skipSerialization = value;
    }

    /**
     * Gets the value of the useDetachedLocalBinding property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseDetachedLocalBinding() {
        return useDetachedLocalBinding;
    }

    /**
     * Sets the value of the useDetachedLocalBinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseDetachedLocalBinding(Boolean value) {
        this.useDetachedLocalBinding = value;
    }

    /**
     * Gets the value of the otherOptions property.
     * 
     * @return
     *     possible object is
     *     {@link OptionList }
     *     
     */
    public OptionList getOtherOptions() {
        return otherOptions;
    }

    /**
     * Sets the value of the otherOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionList }
     *     
     */
    public void setOtherOptions(OptionList value) {
        this.otherOptions = value;
    }

}
