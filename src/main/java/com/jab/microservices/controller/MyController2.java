package com.jab.microservices.controller;

import com.jab.microservices.service.MyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/** Secondary controller class which receives requests to greeting endpoint. */
@Controller
@RequiredArgsConstructor
public class MyController2 {

  /** Service used 4 greeting. */
  private final MyService service;

  /**
   * "greeting" endpoint point method.
   *
   * @return - String
   */
  @RequestMapping("/greeting")
  public @ResponseBody String greeting() {
    return service.greet();
  }
}
