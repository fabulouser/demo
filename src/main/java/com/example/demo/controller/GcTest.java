package com.example.demo.controller;



public class GcTest {

    private static GcTest SAVE_HOOK = null;

    public static void main(String[] args) throws Throwable {
        SAVE_HOOK = new GcTest();
        SAVE_HOOK = null;
        Runtime.getRuntime().gc();
        if (null != SAVE_HOOK) {
            System.out.println("复活");
        } else {
            System.out.println("去世");
        }
    }


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("复活之术");
        SAVE_HOOK = this;
    }
}