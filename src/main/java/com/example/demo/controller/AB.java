package com.example.demo.controller;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.Feature;
import com.example.demo.entity.TestJSONFieldAndJSONFormat;
import com.example.demo.entity.TestJacksonNullField;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RequestMapping("/mmm")
@RestController("mmm")
public class AB {
    @Autowired
    StringRedisTemplate redisTemplate ;

    @GetMapping("/add")
    @Transactional
    public String add()  {

        redisTemplate.setEnableTransactionSupport(true);
        redisTemplate.opsForValue().set("key","value");
        int i=1/0;
        String value=redisTemplate.opsForValue().get("key");
        return value;
    }

    @PostMapping(value = "/testInteger",consumes = "application/x-www-form-urlencoded")
    @Transactional
    public String testInteger(@RequestBody Integer i)  {


        System.out.println(i);

        return i+"";
    }

    @GetMapping(value = "/testDate")
    @Transactional
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    public Date testDate(@RequestParam @DateTimeFormat(pattern = "yyyy/MM/dd") Date date)  {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = simpleDateFormat.format(date);
        System.out.println(dateString);
        return date;
    }



    @GetMapping(value = "/testDate222")
    @Transactional
    public TestJacksonNullField testDate222(@RequestParam @DateTimeFormat(pattern = "yyyy/MM/dd") Date date)  {

        TestJacksonNullField testJacksonNullField = new TestJacksonNullField();
        testJacksonNullField.setLs(1);
        testJacksonNullField.setMyDate(date);
        System.out.println(date.toLocaleString());
        return testJacksonNullField;
    }

    @PostMapping(value = "/testDate333")
    @Transactional
    public Date testDate333(@RequestBody TestJSONFieldAndJSONFormat testJSONFieldAndJSONFormat)  {

        System.out.println(testJSONFieldAndJSONFormat.getMyDate().toLocaleString());
        return testJSONFieldAndJSONFormat.getMyDate();
    }

    public static void main(String[] args){
        DecimalFormat    df   = new DecimalFormat("######0.00");

        double d1 = 3.23456;
        double d2 = 0.0;
        double d3 = 2.0;
        df.format(d1);
        df.format(d2);
        df.format(d3);

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = simpleDateFormat.format(date);
        System.out.println(dateString);
    }

}
