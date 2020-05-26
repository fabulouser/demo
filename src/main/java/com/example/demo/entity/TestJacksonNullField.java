package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Data
public class TestJacksonNullField {

    private Integer ls;
    private Integer rs;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date myDate;

}
