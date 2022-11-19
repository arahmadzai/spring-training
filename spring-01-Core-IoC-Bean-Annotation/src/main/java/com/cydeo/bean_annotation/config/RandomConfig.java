package com.cydeo.bean_annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RandomConfig {

    @Bean
    public String myString(){
//        return new String("Cydeo");
      return "Cydeo";
    }

    @Bean
    public int myInteger(){
        return 5;
    }

}
