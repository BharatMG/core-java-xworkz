package com.xworkz.customerapp.exception;

public class IdNotFoundException extends RuntimeException{
    public IdNotFoundException(String id) {
        System.out.println("Enter valid Id"+id);
    }
}
