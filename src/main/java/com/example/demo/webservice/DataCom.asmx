<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://tempuri.org/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://tempuri.org/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://tempuri.org/">
      <s:element name="ClearUserInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SchoolID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="WebservicePwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="UserBarcode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ClearUserInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ClearUserInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DownloadUserInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SchoolID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="WebservicePwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="UserBarcode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DownloadUserInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DownloadUserInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateItemInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SchoolID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="WebservicePwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="ItemBarcode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="ItemRFID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="ItemLocationNum" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateItemInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="UpdateItemInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateUserInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SchoolID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="WebservicePwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="UserBarcode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="UserRFID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UpdateUserInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="UpdateUserInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateNewUser">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SchoolID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="WebservicePwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="UserDepartment" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="UserBarcode" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="UserName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="UserRFID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="UserRightGroup" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="UserRegDate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="UserExpiryDate" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateNewUserResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CreateNewUserResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateNewDepartment">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SchoolID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="WebservicePwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Department" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="SuperiorDepartment" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateNewDepartmentResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CreateNewDepartmentResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemInfo">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SchoolID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="WebservicePwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="ItemID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemInfoResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetItemInfoResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemInfoByLocation">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SchoolID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="WebservicePwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Itemlocationnum" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemInfoByLocationResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetItemInfoByLocationResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetUserBorrowRecords">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SchoolID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="WebservicePwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="UserID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="StartDate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="EndDate" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetUserBorrowRecordsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetUserBorrowRecordsResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetALLBorrowRecords">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SchoolID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="WebservicePwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="StartDate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="EndDate" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetALLBorrowRecordsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetALLBorrowRecordsResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetUserReadDuration">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SchoolID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="WebservicePwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="UserID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="StartDate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="EndDate" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetUserReadDurationResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetUserReadDurationResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemInfoByDate">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SchoolID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="WebservicePwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="StartStorageDate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="EndStorageDate" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemInfoByDateResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetItemInfoByDateResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemInfoByKeywords">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SchoolID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="WebservicePwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="ItemName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="ItemClassFication" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="ItemCallNumber" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemInfoByKeywordsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetItemInfoByKeywordsResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetBookBorrowTopX">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SchoolID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="WebservicePwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="ItemType" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="TopX" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="StartDate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="EndDate" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetBookBorrowTopXResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetBookBorrowTopXResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemBorrowRecords">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SchoolID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="WebservicePwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="ItemKeywords" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="StartDate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="EndDate" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemBorrowRecordsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetItemBorrowRecordsResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetUserBorrowTopX">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SchoolID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="WebservicePwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="ItemType" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="UserDepartment" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="TopX" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="StartDate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="EndDate" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetUserBorrowTopXResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetUserBorrowTopXResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemInfoByKeywordsPaging">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SchoolID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="WebservicePwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Title" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Author" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Publisher" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="ISBN" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="NumPerPage" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="PageNumber" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemInfoByKeywordsPagingResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetItemInfoByKeywordsPagingResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemInfoByBatchNumPaging">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SchoolID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="WebservicePwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="BatchNum" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="NumPerPage" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="PageNumber" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemInfoByBatchNumPagingResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetItemInfoByBatchNumPagingResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemInfoByOneKeywordPaging">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SchoolID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="WebservicePwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="OneKeyword" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="NumPerPage" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="PageNumber" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemInfoByOneKeywordPagingResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetItemInfoByOneKeywordPagingResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemNumByOneKeyword">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SchoolID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="WebservicePwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="OneKeyword" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemNumByOneKeywordResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetItemNumByOneKeywordResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemNumByKeywords">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SchoolID" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="WebservicePwd" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Title" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Author" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="Publisher" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetItemNumByKeywordsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetItemNumByKeywordsResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="ClearUserInfoSoapIn">
    <wsdl:part name="parameters" element="tns:ClearUserInfo" />
  </wsdl:message>
  <wsdl:message name="ClearUserInfoSoapOut">
    <wsdl:part name="parameters" element="tns:ClearUserInfoResponse" />
  </wsdl:message>
  <wsdl:message name="DownloadUserInfoSoapIn">
    <wsdl:part name="parameters" element="tns:DownloadUserInfo" />
  </wsdl:message>
  <wsdl:message name="DownloadUserInfoSoapOut">
    <wsdl:part name="parameters" element="tns:DownloadUserInfoResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateItemInfoSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateItemInfo" />
  </wsdl:message>
  <wsdl:message name="UpdateItemInfoSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateItemInfoResponse" />
  </wsdl:message>
  <wsdl:message name="UpdateUserInfoSoapIn">
    <wsdl:part name="parameters" element="tns:UpdateUserInfo" />
  </wsdl:message>
  <wsdl:message name="UpdateUserInfoSoapOut">
    <wsdl:part name="parameters" element="tns:UpdateUserInfoResponse" />
  </wsdl:message>
  <wsdl:message name="CreateNewUserSoapIn">
    <wsdl:part name="parameters" element="tns:CreateNewUser" />
  </wsdl:message>
  <wsdl:message name="CreateNewUserSoapOut">
    <wsdl:part name="parameters" element="tns:CreateNewUserResponse" />
  </wsdl:message>
  <wsdl:message name="CreateNewDepartmentSoapIn">
    <wsdl:part name="parameters" element="tns:CreateNewDepartment" />
  </wsdl:message>
  <wsdl:message name="CreateNewDepartmentSoapOut">
    <wsdl:part name="parameters" element="tns:CreateNewDepartmentResponse" />
  </wsdl:message>
  <wsdl:message name="GetItemInfoSoapIn">
    <wsdl:part name="parameters" element="tns:GetItemInfo" />
  </wsdl:message>
  <wsdl:message name="GetItemInfoSoapOut">
    <wsdl:part name="parameters" element="tns:GetItemInfoResponse" />
  </wsdl:message>
  <wsdl:message name="GetItemInfoByLocationSoapIn">
    <wsdl:part name="parameters" element="tns:GetItemInfoByLocation" />
  </wsdl:message>
  <wsdl:message name="GetItemInfoByLocationSoapOut">
    <wsdl:part name="parameters" element="tns:GetItemInfoByLocationResponse" />
  </wsdl:message>
  <wsdl:message name="GetUserBorrowRecordsSoapIn">
    <wsdl:part name="parameters" element="tns:GetUserBorrowRecords" />
  </wsdl:message>
  <wsdl:message name="GetUserBorrowRecordsSoapOut">
    <wsdl:part name="parameters" element="tns:GetUserBorrowRecordsResponse" />
  </wsdl:message>
  <wsdl:message name="GetALLBorrowRecordsSoapIn">
    <wsdl:part name="parameters" element="tns:GetALLBorrowRecords" />
  </wsdl:message>
  <wsdl:message name="GetALLBorrowRecordsSoapOut">
    <wsdl:part name="parameters" element="tns:GetALLBorrowRecordsResponse" />
  </wsdl:message>
  <wsdl:message name="GetUserReadDurationSoapIn">
    <wsdl:part name="parameters" element="tns:GetUserReadDuration" />
  </wsdl:message>
  <wsdl:message name="GetUserReadDurationSoapOut">
    <wsdl:part name="parameters" element="tns:GetUserReadDurationResponse" />
  </wsdl:message>
  <wsdl:message name="GetItemInfoByDateSoapIn">
    <wsdl:part name="parameters" element="tns:GetItemInfoByDate" />
  </wsdl:message>
  <wsdl:message name="GetItemInfoByDateSoapOut">
    <wsdl:part name="parameters" element="tns:GetItemInfoByDateResponse" />
  </wsdl:message>
  <wsdl:message name="GetItemInfoByKeywordsSoapIn">
    <wsdl:part name="parameters" element="tns:GetItemInfoByKeywords" />
  </wsdl:message>
  <wsdl:message name="GetItemInfoByKeywordsSoapOut">
    <wsdl:part name="parameters" element="tns:GetItemInfoByKeywordsResponse" />
  </wsdl:message>
  <wsdl:message name="GetBookBorrowTopXSoapIn">
    <wsdl:part name="parameters" element="tns:GetBookBorrowTopX" />
  </wsdl:message>
  <wsdl:message name="GetBookBorrowTopXSoapOut">
    <wsdl:part name="parameters" element="tns:GetBookBorrowTopXResponse" />
  </wsdl:message>
  <wsdl:message name="GetItemBorrowRecordsSoapIn">
    <wsdl:part name="parameters" element="tns:GetItemBorrowRecords" />
  </wsdl:message>
  <wsdl:message name="GetItemBorrowRecordsSoapOut">
    <wsdl:part name="parameters" element="tns:GetItemBorrowRecordsResponse" />
  </wsdl:message>
  <wsdl:message name="GetUserBorrowTopXSoapIn">
    <wsdl:part name="parameters" element="tns:GetUserBorrowTopX" />
  </wsdl:message>
  <wsdl:message name="GetUserBorrowTopXSoapOut">
    <wsdl:part name="parameters" element="tns:GetUserBorrowTopXResponse" />
  </wsdl:message>
  <wsdl:message name="GetItemInfoByKeywordsPagingSoapIn">
    <wsdl:part name="parameters" element="tns:GetItemInfoByKeywordsPaging" />
  </wsdl:message>
  <wsdl:message name="GetItemInfoByKeywordsPagingSoapOut">
    <wsdl:part name="parameters" element="tns:GetItemInfoByKeywordsPagingResponse" />
  </wsdl:message>
  <wsdl:message name="GetItemInfoByBatchNumPagingSoapIn">
    <wsdl:part name="parameters" element="tns:GetItemInfoByBatchNumPaging" />
  </wsdl:message>
  <wsdl:message name="GetItemInfoByBatchNumPagingSoapOut">
    <wsdl:part name="parameters" element="tns:GetItemInfoByBatchNumPagingResponse" />
  </wsdl:message>
  <wsdl:message name="GetItemInfoByOneKeywordPagingSoapIn">
    <wsdl:part name="parameters" element="tns:GetItemInfoByOneKeywordPaging" />
  </wsdl:message>
  <wsdl:message name="GetItemInfoByOneKeywordPagingSoapOut">
    <wsdl:part name="parameters" element="tns:GetItemInfoByOneKeywordPagingResponse" />
  </wsdl:message>
  <wsdl:message name="GetItemNumByOneKeywordSoapIn">
    <wsdl:part name="parameters" element="tns:GetItemNumByOneKeyword" />
  </wsdl:message>
  <wsdl:message name="GetItemNumByOneKeywordSoapOut">
    <wsdl:part name="parameters" element="tns:GetItemNumByOneKeywordResponse" />
  </wsdl:message>
  <wsdl:message name="GetItemNumByKeywordsSoapIn">
    <wsdl:part name="parameters" element="tns:GetItemNumByKeywords" />
  </wsdl:message>
  <wsdl:message name="GetItemNumByKeywordsSoapOut">
    <wsdl:part name="parameters" element="tns:GetItemNumByKeywordsResponse" />
  </wsdl:message>
  <wsdl:portType name="DataComSoap">
    <wsdl:operation name="ClearUserInfo">
      <wsdl:input message="tns:ClearUserInfoSoapIn" />
      <wsdl:output message="tns:ClearUserInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DownloadUserInfo">
      <wsdl:input message="tns:DownloadUserInfoSoapIn" />
      <wsdl:output message="tns:DownloadUserInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateItemInfo">
      <wsdl:input message="tns:UpdateItemInfoSoapIn" />
      <wsdl:output message="tns:UpdateItemInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UpdateUserInfo">
      <wsdl:input message="tns:UpdateUserInfoSoapIn" />
      <wsdl:output message="tns:UpdateUserInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CreateNewUser">
      <wsdl:input message="tns:CreateNewUserSoapIn" />
      <wsdl:output message="tns:CreateNewUserSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CreateNewDepartment">
      <wsdl:input message="tns:CreateNewDepartmentSoapIn" />
      <wsdl:output message="tns:CreateNewDepartmentSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetItemInfo">
      <wsdl:input message="tns:GetItemInfoSoapIn" />
      <wsdl:output message="tns:GetItemInfoSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetItemInfoByLocation">
      <wsdl:input message="tns:GetItemInfoByLocationSoapIn" />
      <wsdl:output message="tns:GetItemInfoByLocationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetUserBorrowRecords">
      <wsdl:input message="tns:GetUserBorrowRecordsSoapIn" />
      <wsdl:output message="tns:GetUserBorrowRecordsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetALLBorrowRecords">
      <wsdl:input message="tns:GetALLBorrowRecordsSoapIn" />
      <wsdl:output message="tns:GetALLBorrowRecordsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetUserReadDuration">
      <wsdl:input message="tns:GetUserReadDurationSoapIn" />
      <wsdl:output message="tns:GetUserReadDurationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetItemInfoByDate">
      <wsdl:input message="tns:GetItemInfoByDateSoapIn" />
      <wsdl:output message="tns:GetItemInfoByDateSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetItemInfoByKeywords">
      <wsdl:input message="tns:GetItemInfoByKeywordsSoapIn" />
      <wsdl:output message="tns:GetItemInfoByKeywordsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetBookBorrowTopX">
      <wsdl:input message="tns:GetBookBorrowTopXSoapIn" />
      <wsdl:output message="tns:GetBookBorrowTopXSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetItemBorrowRecords">
      <wsdl:input message="tns:GetItemBorrowRecordsSoapIn" />
      <wsdl:output message="tns:GetItemBorrowRecordsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetUserBorrowTopX">
      <wsdl:input message="tns:GetUserBorrowTopXSoapIn" />
      <wsdl:output message="tns:GetUserBorrowTopXSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetItemInfoByKeywordsPaging">
      <wsdl:input message="tns:GetItemInfoByKeywordsPagingSoapIn" />
      <wsdl:output message="tns:GetItemInfoByKeywordsPagingSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetItemInfoByBatchNumPaging">
      <wsdl:input message="tns:GetItemInfoByBatchNumPagingSoapIn" />
      <wsdl:output message="tns:GetItemInfoByBatchNumPagingSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetItemInfoByOneKeywordPaging">
      <wsdl:input message="tns:GetItemInfoByOneKeywordPagingSoapIn" />
      <wsdl:output message="tns:GetItemInfoByOneKeywordPagingSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetItemNumByOneKeyword">
      <wsdl:input message="tns:GetItemNumByOneKeywordSoapIn" />
      <wsdl:output message="tns:GetItemNumByOneKeywordSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GetItemNumByKeywords">
      <wsdl:input message="tns:GetItemNumByKeywordsSoapIn" />
      <wsdl:output message="tns:GetItemNumByKeywordsSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="DataComSoap" type="tns:DataComSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="ClearUserInfo">
      <soap:operation soapAction="http://tempuri.org/ClearUserInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DownloadUserInfo">
      <soap:operation soapAction="http://tempuri.org/DownloadUserInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateItemInfo">
      <soap:operation soapAction="http://tempuri.org/UpdateItemInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateUserInfo">
      <soap:operation soapAction="http://tempuri.org/UpdateUserInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateNewUser">
      <soap:operation soapAction="http://tempuri.org/CreateNewUser" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateNewDepartment">
      <soap:operation soapAction="http://tempuri.org/CreateNewDepartment" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemInfo">
      <soap:operation soapAction="http://tempuri.org/GetItemInfo" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemInfoByLocation">
      <soap:operation soapAction="http://tempuri.org/GetItemInfoByLocation" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetUserBorrowRecords">
      <soap:operation soapAction="http://tempuri.org/GetUserBorrowRecords" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetALLBorrowRecords">
      <soap:operation soapAction="http://tempuri.org/GetALLBorrowRecords" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetUserReadDuration">
      <soap:operation soapAction="http://tempuri.org/GetUserReadDuration" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemInfoByDate">
      <soap:operation soapAction="http://tempuri.org/GetItemInfoByDate" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemInfoByKeywords">
      <soap:operation soapAction="http://tempuri.org/GetItemInfoByKeywords" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetBookBorrowTopX">
      <soap:operation soapAction="http://tempuri.org/GetBookBorrowTopX" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemBorrowRecords">
      <soap:operation soapAction="http://tempuri.org/GetItemBorrowRecords" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetUserBorrowTopX">
      <soap:operation soapAction="http://tempuri.org/GetUserBorrowTopX" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemInfoByKeywordsPaging">
      <soap:operation soapAction="http://tempuri.org/GetItemInfoByKeywordsPaging" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemInfoByBatchNumPaging">
      <soap:operation soapAction="http://tempuri.org/GetItemInfoByBatchNumPaging" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemInfoByOneKeywordPaging">
      <soap:operation soapAction="http://tempuri.org/GetItemInfoByOneKeywordPaging" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemNumByOneKeyword">
      <soap:operation soapAction="http://tempuri.org/GetItemNumByOneKeyword" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemNumByKeywords">
      <soap:operation soapAction="http://tempuri.org/GetItemNumByKeywords" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="DataComSoap12" type="tns:DataComSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="ClearUserInfo">
      <soap12:operation soapAction="http://tempuri.org/ClearUserInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DownloadUserInfo">
      <soap12:operation soapAction="http://tempuri.org/DownloadUserInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateItemInfo">
      <soap12:operation soapAction="http://tempuri.org/UpdateItemInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UpdateUserInfo">
      <soap12:operation soapAction="http://tempuri.org/UpdateUserInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateNewUser">
      <soap12:operation soapAction="http://tempuri.org/CreateNewUser" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateNewDepartment">
      <soap12:operation soapAction="http://tempuri.org/CreateNewDepartment" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemInfo">
      <soap12:operation soapAction="http://tempuri.org/GetItemInfo" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemInfoByLocation">
      <soap12:operation soapAction="http://tempuri.org/GetItemInfoByLocation" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetUserBorrowRecords">
      <soap12:operation soapAction="http://tempuri.org/GetUserBorrowRecords" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetALLBorrowRecords">
      <soap12:operation soapAction="http://tempuri.org/GetALLBorrowRecords" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetUserReadDuration">
      <soap12:operation soapAction="http://tempuri.org/GetUserReadDuration" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemInfoByDate">
      <soap12:operation soapAction="http://tempuri.org/GetItemInfoByDate" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemInfoByKeywords">
      <soap12:operation soapAction="http://tempuri.org/GetItemInfoByKeywords" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetBookBorrowTopX">
      <soap12:operation soapAction="http://tempuri.org/GetBookBorrowTopX" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemBorrowRecords">
      <soap12:operation soapAction="http://tempuri.org/GetItemBorrowRecords" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetUserBorrowTopX">
      <soap12:operation soapAction="http://tempuri.org/GetUserBorrowTopX" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemInfoByKeywordsPaging">
      <soap12:operation soapAction="http://tempuri.org/GetItemInfoByKeywordsPaging" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemInfoByBatchNumPaging">
      <soap12:operation soapAction="http://tempuri.org/GetItemInfoByBatchNumPaging" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemInfoByOneKeywordPaging">
      <soap12:operation soapAction="http://tempuri.org/GetItemInfoByOneKeywordPaging" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemNumByOneKeyword">
      <soap12:operation soapAction="http://tempuri.org/GetItemNumByOneKeyword" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GetItemNumByKeywords">
      <soap12:operation soapAction="http://tempuri.org/GetItemNumByKeywords" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="DataCom">
    <wsdl:port name="DataComSoap" binding="tns:DataComSoap">
      <soap:address location="http://139.224.235.152/DataCom.asmx" />
    </wsdl:port>
    <wsdl:port name="DataComSoap12" binding="tns:DataComSoap12">
      <soap12:address location="http://139.224.235.152/DataCom.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>