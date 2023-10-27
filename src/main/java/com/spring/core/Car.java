package com.spring.core;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("car")
@Primary
public class Car implements Vehicle {
    @Override
    public void move(){
        System.out.println("Car is moving ..");
    }
}
