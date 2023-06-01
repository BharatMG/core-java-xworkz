package com.doctor.doctorapp.surgeon;

import com.doctor.doctorapp.doctor.Doctor;

public class Surgeon extends Doctor {
    public int id;
    public String name;
    public String specialization;

    public Surgeon(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }

    @Override
   public void toDiagnosis(){
        System.out.println("specialist in the diagnosis the disease..");
        int consultingFees=2000;
        System.out.println(consultingFees);
        System.out.println(" "+id+" "+name+" "+specialization);
    }

}
