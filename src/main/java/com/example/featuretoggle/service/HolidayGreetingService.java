package com.example.featuretoggle.service;

import org.springframework.stereotype.Service;

@Service
public class HolidayGreetingService implements GreetingService {
    String format = "Happy Holidays, %s!";

    @Override
    public String getGreeting(String name) {
        return String.format(format, name);
    }
}
