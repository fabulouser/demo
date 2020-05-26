package com.example.demo.entity;

import lombok.Data;


public enum EnumDemo {

    man("1"),
    women("2");
    private String value;

    public String getValue() {
        return value;
    }

    private EnumDemo(String value) {
        this.value = value;
    }
}
