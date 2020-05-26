package com.example.demo.controller;

import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/aop")
public class TestAop {
    @Autowired
    public DemoController demoController;
    @Autowired
    public DemoService demoService;

    @GetMapping("/testAop")
    public void testAop(){
        demoController.nihao444();
        demoService.aopTest();
    }
}
