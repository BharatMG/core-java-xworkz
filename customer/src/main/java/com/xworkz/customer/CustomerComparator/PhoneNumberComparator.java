package com.xworkz.customer.CustomerComparator;

import com.xworkz.customer.dto.CustomerDTO;

import java.util.Comparator;

public class PhoneNumberComparator implements Comparator<CustomerDTO> {
    @Override
    public int compare(CustomerDTO o1, CustomerDTO o2) {
        return (int) o1.getPhoneNumber()-(int) o2.getPhoneNumber();
    }
}
