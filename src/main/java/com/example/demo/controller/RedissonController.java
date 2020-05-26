//package com.example.demo.controller;
//
//import com.example.demo.service.RedissonService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/redisson")
//public class RedissonController {
//
//    @Autowired
//    RedissonService redissonService;
//
//    public static int number = 0;
//    @GetMapping("/increase")
//    public void increaseNumber(){
//          redissonService.increaseNumber();
//    }
//
//}
