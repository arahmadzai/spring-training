package com.cydeo.bean_annotation.config;

import com.cydeo.bean_annotation.vehicleFactory.Car1;
import com.cydeo.bean_annotation.vehicleFactory.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CarConfig {

    @Bean(name = "toyota")
    @Primary
    public Vehicle toyota(){
        Vehicle toyota = new Car1("Toyota", "Corolla", 2012);

        return toyota;
    }

    @Bean(name = "lexus")
    public Vehicle lexus(){
        Vehicle lexus = new Car1("Lexus", "LX760", 2023);

        return lexus;
    }
}
