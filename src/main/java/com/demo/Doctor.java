package com.demo;

public class Doctor implements Staff{
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public Doctor(String specialization) {
        Specialization = specialization;
    }

    private String Specialization;

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    private Nurse nurse;

    private String qualification;

    public void assist(){
        System.out.println("Doctor assisting patient");
        nurse.assist();
    }

    @Override
    public void qualification() {
        System.out.println("Doctor qualification is :" + qualification);

        nurse.qualification();
    }
}
