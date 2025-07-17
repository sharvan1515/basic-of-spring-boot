package com.example.basic_of_spring_boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @Value("${app.greeting:Hello, World!}")
    private String greeting;

    @GetMapping("/")
    public String home() {
        return greeting;
    }
}
