package com.cydeo.bean_annotation;

import com.cydeo.bean_annotation.config.CarConfig;
import com.cydeo.bean_annotation.vehicleFactory.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarTest {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(CarConfig.class);

        Vehicle lexus = container.getBean("lexus",Vehicle.class);

        System.out.println(lexus);

        Vehicle toyota = container.getBean(Vehicle.class);//@Primary

        System.out.println(toyota);



    }

}
