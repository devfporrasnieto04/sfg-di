package com.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServicesImpl implements GreetingServices {
    @Override
    public String sayGreetings() {
        return "Hello World - Constructor ";
    }
}
