
package com.example.demo.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetItemInfoByOneKeywordPagingResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "getItemInfoByOneKeywordPagingResult"
})
@XmlRootElement(name = "GetItemInfoByOneKeywordPagingResponse")
public class GetItemInfoByOneKeywordPagingResponse {

    @XmlElement(name = "GetItemInfoByOneKeywordPagingResult")
    protected String getItemInfoByOneKeywordPagingResult;

    /**
     * 获取getItemInfoByOneKeywordPagingResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetItemInfoByOneKeywordPagingResult() {
        return getItemInfoByOneKeywordPagingResult;
    }

    /**
     * 设置getItemInfoByOneKeywordPagingResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetItemInfoByOneKeywordPagingResult(String value) {
        this.getItemInfoByOneKeywordPagingResult = value;
    }

}
