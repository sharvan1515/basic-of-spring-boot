package com.example.basic_of_spring_boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @Autowired
    private UserRepository userRepository;

    @Value("${app.greeting:Hello, World!}")
    private String greeting;

    @GetMapping("/")
    public String home() {
        return greeting;
    }

    @GetMapping("/roles")
    public List<Role> getAllData() {
        return userRepository.findAll();
    }
}

