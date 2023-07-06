package com.xworkz.patientapp.exception;

public class WardNoNotFoundException extends RuntimeException{
    public WardNoNotFoundException(String wardNo) {
        System.out.println("Enter valid wardNo "+wardNo);

    }
}
