package com.xworkz.customerapp.flipkartImpl;

import com.xworkz.customerapp.customer.Customer;
import com.xworkz.customerapp.ecomerce.Ecommerce;
import com.xworkz.customerapp.exception.EmailIdNotFoundException;
import com.xworkz.customerapp.exception.IdNotFoundException;
import com.xworkz.customerapp.exception.NameNotFoundException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class FlipkartImpl implements Ecommerce {
    Customer customer[];
    int i;

    public FlipkartImpl(int size) {
        customer = new Customer[size];
    }

    @Override
    public boolean createData(Customer customer) {
        System.out.println("create data method invoked");
        boolean isAdded = false;
        if (customer != null) {
            System.out.println("check is complete proceed to add data.. ");
            if (customer.getName() != null && !customer.getName().isEmpty()) {
                this.customer[i++] = customer;
                System.out.println();
                isAdded = true;
                System.out.println("....customer data added...");
            } else {
                System.out.println("no customer data present");
            }
        } else {
            System.out.println("No such data found");
        }

        return isAdded;
    }

    @Override
    public void getAlldata() {
        System.out.println("invoking get all deatil method invoked");
        System.out.println("all customer detail list:");
        for (Customer customer : customer) {
            System.out.println(customer);

        }

    }

    @Override
    public Customer getCustomerByName(String name) {
        System.out.println("get customer by name method invoked");
        Customer cu = null;
        for (Customer c : customer) {
            if (c.getName().equals(name)) {
                System.out.println(cu = c);
            } else {
                NameNotFoundException exception=new NameNotFoundException(name);
                throw exception;
            }
        }
        return cu;
    }

    @Override
    public String getCustomerNameById(int id) {
        System.out.println("get name by id method invoked");
        String str = null;
        for (Customer c : customer) {
            if (c.getId() == id) {
                this.customer = customer;
                System.out.println(str = c.getName());
            }else {
                IdNotFoundException exception=new IdNotFoundException("id");
                throw exception;
            }
        }
        return "str";
    }

    @Override
    public boolean updateCustomermobileNumberByAge(int existingAge, long updatedMobileNo) {
        System.out.println("update mobile number method invoked");
        boolean isUpdate = false;
        for (int i = 0; i < customer.length; i++) {
            if (customer[i].getAge() == existingAge) {
                customer[i].setMobileNumber(updatedMobileNo);
                isUpdate = true;
                System.out.println(".........mobileNumber updated....");
            } else {
                System.out.println("no update available");
            }
        }
        return isUpdate;
    }

    @Override
    public String[] getCustomerLocationByName(String name) {
        String[] str = new String[3];
        System.out.println("get location by name method started");
        for (int i = 0; i < customer.length; i++) {
            if (customer[i].getName().equals(name)) {
                System.out.println(customer[i].getLocation());
            } else {
                System.out.println("no such data available");
            }
        }
        return str;
    }

    @Override
    public boolean updateCustomerAgeByid(int existingId, int updateAge) {
        System.out.println("update age by id method started");
        boolean isAdded = false;
        for (Customer cc : customer) {
            if (cc.getId() == existingId) {
                cc.setAge(updateAge);
                isAdded = true;
                System.out.println(".....updated the age.....");
            } else {
                System.out.println("NO UPDATE AVALIABLE");
            }
        }
        return isAdded;
    }

    @Override
    public String getCustomerNameByAge(int age) {
        System.out.println("get Name by age method invoked");
        String st = null;
        for (Customer C4 : customer) {
            if (C4.getAge() == age) {
                System.out.println(st = C4.getName());
            } else {
                System.out.println("no such data available");
            }
        }
        return "st";
    }

    @Override
    public String getNameByEmailId(String emailId) {
        System.out.println("get name by emailId method invoked");
        String s = null;
        for (Customer c1 : customer) {
            if (c1.getEmailId().equals(emailId)) {
                System.out.println(s = c1.getName());
            }else{
                EmailIdNotFoundException exception=new EmailIdNotFoundException(emailId);
                throw exception;
            }
        }
        return "s";
    }
}
