package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APITest {

    @GetMapping("/hello")
    public String getHello(){

        return "hello";
    }
}
