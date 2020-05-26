package com.example.demo.controller;

import com.example.demo.service.CglibDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/cglibProxyController")
@RestController()
public class CglibProxyController {

    @Autowired
    private CglibDemoService cglibDemoService;


    @GetMapping("/testThisTransaction")
    public void testThisTransaction(){
        cglibDemoService.testThisTransaction();
    }


    @GetMapping("/insertSomeThing")
    public void insertSomeThing(){
        cglibDemoService.insertSomeThing();
    }
}
