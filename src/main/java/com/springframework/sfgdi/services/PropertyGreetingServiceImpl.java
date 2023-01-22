package com.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingServices{
    @Override
    public String sayGreetings() {
        return "Hello World - Property";
    }
}
