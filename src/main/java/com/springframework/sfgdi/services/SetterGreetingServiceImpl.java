package com.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingServices{
    @Override
    public String sayGreetings() {
        return "Hello World - Setter";
    }
}
