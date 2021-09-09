package com.jab.microservices;

import org.springframework.stereotype.Service;

/**
 * Service class used by Secondary Controller MyController2.java.
 *
 */

@Service
public class MyService {


    /**
     *
     * greet method.
     *
     * @return - String
     *
     */
    public String greet() {
        return "Hello, World";
    }
}
