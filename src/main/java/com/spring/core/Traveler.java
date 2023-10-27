package com.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("traveler")
public class Traveler{
    private Vehicle vehicle = null;

    @Autowired
public Traveler(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void startJourney() {
        this.vehicle.move();
    }
}
