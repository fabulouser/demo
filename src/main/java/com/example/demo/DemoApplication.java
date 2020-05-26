package com.example.demo;

import org.omg.CORBA.portable.InvokeHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@ImportResource(locations = {"classpath:redissonConfig-${spring.profiles.active}.xml"})
@EnableSwagger2
@EnableAspectJAutoProxy(exposeProxy = true)
public class DemoApplication  {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

