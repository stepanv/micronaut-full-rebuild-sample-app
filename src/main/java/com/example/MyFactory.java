package com.example;

import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;

/**
 * Modifying this class WILL NOT trigger a full rebuild.
 */
@Factory
public class MyFactory {

    @Bean
    MyServiceThroughFactory myServiceThroughFactory() {
        // uncomment this and no full rebuild is triggered
//         System.out.println("here");
        return new MyServiceThroughFactory();
    }
}
