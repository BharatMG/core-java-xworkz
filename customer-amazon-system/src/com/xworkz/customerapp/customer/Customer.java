package com.xworkz.customerapp.customer;

import com.xworkz.customerapp.constants.Gender;
import com.xworkz.customerapp.constants.ModeOfPayment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {

    private int id;
    private String name;
    private int age;
    private String location;
    private long mobileNumber;
    private Gender gender;
    private String emailId;
    private ModeOfPayment payment;
}
