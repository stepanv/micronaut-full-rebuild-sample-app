package com.example;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("test-1")
public class ConfProp1 {

    private String hello;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
