package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationAdapter;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Service
public class DemoService {
    public void aopTest(){
        System.out.println("service方法调用");
    }

    @Transactional(rollbackFor = Exception.class)
    public void transactionTest(){
        System.out.println("DemoService方法调用");

        TransactionSynchronizationManager.registerSynchronization(new TransactionSynchronizationAdapter() {
                                                                      @Override
                                                                      public void afterCommit() {
                                                                          try {
                                                                              Thread.sleep(1000*20);
                                                                          } catch (InterruptedException e) {
                                                                              e.printStackTrace();
                                                                          }
                                                                          System.out.println("send email after transaction commit...");
                                                                      }
                                                                  }
        );
        //throw new IllegalStateException("123");
    }
}
