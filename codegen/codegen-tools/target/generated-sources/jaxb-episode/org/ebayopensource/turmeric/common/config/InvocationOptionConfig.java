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
 * <p>Java class for InvocationOptionConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvocationOptionConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timeout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="preferred-transport" type="{http://www.ebayopensource.org/turmeric/common/config}PreferredTransportConfig" minOccurs="0"/>
 *         &lt;element name="use-rest" type="{http://www.ebayopensource.org/turmeric/common/config}RestOptionType" minOccurs="0"/>
 *         &lt;element name="G11N-options" type="{http://www.ebayopensource.org/turmeric/common/config}ClientG11NOptionConfig" minOccurs="0"/>
 *         &lt;element name="request-data-binding" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="response-data-binding" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="custom-serializers" type="{http://www.ebayopensource.org/turmeric/common/config}CustomSerializerConfigList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="error-data-provider-class-name" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="use-service-version" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="monitoring-level" type="{http://www.ebayopensource.org/turmeric/common/config}MonitorLevelConfig" minOccurs="0"/>
 *         &lt;element name="invocation-use-case" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consumer-id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message-protocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="response-transport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retry-options" type="{http://www.ebayopensource.org/turmeric/common/config}RetryOptions" minOccurs="0"/>
 *         &lt;element name="custom-error-response-adapter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="markdown-options" type="{http://www.ebayopensource.org/turmeric/common/config}MarkdownOptions" minOccurs="0"/>
 *         &lt;element name="request-header-mapping-options" type="{http://www.ebayopensource.org/turmeric/common/config}OptionList" minOccurs="0"/>
 *         &lt;element name="response-header-mapping-options" type="{http://www.ebayopensource.org/turmeric/common/config}OptionList" minOccurs="0"/>
 *         &lt;element name="url-path-info" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvocationOptionConfig", propOrder = {
    "timeout",
    "preferredTransport",
    "useRest",
    "g11NOptions",
    "requestDataBinding",
    "responseDataBinding",
    "customSerializers",
    "errorDataProviderClassName",
    "useServiceVersion",
    "monitoringLevel",
    "invocationUseCase",
    "consumerId",
    "messageProtocol",
    "responseTransport",
    "retryOptions",
    "customErrorResponseAdapter",
    "markdownOptions",
    "requestHeaderMappingOptions",
    "responseHeaderMappingOptions",
    "urlPathInfo"
})
public class InvocationOptionConfig {

