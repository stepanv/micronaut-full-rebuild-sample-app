package com.example;

import jakarta.inject.Singleton;

/**
 * Modifying this class WILL NOT trigger a full rebuild.
 */
@Singleton
class MyInterfaceImpl implements MyInterface {

    public String hello(String input) {
        return "foo".equals(input) ? "hello" : "HELLO";
//        return "foo".equals(input.toLowerCase()) ? "hello" : "HELLO";
    }
}
