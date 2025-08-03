package com.example.SpringProject1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simple/apis")
public class SimpleController {

    @GetMapping("/simple")
    public String getSimple(){
        return "hey i am simple";
    }
}
