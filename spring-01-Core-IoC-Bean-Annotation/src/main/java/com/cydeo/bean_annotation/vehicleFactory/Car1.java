package com.cydeo.bean_annotation.vehicleFactory;

public class Car1 extends Vehicle{

    public Car1(String make, String model, Integer year) {
        super(make, model, year);
    }

    @Override
    void startTheCar() {
        System.out.println("switch the key in ignition to start");
    }
}
