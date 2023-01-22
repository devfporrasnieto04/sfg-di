package com.springframework.sfgdi.controllers;

import com.springframework.sfgdi.services.GreetingServices;
import com.springframework.sfgdi.services.PrimaryBeanGreatingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
private final GreetingServices greetingServices;

    public MyController(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String sayHello (){
        return greetingServices.sayGreetings();
    }

}
