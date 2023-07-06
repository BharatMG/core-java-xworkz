package com.xworkz.patientapp.exception;

public class DiseaseNameNotFoundException extends RuntimeException{
    public DiseaseNameNotFoundException(String diseaseName) {
        System.out.println("Enter valid disease name "+diseaseName);
    }
}
