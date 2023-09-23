package com.xworkz.customer.CustomerComparator;

import com.xworkz.customer.dto.CustomerDTO;

import java.util.Comparator;

public class EmailComparator implements Comparator<CustomerDTO> {

    @Override
    public int compare(CustomerDTO o1, CustomerDTO o2) {
        return o1.getEmail().compareTo(o2.getEmail());
    }
}
