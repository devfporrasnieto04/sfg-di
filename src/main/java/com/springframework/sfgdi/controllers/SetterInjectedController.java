package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private GreetingServices greetingServices;
@Autowired
    public void setGreetingServices(@Qualifier("setterGreetingServiceImpl") GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String getGreeting(){
        return greetingServices.sayGreetings();
    }
}
