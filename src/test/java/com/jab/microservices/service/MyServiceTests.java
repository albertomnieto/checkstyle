package com.jab.microservices.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests class 4 MyService
 *
 */
@SpringBootTest
public class MyServiceTests {

    @Autowired
    private MyService myService;

    @Test
    public void greetReturnMessage() {
        assertEquals("Hello, World", myService.greet());
    }


}
