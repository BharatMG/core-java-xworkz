package com.xworkz.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class CustomerDTO {

    private int id;
    private String name;
    private int age;
    private String email;
    private long phone;
    private String address;
}
