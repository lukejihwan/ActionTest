package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Main {

    @GetMapping("/main")
    public String getMain(){
        System.out.println("GIGIGI");
        return "hello-world";
    }

}
