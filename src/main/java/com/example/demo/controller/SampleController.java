package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/Balu")
    public  String SampleMethod()
    {
        return "Hello i am Fine!";
    }
}