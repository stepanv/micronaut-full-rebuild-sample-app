package com.example;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("test-2")
public class ConfProp2 {

    private String hello;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
