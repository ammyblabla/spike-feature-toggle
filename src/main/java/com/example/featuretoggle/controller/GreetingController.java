package com.example.featuretoggle.controller;

import com.example.featuretoggle.service.HolidayGreetingService;
import com.example.featuretoggle.service.StandardGreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.togglz.core.manager.FeatureManager;

import static com.example.featuretoggle.GreetingFeatures.HOLIDAY;

@RestController
@RequiredArgsConstructor
public class GreetingController {
    private final StandardGreetingService standardGreetingService;
    private final HolidayGreetingService holidayGreetingService;

    private final FeatureManager featureManager;

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "world") String name) {
        return standardGreetingService.getGreeting(name);
    }

    @RequestMapping("/holiday")
    public String holidayGreeting(@RequestParam(value = "name", defaultValue = "world") String name) {
        if (HOLIDAY.isActive()) {
            return holidayGreetingService.getGreeting(name);
        }
        return "Today is not holiday :(";
    }
}
