package com.jab.microservices.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/** Tests class 4 MyService */
@SpringBootTest
public class MyServiceTests {

  @Autowired private MyService myService;

  @Test
  public void greetReturnMessage() {
    assertEquals("Hello, World", myService.greet());
  }
}
