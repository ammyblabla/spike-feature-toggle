package com.example.featuretoggle.service;

import org.springframework.stereotype.Service;

@Service
public class StandardGreetingService implements GreetingService {
    String format = "Hello, %s!";

    @Override
    public String getGreeting(String name) {
        return String.format(format, name);
    }
}
