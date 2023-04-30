package com.example.googlecloud2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HealthController {

    @GetMapping("/new/api")
    public String health() {
        return "Prepare google cloud api.";
    }

    @GetMapping("/new/users")
    public String users() {
        return "Prepare google users.";
    }
}
