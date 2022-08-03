package com.demoAnnotation;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


public class Technician implements Staff {


    @Override
    public void assist() {
        System.out.println("Technician on work");
    }
}
