package com.example;

/**
 * Modifying this class WILL trigger a full rebuild.
 */
class MyServiceThroughFactory {

    public String hello(String input) {
        // comment and uncomment next 2 lines to get a full rebuild
//        return "foo".equals(input) ? "hello3" : "HELLO";
        return "foo".equals(input.toLowerCase()) ? "hello3" : "HELLO";
    }
}
