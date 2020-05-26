//package com.example.demo.service;
//
//import com.example.demo.controller.UUIDUtil;
//import org.redisson.Redisson;
//import org.redisson.api.RLock;
//import org.redisson.api.RedissonClient;
//import org.redisson.config.Config;
//import org.redisson.config.TransportMode;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.security.SecureRandom;
//import java.util.Random;
//import java.util.UUID;
//import java.util.concurrent.TimeUnit;
//
//@Service
//public class RedissonService {
//
//
//    @Autowired
//    StringRedisTemplate redisTemplate;
//    @Autowired
//    RedissonClient redissonClient;
//
//    @Transactional(rollbackFor = Exception.class)
//    public void increaseNumber(){
////        synchronized (this){
////            Integer a = Integer.parseInt(redisTemplate.opsForValue().get("aaa"));
////            a = a+1;
////            redisTemplate.opsForValue().set("aaa" , String.valueOf(a));
////
////            System.out.println(a);
////            return a;
////        }
//
//        RLock lock = redissonClient.getLock("mylockdirectory"+ UUID.randomUUID().toString());
//        lock.lock();
//
//        try{
//
//            Integer a = Integer.parseInt(redisTemplate.opsForValue().get("aaa"));
//            a = a+1;
//            redisTemplate.opsForValue().set("aaa" , String.valueOf(a));
////            Thread.sleep(40000);
//
//            System.out.println(a);
//
//
////        } catch (InterruptedException e) {
////            e.printStackTrace();
//        } finally {
////            lock.unlock();
//        }
//
//    }
//
////    @Bean
////    public RedissonClient create(){
////        Config config = new Config();
////        config.setTransportMode(TransportMode.EPOLL);
////        config.useClusterServers()
////                //可以用"rediss://"来启用SSL连接
////                .addNodeAddress("redis://127.0.0.1:6379").set;
////        return redissonClient = Redisson.create(config);
////
////    }
//
//
//    public static void main(String[] args) {
//
//        System.out.println((String.valueOf(Math.random()*100)));
//
//        SecureRandom secureRandom = new SecureRandom();
//        System.out.println(secureRandom.nextInt(100));
//    }
//}
