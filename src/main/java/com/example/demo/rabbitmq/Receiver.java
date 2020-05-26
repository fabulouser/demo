package com.example.demo.rabbitmq;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component

public class Receiver {
    @RabbitListener( bindings = @QueueBinding(
            value = @Queue(value = "record", durable = "true"),
            exchange = @Exchange(value = "confirmExchange", durable = "true"),
            key = "keykeykey"))
    @RabbitHandler
    public void process(String hello, Channel channel, Message message) throws InterruptedException {


        System.out.println("开始了开始了");

        //int result = 1 / 0;
        Thread.sleep(20000);
        System.out.println("Receiver : " + hello);
//        try {
//
////            System.out.println("处理中");
////            Thread.sleep(20000);
////            System.out.println("处理结束");
//            //channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
//        }catch (InterruptedException e) {
//            e.printStackTrace();
////        } catch (IOException e) {
////            e.printStackTrace();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }
}
