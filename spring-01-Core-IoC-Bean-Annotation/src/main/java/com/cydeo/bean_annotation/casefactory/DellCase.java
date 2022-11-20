package com.cydeo.bean_annotation.casefactory;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DellCase extends Case {

    public DellCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer, powerSupply);
    }

    public void pressPowerButton() {

        System.out.println("Power button pressed");
    }
}
