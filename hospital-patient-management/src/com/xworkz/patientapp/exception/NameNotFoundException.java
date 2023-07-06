package com.xworkz.patientapp.exception;

public class NameNotFoundException extends RuntimeException{
    public NameNotFoundException(String name) {
        System.out.println("Enter valid name "+name);
    }
}
