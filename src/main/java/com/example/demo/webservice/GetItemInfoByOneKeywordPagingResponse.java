
package com.example.demo.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡgetItemInfoByOneKeywordPagingResult���Ե�ֵ��
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
     * ����getItemInfoByOneKeywordPagingResult���Ե�ֵ��
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
