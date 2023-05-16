package com.xowrkz.hospitalapp;

public class PatientTester {
    public static void main(String []arg){
        System.out.println("Main method starte");
    Patient patient = new Patient(1,"bharat",28);
    System.out.println(" "+patient.patientId+" "+patient.name+" "+patient.age);
System.out.println("Main method ended");
    }

}
