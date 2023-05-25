package com.xworkz.bankapp;

import com.xworkz.bankapp.bankaccount.BankAccount;
//acquring the date from one class to another class
// is a relation
public class BankAccountTester {
    public static void main(String[] args) {

        BankAccount bankAccount=new BankAccount();
        System.out.println("current balance is before credit:"+bankAccount.getBalance());

        bankAccount.credit(500.00);
        double totalAmount=bankAccount.getBalance();
        System.out.println("total balance post credit:"+totalAmount);

        bankAccount.debit(300);
        System.out.println("balance post debit"+bankAccount.getBalance());


    }

}