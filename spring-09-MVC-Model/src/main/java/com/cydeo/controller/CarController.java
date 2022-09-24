package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {

    @RequestMapping("info")//http://localhost:8080/info?make=Lexus
    public String carInfo(@RequestParam String make, Model model){

        model.addAttribute("make", make);

        return "car/car-info";

    }

    @RequestMapping("info2") //default http://localhost:8080/info2  or http://localhost:8080/info2?make=Lexus
    public String carInfo2(@RequestParam(value = "make", required = false, defaultValue = "Lexus") String make, Model model){

        model.addAttribute("make", make);

        return "car/car-info";

    }

    @RequestMapping("info3")
    public String carInfo3(@RequestParam String make,@RequestParam int year, Model model){ //http://localhost:8080/info3?make=Lexus&year=2023

        model.addAttribute("make", make);
        model.addAttribute("year", year);

        return "car/car-info";

    }

    @RequestMapping("info/{make}/{year}")// {} represents dynamic data = localhost:8080/info/Lexus/2023  Or => http://127.0.0.1:8080/info/lexus/2023
    public String getCarInfo(@PathVariable String make, @PathVariable int year, Model model){

        model.addAttribute("make", make);
        model.addAttribute("year", year);

        System.out.println(make);
        System.out.println(year);


        return "car/car-info";
    }
}
