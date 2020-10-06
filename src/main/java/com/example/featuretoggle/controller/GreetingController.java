package com.example.featuretoggle.controller;

import com.example.featuretoggle.service.GreetingService;
import com.example.featuretoggle.service.StandardGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private final GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "world") String name) {
        return greetingService.getGreeting(name);
    }
}
