package com.example.featuretoggle.service;

public class StandardGreetingService implements GreetingService {
    @Override
    public String getGreeting(String name) {
        return String.format("Hello, %s!", name);
    }
}
