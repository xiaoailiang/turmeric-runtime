//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.03 at 06:49:54 AM PDT 
//


package org.ebayopensource.turmeric.common.config;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ProviderOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProviderOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unsupported-operation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="supported-data-bindings" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="custom-serializers" type="{http://www.ebayopensource.org/turmeric/common/config}CustomSerializerConfigList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="error-mapping-handler-class-name" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="error-data-provider-class-name" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="monitoring-level" type="{http://www.ebayopensource.org/turmeric/common/config}MonitorLevelConfig" minOccurs="0"/>
 *         &lt;element name="version-check-handler" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="header-mapping-options" type="{http://www.ebayopensource.org/turmeric/common/config}OptionList" minOccurs="0"/>
 *         &lt;element name="request-header-mapping-options" type="{http://www.ebayopensource.org/turmeric/common/config}OptionList" minOccurs="0"/>
 *         &lt;element name="response-header-mapping-options" type="{http://www.ebayopensource.org/turmeric/common/config}OptionList" minOccurs="0"/>
 *         &lt;element name="default-request-data-binding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="default-response-data-binding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="error-status-options" type="{http://www.ebayopensource.org/turmeric/common/config}ErrorStatusOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProviderOptions", propOrder = {
    "unsupportedOperation",
    "supportedDataBindings",
    "customSerializers",
    "errorMappingHandlerClassName",
    "errorDataProviderClassName",
    "monitoringLevel",
    "versionCheckHandler",
    "headerMappingOptions",
    "requestHeaderMappingOptions",
    "responseHeaderMappingOptions",
    "defaultRequestDataBinding",
    "defaultResponseDataBinding",
    "errorStatusOptions"
})
public class ProviderOptions {

    @XmlElement(name = "unsupported-operation")
    protected List<String> unsupportedOperation;
    @XmlElement(name = "supported-data-bindings")
    protected List<String> supportedDataBindings;
    @XmlElement(name = "custom-serializers")
    protected List<CustomSerializerConfigList> customSerializers;
    @XmlElement(name = "error-mapping-handler-class-name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String errorMappingHandlerClassName;
    @XmlElement(name = "error-data-provider-class-name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String errorDataProviderClassName;
    @XmlElement(name = "monitoring-level")
    protected MonitorLevelConfig monitoringLevel;
    @XmlElement(name = "version-check-handler")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String versionCheckHandler;
    @XmlElement(name = "header-mapping-options")
    protected OptionList headerMappingOptions;
    @XmlElement(name = "request-header-mapping-options")
    protected OptionList requestHeaderMappingOptions;
    @XmlElement(name = "response-header-mapping-options")
    protected OptionList responseHeaderMappingOptions;
    @XmlElement(name = "default-request-data-binding")
    protected String defaultRequestDataBinding;
    @XmlElement(name = "default-response-data-binding")
    protected String defaultResponseDataBinding;
    @XmlElement(name = "error-status-options")
    protected ErrorStatusOptions errorStatusOptions;

    /**
     * Gets the value of the unsupportedOperation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unsupportedOperation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnsupportedOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUnsupportedOperation() {
        if (unsupportedOperation == null) {
            unsupportedOperation = new ArrayList<String>();
        }
        return this.unsupportedOperation;
    }

    /**
     * Gets the value of the supportedDataBindings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedDataBindings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedDataBindings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSupportedDataBindings() {
        if (supportedDataBindings == null) {
            supportedDataBindings = new ArrayList<String>();
        }
        return this.supportedDataBindings;
    }

    /**
     * Gets the value of the customSerializers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customSerializers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomSerializers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomSerializerConfigList }
     * 
     * 
     */
    public List<CustomSerializerConfigList> getCustomSerializers() {
        if (customSerializers == null) {
            customSerializers = new ArrayList<CustomSerializerConfigList>();
        }
        return this.customSerializers;
    }

    /**
     * Gets the value of the errorMappingHandlerClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMappingHandlerClassName() {
        return errorMappingHandlerClassName;
    }

    /**
     * Sets the value of the errorMappingHandlerClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMappingHandlerClassName(String value) {
        this.errorMappingHandlerClassName = value;
    }

    /**
     * Gets the value of the errorDataProviderClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDataProviderClassName() {
        return errorDataProviderClassName;
    }

    /**
     * Sets the value of the errorDataProviderClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDataProviderClassName(String value) {
        this.errorDataProviderClassName = value;
    }

    /**
     * Gets the value of the monitoringLevel property.
     * 
     * @return
     *     possible object is
     *     {@link MonitorLevelConfig }
     *     
     */
    public MonitorLevelConfig getMonitoringLevel() {
        return monitoringLevel;
    }

    /**
     * Sets the value of the monitoringLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitorLevelConfig }
     *     
     */
    public void setMonitoringLevel(MonitorLevelConfig value) {
        this.monitoringLevel = value;
    }

    /**
     * Gets the value of the versionCheckHandler property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionCheckHandler() {
        return versionCheckHandler;
    }

    /**
     * Sets the value of the versionCheckHandler property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionCheckHandler(String value) {
        this.versionCheckHandler = value;
    }

    /**
     * Gets the value of the headerMappingOptions property.
     * 
     * @return
     *     possible object is
     *     {@link OptionList }
     *     
     */
    public OptionList getHeaderMappingOptions() {
        return headerMappingOptions;
    }

    /**
     * Sets the value of the headerMappingOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionList }
     *     
     */
    public void setHeaderMappingOptions(OptionList value) {
        this.headerMappingOptions = value;
    }

    /**
     * Gets the value of the requestHeaderMappingOptions property.
     * 
     * @return
     *     possible object is
     *     {@link OptionList }
     *     
     */
    public OptionList getRequestHeaderMappingOptions() {
        return requestHeaderMappingOptions;
    }

    /**
     * Sets the value of the requestHeaderMappingOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionList }
     *     
     */
    public void setRequestHeaderMappingOptions(OptionList value) {
        this.requestHeaderMappingOptions = value;
    }

    /**
     * Gets the value of the responseHeaderMappingOptions property.
     * 
     * @return
     *     possible object is
     *     {@link OptionList }
     *     
     */
    public OptionList getResponseHeaderMappingOptions() {
        return responseHeaderMappingOptions;
    }

    /**
     * Sets the value of the responseHeaderMappingOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionList }
     *     
     */
    public void setResponseHeaderMappingOptions(OptionList value) {
        this.responseHeaderMappingOptions = value;
    }

    /**
     * Gets the value of the defaultRequestDataBinding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultRequestDataBinding() {
        return defaultRequestDataBinding;
    }

    /**
     * Sets the value of the defaultRequestDataBinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultRequestDataBinding(String value) {
        this.defaultRequestDataBinding = value;
    }

    /**
     * Gets the value of the defaultResponseDataBinding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultResponseDataBinding() {
        return defaultResponseDataBinding;
    }

    /**
     * Sets the value of the defaultResponseDataBinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultResponseDataBinding(String value) {
        this.defaultResponseDataBinding = value;
    }

    /**
     * Gets the value of the errorStatusOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorStatusOptions }
     *     
     */
    public ErrorStatusOptions getErrorStatusOptions() {
        return errorStatusOptions;
    }

    /**
     * Sets the value of the errorStatusOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorStatusOptions }
     *     
     */
    public void setErrorStatusOptions(ErrorStatusOptions value) {
        this.errorStatusOptions = value;
    }

}
