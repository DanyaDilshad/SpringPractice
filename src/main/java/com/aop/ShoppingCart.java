package com.aop;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(){
        System.out.println("CHECKOUT Method from ShoppingCart is called");
    }

}
