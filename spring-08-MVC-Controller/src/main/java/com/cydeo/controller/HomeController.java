package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home") // end point mapping
    public String getHomePage(){ // we need to define the end point of this method
        return "home.html";
    }

    @RequestMapping("/abid")
    public String getHomePage2(){
        return "home.html";
    }

    @RequestMapping // when endpoint mapping is not defined, it will give use default page
    public String getHomePage3(){
        return "home.html";
    }

    @RequestMapping({"/apple","/orange"})
    public String getHomePage4(){
        return "home.html";
    }

    @RequestMapping("/product")
    public String product(){
        return "home.html";
    }




}
