package com.sinha.aditya.graphql.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("my")
public class HelloWorldController {

    Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);

    @GetMapping("/hello")
    public String greetings() {
        LOGGER.info("Inside Hello controller");
        return "Hello World!!";
    }
}
