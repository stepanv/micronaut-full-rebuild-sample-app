package com.example;

/**
 * Modifying this interface WILL trigger a full rebuild.
 */
public interface MyInterface {
    String hello(String input);

    // uncomment this to get a full rebuild

    default String hello2(String input) {
        return "foo";
    }
}
