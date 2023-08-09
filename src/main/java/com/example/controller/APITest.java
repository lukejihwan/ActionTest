package com.example.controller;

import com.example.util.BeanTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APITest {

    @Autowired
    private Main main;

    @Autowired
    private BeanTest beanTest;

    @GetMapping("/hello")
    public String getHello(){
        System.out.println("호출됨");
        return "hello";
    }
}
