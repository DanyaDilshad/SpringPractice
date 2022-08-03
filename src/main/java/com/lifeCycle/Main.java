package com.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        LifeCycle lifeCycle = new LifeCycle();
        System.out.println(lifeCycle.toString());

        lifeCycle.setS("LIFECYCLE Bean");
        System.out.println(lifeCycle.toString());

    }
}
