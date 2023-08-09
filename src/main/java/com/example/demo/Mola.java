package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mola {

    @GetMapping("/hola")
    public String gethola(){
        System.out.println("is that ok");
        return "hazaki";
    }

}
