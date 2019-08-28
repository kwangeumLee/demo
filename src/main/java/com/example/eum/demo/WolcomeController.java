package com.example.eum.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WolcomeController {


    private String message;

    public WolcomeController(@Value("${welcome.message}") String helloMsg) {this.message = helloMsg; }

    @GetMapping("/")
    public String sayHello() {
        return message;
    }
}

