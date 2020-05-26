package com.example.demo.controller;

import com.example.demo.rabbitmq.Sender;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbitmq")
public class RabbitMqTestController {

    @Autowired
    private Sender sender;
    private ConnectionFactory factory;

    @GetMapping("/send")
    public String send() throws Exception {
        sender.send();
        return "成功";
    }
}
