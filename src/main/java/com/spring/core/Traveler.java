package com.spring.core;

public class Traveler{
    private Vehicle vehicle = null;

    public Traveler(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void startJourney() {
        this.vehicle.move();
    }
}
