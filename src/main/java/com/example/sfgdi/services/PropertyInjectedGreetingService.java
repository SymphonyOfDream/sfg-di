package com.example.sfgdi.services;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello, World - Property";
    }
}
