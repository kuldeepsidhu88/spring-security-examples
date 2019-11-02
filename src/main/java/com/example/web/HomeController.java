package com.example.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
