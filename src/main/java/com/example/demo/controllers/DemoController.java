package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class DemoController {

    @GetMapping("/")
    public String first() {
        return "Я ЖИВИИИИИИИИИИИИИИИИИИИИЙ!";
    }
    
    @GetMapping("/lab")
    public String second() {
        return "петро сила!";
    }
}
