package com.example.featuretoggle.configuration;

import com.example.featuretoggle.service.GreetingService;
import com.example.featuretoggle.service.HolidayGreetingService;
import com.example.featuretoggle.service.StandardGreetingService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GreetingConfiguration {
    @Bean
    @Primary
    @ConditionalOnProperty(prefix = "feature.toggle", name = "holidaySeason", havingValue = "false")
    public GreetingService getStandardGreetingService() {
        return new StandardGreetingService();
    }

    @Bean
    @ConditionalOnProperty(prefix = "feature.toggle", name = "holidaySeason", havingValue = "true")
    public GreetingService getGreetingService() {
        return new HolidayGreetingService();
    }
}
