package com.example.SpringDemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("lg")
@Scope(value = "prototype")
public class LgBulb implements Bulb {

    @Override
    public String getBulb() {
        return "LG Bulb";
    }

}
