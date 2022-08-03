package com.scopeDemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Prototype {
    public void status(){
        System.out.println("IN singleton");
    }

    @Override
    public String toString() {
        return "Prototype{" +
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
