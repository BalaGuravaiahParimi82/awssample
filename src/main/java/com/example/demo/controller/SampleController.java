package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SampleController {

    @GetMapping("/Balu")
    public  String SampleMethod()
    {
        return "Hello Your Application is Successfully Deployed to AWS. Happy Coding!!";
    }
    @GetMapping("/Srihari")
    public  String SampleMethod1()
    {

        return "Hello Srihari...Your Application is Successfully Deployed to AWS. Happy Coding!";
    }
}