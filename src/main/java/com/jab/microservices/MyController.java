package com.jab.microservices;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controller class which receives root requests.
 *
 */
@Controller
public class MyController {

    /**
     *
     * root endpoint point method.
     *
     * @return - String
     */
    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello, World";
    }

}
