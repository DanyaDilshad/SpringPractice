package com.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {

    @Before("execution(* com.aop.ShoppingCart.checkout())")
    public void beforeLogger(){

        System.out.println("Loggeress...");

    }

    @After("execution(* com.aop.ShoppingCart.checkout())")
    public void afterogger(){

        System.out.println("Loggeress...");

    }

    @After("execution(* com.aop.ShoppingCart.checkout())")
    public void afterogger(){

        System.out.println("Loggeress...");

    }
}
