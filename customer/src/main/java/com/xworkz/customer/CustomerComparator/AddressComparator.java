package com.xworkz.customer.CustomerComparator;

import com.xworkz.customer.dto.CustomerDTO;

import java.util.Comparator;

public class AddressComparator implements Comparator<CustomerDTO> {
    @Override
    public int compare(CustomerDTO o1, CustomerDTO o2) {
        return o1.getAddress().compareTo(o2.getAddress());
    }
}
