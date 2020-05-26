package com.example.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

@ServerEndpoint("/websocketServer")
@Component
public class WebSocketServer {
    // 日志记录
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    // 记录在线连接数，使用线程安全的AtomicInteger
    private static AtomicInteger onlineCount = new AtomicInteger(0);

    // 记录连接的session
    private static Queue<Session> sessionQueue = new ConcurrentLinkedQueue<>();

    /**
     * 连接成功调用
     */
    @OnOpen
    public void onOpen(Session session) {
        sessionQueue.add(session);
        onlineCount.getAndIncrement();
        logger.info("新连接加入，当前在线人数为：" + onlineCount);
        for (Session s : sessionQueue) {
            sendMessage(s, onlineCount+"人");
        }
    }

    /**
     * 连接关闭调用
     */
    @OnClose
    public void onClose(Session session) {
        sessionQueue.remove(session);
        onlineCount.getAndDecrement();
        logger.info("连接关闭，当前在线人数：" + onlineCount);
    }

    /**
     * 发生错误调用
     */
    @OnError
    public void onError(Session session, Throwable throwable) {
        sessionQueue.remove(session);
        logger.error("发生错误");
        throwable.printStackTrace();
    }

    /**
     * 收到客户端消息调用
     */
    @OnMessage
    public void onMessage(final Session session, String message) throws Exception {
        logger.info("来自客户端的消息：" + message);
        sendMessage(session, message);
        broadcastAll(message);
    }

    /**
     * 向对应session发送信息
     */
    private void sendMessage(Session session, String msg) {
        try {
            session.getBasicRemote().sendText(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 向全体session广播信息
     */
    private void broadcastAll(String msg) {
        for (Session s : sessionQueue) {
            sendMessage(s, msg);
        }
    }

    public static  void main(String args[]){
        WebSocketServer webSocketServer =new WebSocketServer();


        for (Session s : sessionQueue) {
            webSocketServer.sendMessage(s, "666");
        }
    }
}