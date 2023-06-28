package com.xworkz.customerapp;

import com.xworkz.customerapp.constants.Gender;
import com.xworkz.customerapp.constants.ModeOfPayment;
import com.xworkz.customerapp.customer.Customer;
import com.xworkz.customerapp.ecomerce.Ecommerce;
import com.xworkz.customerapp.flipkartImpl.FlipkartImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;
//@AllArgsConstructor
@NoArgsConstructor
@Data

public class CustomerTester {
    public static void main(String[] args) {
        System.out.println("Main method invoked");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the customer..");
        int size = sc.nextInt();

        Ecommerce ecommerce = new FlipkartImpl(size);

        for (int customerind = 0; customerind < size; customerind++) {

            Customer customer1=new Customer();

            System.out.println("Enter the customer id");
            customer1.setId(sc.nextInt());
            System.out.println("Enter the customer name");
            customer1.setName(sc.next());
            System.out.println("Enter the Age");
            customer1.setAge(sc.nextInt());
            System.out.println("Enter the location");
            customer1.setLocation(sc.next());
            System.out.println("Enter the gender");
            customer1.setGender(Gender.valueOf(sc.next()));
            System.out.println("Enter the mode of payment");
            customer1.setPayment(ModeOfPayment.valueOf(sc.next()));
            System.out.println("Enter the mobile number");
            customer1.setMobileNumber(sc.nextLong());

            ecommerce.createData(customer1);
        }
        String text;
        do {
            System.out.println("1.get all the data...");
            System.out.println("2.get the customer by name ");
            System.out.println("3.get customer name by id");
            System.out.println("4.update the mobile number by age ");
            System.out.println("5.get customer location by name");
            System.out.println("6.update age by Id");
            System.out.println("7.get name by age");
            int option= sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("All customer details");
                    ecommerce.getAlldata();
                    break;
                case 2:
                    System.out.println("enter the existing name");
                    ecommerce.getCustomerByName(sc.next());
                    break;
                case 3:
                    System.out.println("Enter the existing id");
                    ecommerce.getCustomerNameById(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Enter the existing age & new mobile number");
                    ecommerce.updateCustomermobileNumberByAge(sc.nextInt(),sc.nextLong());
                    break;
                case 5:
                    System.out.println("Enter existing name..");
                    ecommerce.getCustomerLocationByName(sc.next());
                    break;
                case 6:
                    System.out.println("Enter the existing id & new Age..");
                    ecommerce.updateCustomerAgeByid(sc.nextInt(),sc.nextInt());
                    break;
                case 7:
                    System.out.println("Enter the existing age");
                    ecommerce.getCustomerNameByAge(sc.nextInt());
                    break;
            }
            System.out.println("Do you want to continue:YES/NO");
            text=sc.next();
        }while (text.equals("YES"));
        System.out.println("..THANK YOU FOR VISITING FLIPKART..");
    }
}