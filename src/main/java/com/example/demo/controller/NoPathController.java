package com.example.demo.controller;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController()
@RequestMapping("/happy")
public class NoPathController {

    @GetMapping("/nihao")
    public String nihao(HttpServletRequest request, Integer id){
        int i =  1/0;
        return "nihao";
    }

    @GetMapping("/nihao2")
    public String nihao2(Integer id){
        return "nihao2";
    }
}
