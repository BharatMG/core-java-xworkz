package com.baptisthospital.medapp;

import java.util.Scanner;

public class Patient1Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("patient Id:");
        int patientId=sc.nextInt();
        Patient1 patient = new Patient1();
        patient.setPatientId(patientId);

        System.out.println(("patient name:"));
        String patientName=sc.next();
        patient.setPatientName(patientName);

        System.out.println("age:");
        int age=sc.nextInt();
        patient.setAge(age);

        System.out.println("bloodgroup:");
        String bloodgroup=sc.next();
        patient.setBloodGroup(bloodgroup);

        System.out.println("place");
        String place=sc.next();
        patient.setPlace(place);

        System.out.println("consultant");
        String consultant=sc.next();
        patient.setConsultant(consultant);

        System.out.println("wardNumber");
        int wardNumber=sc.nextInt();
        patient.setWardNumber(wardNumber);

        System.out.println("mobileNumber");
        long mobileNumber=sc.nextLong();
        patient.setMobileNumber(mobileNumber);

        System.out.println("emailId");
        String emailId=sc.next();
        patient.setEmailId(emailId);

        System.out.println("patientId:"+patient.getPatientId()+" patientName:"+patient.getPatientName()
        +"age:"+patient.getAge()+" bloodgroup"+patient.getBloodgroup()+" place"+patient.getPlace()+
                " consultant"+patient.getConsultant()+" wardNumber"+patient.getWardNumber()+" mobileNumber"
                +patient.getMobileNumber()+" emailId"+patient.getEmailId());
    }
}
