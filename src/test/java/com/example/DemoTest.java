package com.example;

import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest
public class DemoTest {

    @Inject
    @Client("/")
    HttpClient client;

    @Test
    void testItWorks() {
        var result = client.toBlocking().exchange("/message", String.class);

        Assertions.assertEquals("HELLO", result.body());
    }

}
