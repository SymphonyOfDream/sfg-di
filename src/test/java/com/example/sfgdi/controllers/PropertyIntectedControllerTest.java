package com.example.sfgdi.controllers;

import com.example.sfgdi.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyIntectedControllerTest {

    PropertyIntectedController controller;

    @BeforeEach
    void setup() {
        controller = new PropertyIntectedController();

        controller.greetingService = new ConstructorInjectedGreetingService();
    }


    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}