package com.example.SpringProject1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // = @Controller + @ResponseBody
@RequestMapping("/demo/apis")
public class DemoController {


    @GetMapping("/demo1")
    public String getDemo1(){
        System.out.println("Hello i am demo1 method");
        return "Hey i am demo1";
    }

    @GetMapping("/demo2")
    public String getDemo2(){
        System.out.println("Hello i am demo2 method");
        return "Hey i am demo2";
    }

}
