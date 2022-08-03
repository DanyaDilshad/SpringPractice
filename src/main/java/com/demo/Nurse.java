package com.demo;

public class Nurse implements Staff{

    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void assist(){
        System.out.println("Nurse assisting patient");
    }

    public void qualification(){
        System.out.println("Nurse Quaification:" + qualification );
    }
}
