package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/demo")
public class TestController {

    @GetMapping("/hello")
    public String getResponse() {
        return "Hello World";
    }
}
