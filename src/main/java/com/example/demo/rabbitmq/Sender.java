package com.example.demo.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Sender {


    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send() {

        String context = "hello" + new Date();
        System.out.println("Sender : " + context);

//        rabbitTemplate.setExchange("confirmExchange");
//        rabbitTemplate.setQueue("record");

        this.rabbitTemplate.convertAndSend("confirmExchange","keykeykey", context);
//        int i = 1/0;
//        this.rabbitTemplate.convertAndSend("confirmExchange","keykeykey", context);
    }


}
