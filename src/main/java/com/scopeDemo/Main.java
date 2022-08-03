package com.scopeDemo;

import com.scopeDemo.BeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        System.out.println("Singleton demo");
        Singleton singleton = context.getBean(Singleton.class);
        System.out.println("New object called" + singleton);

        singleton.setS("Singleton 1");
        System.out.println("Object Value set -> " + singleton);

        Singleton singleton1 = context.getBean(Singleton.class);
        System.out.println("New object called" + singleton1);


        System.out.println("\n\nPrototype demo");
        Prototype prototype = context.getBean(Prototype.class);
        System.out.println("New object called (p)" +prototype);

        prototype.setS("prototype 1");
        System.out.println("Value set ->" + prototype);

        Prototype prototype1 = context.getBean(Prototype.class);
        System.out.println("New object called (p) " + prototype1);

    }
}
