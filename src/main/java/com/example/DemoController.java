package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import jakarta.inject.Inject;


@Controller
public class DemoController {

    private final MyInterface myInterface;
    private final MyService myService;
    private final MyServiceThroughFactory myServiceThroughFactory;

    @Inject
    public DemoController(
            MyInterface myInterface,
            MyService myService,
            MyServiceThroughFactory myServiceThroughFactory
    ) {
        this.myService = myService;
        this.myInterface = myInterface;
        this.myServiceThroughFactory = myServiceThroughFactory;
    }

    @Get("/message")
    String message(
            @QueryValue(value = "q", defaultValue = "i") String q,
            @QueryValue(value = "param", defaultValue = "world") String param
    ) {
        return switch (q) {
            case "i" -> myInterface.hello(param);
            case "s" -> myService.hello(param);
            case "f" -> myServiceThroughFactory.hello(param);
            default -> throw new UnsupportedOperationException();
        };
    }
}
