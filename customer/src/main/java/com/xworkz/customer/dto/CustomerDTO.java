package com.xworkz.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class CustomerDTO implements Comparable<CustomerDTO>{
    private int id;
    private String name;
    private String email;
    private long phoneNumber;
    private String address;

    @Override
    public int compareTo(CustomerDTO o) {
        return this.id-o.id;
    }

//    @Override
//    public int compareTo(CustomerDTO o) {
//        return this.id-o.id;
//    }
}
