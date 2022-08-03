package com.lifeCycle;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class LifeCycle implements Inter, BeanNameAware
{

    private String s;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "LifeCycle{" +
                "s='" + s + '\'' +
                '}';
    }

    @Override
    public void function() {
        System.out.println("Lifecycle function");
    }


    @Override
    public void setBeanName(String s) {
        System.out.println("Set Bean Name method is called ");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Post construct method performed");

    }
}
