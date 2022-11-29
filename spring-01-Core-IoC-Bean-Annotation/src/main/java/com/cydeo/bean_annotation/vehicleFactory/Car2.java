package com.cydeo.bean_annotation.vehicleFactory;

public class Car2 extends Vehicle{

    public Car2(String make, String model, Integer year) {
        super(make, model, year);
    }

    @Override
    void startTheCar() {
        System.out.println("To start the engine, push the start button");
    }
}
