package com.spring.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Provides a simple "HelloWorld" REST endpoint.
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "HelloWorld";
    }
}