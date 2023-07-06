package com.xworkz.customerapp.exception;

public class EmailIdNotFoundException extends RuntimeException{
    public EmailIdNotFoundException(String emailId) {
        System.out.println("Enter the valid emailId "+emailId);
    }
}
