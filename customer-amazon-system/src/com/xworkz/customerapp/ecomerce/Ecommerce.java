package com.xworkz.customerapp.ecomerce;

import com.xworkz.customerapp.customer.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



public interface Ecommerce {

    boolean createData(Customer customer);
    void getAlldata();
    Customer getCustomerByName(String name);
    String getCustomerNameById(int id);
    boolean updateCustomermobileNumberByAge(int existingAge,long updatedMobileNo);
    String[] getCustomerLocationByName(String name);
    boolean updateCustomerAgeByid(int existingId,int updateAge);
    String getCustomerNameByAge(int age);



}
