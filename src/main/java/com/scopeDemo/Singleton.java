package com.scopeDemo;

import org.springframework.stereotype.Component;

@Component
public class Singleton {

    public void status(){
        System.out.println("IN singleton");
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "s='" + s + '\'' +
                '}';
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    private String s;

}
