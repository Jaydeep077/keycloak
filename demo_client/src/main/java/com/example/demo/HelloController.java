package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(Principal principal) {
        return "Hello, " + principal.getName();
    }

    @GetMapping("/public")
    public String publicPage() {
        return "This is public!";
    }
}
