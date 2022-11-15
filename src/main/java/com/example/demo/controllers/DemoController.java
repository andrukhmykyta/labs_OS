package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class DemoController {

    @GetMapping("/")
    public String first() {
        return "Hello from Spring Boot!";
    }
    
    @GetMapping("/lab")
    public String second() {
        return "Lab 6 was successfully done!";
    }
    
    @GetMapping("/x")
    public String secondx() {
        return "x!";
    }
}
