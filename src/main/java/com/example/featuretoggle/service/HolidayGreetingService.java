package com.example.featuretoggle.service;

public class HolidayGreetingService implements GreetingService {
    @Override
    public String getGreeting(String name) {
        return String.format("Happy Holidays, %s!", name);
    }
}
