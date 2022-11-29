package com.cydeo.bean_annotation.vehicleFactory;

public class Lexus extends Vehicle{

    public Lexus(String make, String model, Integer year) {
        super(make, model, year);
    }

    @Override
    void startTheCar() {
        System.out.println("To start the engine, push the start button");
    }
}
