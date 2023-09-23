package com.xworkz.customer;

import com.xworkz.customer.dto.CustomerDTO;

import java.util.*;

public class MapTester {
    public static void main(String[] args) {
        CustomerDTO dto = new CustomerDTO(1, "ganavi", "g@gmail.com", 8976987605L, "peenya");
        CustomerDTO dto1 = new CustomerDTO(3, "gaja", "j@gmail.com", 8976981235L, "krmarket");
        CustomerDTO dto2 = new CustomerDTO(5, "gajalakshmi", "i@gmail.com", 8564987605L, "majestic");
        CustomerDTO dto3 = new CustomerDTO(4, "ganesh", "a@gmail.com", 9976987605L, "rajaji");
        CustomerDTO dto4 = new CustomerDTO(2, "gana", "d@gmail.com", 7676987605L, "jayanagar");
        CustomerDTO dto5 = new CustomerDTO(1, "gamana", "m@gmail.com", 9076987605L, "ramnagar");
        CustomerDTO dto6 = new CustomerDTO(1, "guna", "l@gmail.com", 6776987605L, "vijaynagar");

        Map<Integer, CustomerDTO> map = new HashMap<Integer, CustomerDTO>();
        map.put(1, dto);
        map.put(6, dto1);
        map.put(3, dto2);
        map.put(7, dto3);
        map.put(5, dto4);
        map.put(2, dto5);
        map.put(4, dto6);

        for (Map.Entry<Integer, CustomerDTO> customerEntry : map.entrySet()) {
            System.out.println(customerEntry.getKey());
            System.out.println(customerEntry.getValue());
        }

        System.out.println("-----------------------using map.entrySet by HasMap---------------------------");
        Set<Map.Entry<Integer, CustomerDTO>> customerEntry = map.entrySet();
        for (Map.Entry<Integer, CustomerDTO> customer : customerEntry) {
            System.out.println(customer.getKey());
            System.out.println(customer.getValue());
        }

        Map<Integer,CustomerDTO> map1=new LinkedHashMap<Integer,CustomerDTO>();
        map1.put(1,dto);
        map1.put(3,dto1);
        map1.put(4,dto2);
        map1.put(6,dto3);
        map1.put(2,dto4);
        map1.put(5,dto5);
        map1.put(7,dto6);
        System.out.println("------------using LinkedMap------------------");
        for (Map.Entry<Integer, CustomerDTO> customerEntry1 : map.entrySet()) {
            System.out.println(customerEntry1.getKey());
            System.out.println(customerEntry1.getValue());
        }

        System.out.println("-----------------using iterator-------------------------------------");
        Set entryset= (Set) map1.entrySet();
      Iterator iterator= entryset.iterator();
      while (iterator.hasNext()){
          Map.Entry<Integer, CustomerDTO> customerEntry1=  (Map.Entry<Integer, CustomerDTO>) iterator.next();
          System.out.println(customerEntry1.getKey());
          System.out.println(customerEntry1.getValue());


      }
    }
}
