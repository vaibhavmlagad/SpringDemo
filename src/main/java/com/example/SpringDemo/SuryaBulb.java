package com.example.SpringDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("su")
@Primary
@Scope(value = "singleton")
public class SuryaBulb implements Bulb {

    @Override
    public String getBulb() {
        return "Surya Bulb";
    }

}
