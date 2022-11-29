package com.cydeo.bean_annotation.vehicleFactory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Vehicle {

    private String make;
    private String model;
    private Integer year;

    abstract void startTheCar();
}
