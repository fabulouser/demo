package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.WeekTimeEnabled;
import com.example.demo.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/record")
public class RecordController {
    @Autowired
    RecordService recordService;

//    @PutMapping("/add")
//    public String updateAdd(Integer id,Integer num) throws InterruptedException {
//        recordService.updateAdd(id,num);
//        return "成功";
//
//    }
//
//    @PutMapping("/delete")
//    public String updateDelete(Integer id,Integer num){
//        recordService.updateDelete(id,num);
//        return "成功";
//
//    }
//
//
//    @PutMapping("/add222")
//    public String updateAdd222(Integer id,Integer num) throws InterruptedException {
//        recordService.updateAdd222(id,num);
//        return "成功";
//
//    }
//
//    @PutMapping("/delete222")
//    public String updateDelete222(Integer id,Integer num){
//        recordService.updateDelete222(id,num);
//        return "成功";
//
//    }


    @PostMapping("/transactionTest")
    public String transactionTest(@RequestBody List<WeekTimeEnabled> weekTimeEnabledList) throws InterruptedException {

        String string = JSONObject.toJSONString(weekTimeEnabledList);
        System.out.println(string);
        // recordService.transactionTest();
        return "成功";

    }

}
