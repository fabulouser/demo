package com.example.demo;

//import com.example.demo.rabbitmq.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@ImportResource(locations = {"classpath:redissonConfig-${spring.profiles.active}.xml"})
public class DemoApplicationTests  {


    @Test
    public void contextLoads() {
    }


}

