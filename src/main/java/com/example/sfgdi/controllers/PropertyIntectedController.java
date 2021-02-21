package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyIntectedController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
