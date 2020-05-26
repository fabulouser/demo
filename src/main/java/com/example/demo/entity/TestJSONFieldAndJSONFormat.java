package com.example.demo.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class TestJSONFieldAndJSONFormat {

    private Integer ls;
    private Integer rs;
//    @JSONField(format="yyyy-MM-dd")
//    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date myDate;

}
