package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.ConstructorGreetingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingServices(new ConstructorGreetingServicesImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting() );
    }
}