    protected Integer timeout;
    @XmlElement(name = "preferred-transport")
    protected PreferredTransportConfig preferredTransport;
    @XmlElement(name = "use-rest")
    protected RestOptionType useRest;
    @XmlElement(name = "G11N-options")
    protected ClientG11NOptionConfig g11NOptions;
    @XmlElement(name = "request-data-binding")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String requestDataBinding;
    @XmlElement(name = "response-data-binding")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String responseDataBinding;
    @XmlElement(name = "custom-serializers")
    protected List<CustomSerializerConfigList> customSerializers;
    @XmlElement(name = "error-data-provider-class-name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String errorDataProviderClassName;
    @XmlElement(name = "use-service-version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String useServiceVersion;
    @XmlElement(name = "monitoring-level")
    protected MonitorLevelConfig monitoringLevel;
    @XmlElement(name = "invocation-use-case")
    protected String invocationUseCase;
    @XmlElement(name = "consumer-id")
    protected String consumerId;
    @XmlElement(name = "message-protocol")
    protected String messageProtocol;
    @XmlElement(name = "response-transport")
    protected String responseTransport;
    @XmlElement(name = "retry-options")
    protected RetryOptions retryOptions;
    @XmlElement(name = "custom-error-response-adapter")
    protected String customErrorResponseAdapter;
    @XmlElement(name = "markdown-options")
    protected MarkdownOptions markdownOptions;
    @XmlElement(name = "request-header-mapping-options")
    protected OptionList requestHeaderMappingOptions;
    @XmlElement(name = "response-header-mapping-options")
    protected OptionList responseHeaderMappingOptions;
    @XmlElement(name = "url-path-info")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String urlPathInfo;

    /**
     * Gets the value of the timeout property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * Sets the value of the timeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTimeout(Integer value) {
        this.timeout = value;
    }

    /**
     * Gets the value of the preferredTransport property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredTransportConfig }
     *     
     */
    public PreferredTransportConfig getPreferredTransport() {
        return preferredTransport;
    }

    /**
     * Sets the value of the preferredTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredTransportConfig }
     *     
     */
    public void setPreferredTransport(PreferredTransportConfig value) {
        this.preferredTransport = value;
    }

    /**
     * Gets the value of the useRest property.
     * 
     * @return
     *     possible object is
     *     {@link RestOptionType }
     *     
     */
    public RestOptionType getUseRest() {
        return useRest;
    }

    /**
     * Sets the value of the useRest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestOptionType }
     *     
     */
    public void setUseRest(RestOptionType value) {
        this.useRest = value;
    }

    /**
     * Gets the value of the g11NOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ClientG11NOptionConfig }
     *     
     */
    public ClientG11NOptionConfig getG11NOptions() {
        return g11NOptions;
    }

    /**
     * Sets the value of the g11NOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientG11NOptionConfig }
     *     
     */
    public void setG11NOptions(ClientG11NOptionConfig value) {
        this.g11NOptions = value;
    }

    /**
     * Gets the value of the requestDataBinding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestDataBinding() {
        return requestDataBinding;
    }

    /**
     * Sets the value of the requestDataBinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestDataBinding(String value) {
        this.requestDataBinding = value;
    }

    /**
     * Gets the value of the responseDataBinding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseDataBinding() {
        return responseDataBinding;
    }

    /**
     * Sets the value of the responseDataBinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseDataBinding(String value) {
        this.responseDataBinding = value;
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
     * Gets the value of the useServiceVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseServiceVersion() {
        return useServiceVersion;
    }

    /**
     * Sets the value of the useServiceVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseServiceVersion(String value) {
        this.useServiceVersion = value;
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
     * Gets the value of the invocationUseCase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvocationUseCase() {
        return invocationUseCase;
    }

    /**
     * Sets the value of the invocationUseCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvocationUseCase(String value) {
        this.invocationUseCase = value;
    }

    /**
     * Gets the value of the consumerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerId() {
        return consumerId;
    }

    /**
     * Sets the value of the consumerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerId(String value) {
        this.consumerId = value;
    }

    /**
     * Gets the value of the messageProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageProtocol() {
        return messageProtocol;
    }

    /**
     * Sets the value of the messageProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageProtocol(String value) {
        this.messageProtocol = value;
    }

    /**
     * Gets the value of the responseTransport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseTransport() {
        return responseTransport;
    }

    /**
     * Sets the value of the responseTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseTransport(String value) {
        this.responseTransport = value;
    }

    /**
     * Gets the value of the retryOptions property.
     * 
     * @return
     *     possible object is
     *     {@link RetryOptions }
     *     
     */
    public RetryOptions getRetryOptions() {
        return retryOptions;
    }

    /**
     * Sets the value of the retryOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetryOptions }
     *     
     */
    public void setRetryOptions(RetryOptions value) {
        this.retryOptions = value;
    }

    /**
     * Gets the value of the customErrorResponseAdapter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomErrorResponseAdapter() {
        return customErrorResponseAdapter;
    }

    /**
     * Sets the value of the customErrorResponseAdapter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomErrorResponseAdapter(String value) {
        this.customErrorResponseAdapter = value;
    }

    /**
     * Gets the value of the markdownOptions property.
     * 
     * @return
     *     possible object is
     *     {@link MarkdownOptions }
     *     
     */
    public MarkdownOptions getMarkdownOptions() {
        return markdownOptions;
    }

    /**
     * Sets the value of the markdownOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkdownOptions }
     *     
     */
    public void setMarkdownOptions(MarkdownOptions value) {
        this.markdownOptions = value;
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
     * Gets the value of the urlPathInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlPathInfo() {
        return urlPathInfo;
    }

    /**
     * Sets the value of the urlPathInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlPathInfo(String value) {
        this.urlPathInfo = value;
    }

}
