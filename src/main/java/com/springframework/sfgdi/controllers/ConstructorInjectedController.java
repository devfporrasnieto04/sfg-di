package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.GreetingServices;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingServices greetingServices;

    public ConstructorInjectedController(@Qualifier("constructorGreetingServicesImpl") GreetingServices greetingServices){
        this.greetingServices = greetingServices;
    }

    public String getGreeting(){
        return greetingServices.sayGreetings();
    }
}
