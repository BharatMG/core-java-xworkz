package com.xworkz.customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerTester {
    public static void main(String[] args) {

        CustomerDTO dto=new CustomerDTO(1,"krishna",30,"k@gmail.com",9876598760L,"ckm");
        CustomerDTO dto1=new CustomerDTO(3,"pavan",30,"k@gmail.com",9876598760L,"ckm");
        CustomerDTO dto2=new CustomerDTO(2,"yeshas",30,"k@gmail.com",9876598760L,"ckm");
        CustomerDTO dto3=new CustomerDTO(5,"pavan",30,"k@gmail.com",9876598760L,"ckm");

        List<CustomerDTO> list=new ArrayList<CustomerDTO>();
        list.add(dto);
        list.add(dto1);
   //     list.add(new CustomerDTO(3,"pavan",31,"k@gmail.com",9876598760L,"ckm"));
 //       list.add(new CustomerDTO(2,"yeshas",10,"k@gmail.com",9876598760L,"ckm"));
        for (CustomerDTO d:list) {
            System.out.println(d);
        }
        list.remove(dto2);
        System.out.println("-----------------------------------------------------------------------------");
        for (CustomerDTO dt:list) {
            System.out.println(dt);
        }

     //   System.out.println(list);

    }
  }

