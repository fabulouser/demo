
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
 *         &lt;element name="SchoolID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WebservicePwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BatchNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumPerPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "schoolID",
    "webservicePwd",
    "batchNum",
    "numPerPage",
    "pageNumber"
})
@XmlRootElement(name = "GetItemInfoByBatchNumPaging")
public class GetItemInfoByBatchNumPaging {

    @XmlElement(name = "SchoolID")
    protected String schoolID;
    @XmlElement(name = "WebservicePwd")
    protected String webservicePwd;
    @XmlElement(name = "BatchNum")
    protected String batchNum;
    @XmlElement(name = "NumPerPage")
    protected String numPerPage;
    @XmlElement(name = "PageNumber")
    protected String pageNumber;

    /**
     * ��ȡschoolID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolID() {
        return schoolID;
    }

    /**
     * ����schoolID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolID(String value) {
        this.schoolID = value;
    }

    /**
     * ��ȡwebservicePwd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebservicePwd() {
        return webservicePwd;
    }

    /**
     * ����webservicePwd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebservicePwd(String value) {
        this.webservicePwd = value;
    }

    /**
     * ��ȡbatchNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchNum() {
        return batchNum;
    }

    /**
     * ����batchNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchNum(String value) {
        this.batchNum = value;
    }

    /**
     * ��ȡnumPerPage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPerPage() {
        return numPerPage;
    }

    /**
     * ����numPerPage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPerPage(String value) {
        this.numPerPage = value;
    }

    /**
     * ��ȡpageNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageNumber() {
        return pageNumber;
    }

    /**
     * ����pageNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageNumber(String value) {
        this.pageNumber = value;
    }

}
