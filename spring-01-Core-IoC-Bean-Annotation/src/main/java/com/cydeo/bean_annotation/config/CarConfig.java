package com.cydeo.bean_annotation.config;

import com.cydeo.bean_annotation.vehicleFactory.Lexus;
import com.cydeo.bean_annotation.vehicleFactory.Toyota;
import com.cydeo.bean_annotation.vehicleFactory.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CarConfig {

    @Bean(name = "toyota")
    @Primary
    public Vehicle toyota(){
        Vehicle car1 = new Toyota("Toyota", "Corolla", 2012);

        return car1;
    }

    @Bean(name = "lexus")
    public Vehicle lexus(){
        Vehicle lexus = new Lexus("Lexus", "LX760", 2023);

        return lexus;
    }
}
