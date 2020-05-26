package com.example.demo.controller;

import com.example.demo.entity.TestArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RedisDemoController {

    @Autowired
    StringRedisTemplate stringRedisTemplate ;
    @Autowired
    RedisTemplate redisTemplate ;


    @GetMapping("/getStringKey")
    public String getStringKey(@RequestParam("key") String key){


        // 保存字符串
        stringRedisTemplate.opsForValue().set("aaa", "111");
        String s =stringRedisTemplate.opsForValue().get("aaa");
        Boolean flag=stringRedisTemplate.hasKey("222ad137-36fe-4619-aa65-9564943e113c");//检查key是否存在，返回boolean值

        return flag.toString() ;
    }

    @GetMapping("/getList")
    public String getList(@RequestParam("key") String key){


        List<String> myList = stringRedisTemplate.opsForList().range("myList", 0, -1);
        System.out.println(myList.toString());
        return myList.toString();
    }


    @PostMapping("/testArray")
    public String testArray(@RequestBody TestArray testArray){

        System.out.println(testArray.toString());
        return testArray.toString();
    }






}
