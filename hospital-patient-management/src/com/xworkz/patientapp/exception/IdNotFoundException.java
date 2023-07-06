package com.xworkz.patientapp.exception;

public class IdNotFoundException extends RuntimeException{
    public IdNotFoundException(int id) {
        System.out.println("Enter valid id "+id);
    }
}
