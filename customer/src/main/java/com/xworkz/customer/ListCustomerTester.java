package com.xworkz.customer;

import com.xworkz.customer.CustomerComparator.AddressComparator;
import com.xworkz.customer.CustomerComparator.EmailComparator;
import com.xworkz.customer.CustomerComparator.NameComparator;
import com.xworkz.customer.CustomerComparator.PhoneNumberComparator;
import com.xworkz.customer.dto.CustomerDTO;

import java.util.*;

public class ListCustomerTester {

    public static void main(String[] args) {

       // List<CustomerDTO> list = new ArrayList<CustomerDTO>();

       Set<CustomerDTO> s=new TreeSet<CustomerDTO>();
        s.add(new CustomerDTO(4, "bharat", "b@gmail.com", 8553366463L, "Haveri"));
        s.add(new CustomerDTO(2, "sharat", "s@gmail.com", 9153366463L, "Hanagal"));
        System.out.println(s);

//        list.add(new CustomerDTO(1, "bharat", "b@gmail.com", 8553366463L, "Haveri"));
//        list.add(new CustomerDTO(3, "sharat", "s@gmail.com", 9153366463L, "Hanagal"));
//        list.add(new CustomerDTO(2, "virat", "v@gmail.com", 8853366463L, "Bydagi"));
//        list.add(new CustomerDTO(6, "bhagya", "bh@gmail.com", 9973366463L, "Ranebennur"));
//        list.add(new CustomerDTO(4, "bhavana", "ba@gmail.com", 9233366463L, "Savanur"));
//        list.add(new CustomerDTO(5, "bharati", "br@gmail.com", 9463366463L, "Shiggov"));
//        list.add(new CustomerDTO(8, "Lohit", "l@gmail.com", 9873366463L, "Hirekerur"));
//        list.add(new CustomerDTO(7, "vinayaka", "vi@gmail.com", 9085336463L, "Sirasi"));

//        System.out.println("---------------------------------sort by Id-------------------------------------");
//        Collections.sort(list);
//        for (CustomerDTO dto : list) {
//            System.out.println(dto);
//        }
//        System.out.println("+++++++++++++++++++++++++++++++++++++++sort by Name+++++++++++++++++++++++");
//        Collections.sort(list, new NameComparator());
//        for (CustomerDTO dto : list) {
//            System.out.println(dto);
//        }
//        System.out.println("+++++++++++++++++++++++++++++++++++++++sort by email+++++++++++++++++++++++");
//        Collections.sort(list, new EmailComparator());
//        for (CustomerDTO dto : list) {
//            System.out.println(dto);
//        }
//        System.out.println("+++++++++++++++++++++++++++++++++++++++sort by phoneNumber+++++++++++++++++++++++");
//        Collections.sort(list, new PhoneNumberComparator());
//        for (CustomerDTO dto : list) {
//            System.out.println(dto);
//        }
//
//        System.out.println("+++++++++++++++++++++++++++++++++++++++sort by address+++++++++++++++++++++++");
//        Collections.sort(list, new AddressComparator());
//        for (CustomerDTO dto : list) {
//            System.out.println(dto);
//        }
    }
}