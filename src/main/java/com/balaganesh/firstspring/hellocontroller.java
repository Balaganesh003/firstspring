package com.balaganesh.firstspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {

    @GetMapping("/")
    public String home() {
        return "Welcome to the home page";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }


    @PostMapping("/hello")
    public String helloPost( @RequestBody String body) {
        return "Hello from POST" + body;
    }

}
