package com.example.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloworldController {

    @GetMapping("/")
    public String getWelcomeText() {
        return "Hello World";
    }

    @GetMapping("/name1")
    public String getName1() {
        return "Ravi teja";
    }

    @GetMapping("/name2")
    public String getName2() {
        return "Raviteja";
    }
}