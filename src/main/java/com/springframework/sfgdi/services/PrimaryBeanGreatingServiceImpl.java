package com.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class PrimaryBeanGreatingServiceImpl implements GreetingServices{

    @Override
    public String sayGreetings() {
        return "Hello World - PRIMARY BEAN";
    }
}
