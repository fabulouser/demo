package com.example.demo.controller;

import java.util.concurrent.atomic.AtomicInteger;

public class Test {
    //public volatile AtomicInteger inc = new AtomicInteger(0);

    public volatile int inc = 0;


//    public void increase() {
//        inc.addAndGet(1);
//    }
      public void increase() {
          synchronized (this){
              inc++;
          }
       }


    public static void main(String[] args) {
        final Test test = new Test();
        for(int i=0;i<10;i++){
            new Thread(){
                @Override
                public void run() {
                    for(int j=0;j<1000;j++){
                        test.increase();
                    }
                };
            }.start();
        }

        while(Thread.activeCount()>2){
            //保证前面的线程都执行完
            Thread.yield();
        }
        System.out.println(test.inc);
    }
}