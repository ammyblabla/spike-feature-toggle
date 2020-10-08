package com.example.featuretoggle.configuration;

import com.example.featuretoggle.service.GreetingService;
import com.example.featuretoggle.service.HolidayGreetingService;
import com.example.featuretoggle.service.StandardGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingConfiguration {
    @Bean
    @Profile("!holidaySeason")
    public GreetingService getStandardGreetingService() {
        return new StandardGreetingService();
    }

    @Bean
    @Profile("holidaySeason")
    public GreetingService getGreetingService() {
        return new HolidayGreetingService();
    }
}
