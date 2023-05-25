package com.xworkz.bankapp.currentAccountapp;

public class CurrentAccountTester {
    public static void main(String[] args) {

        CurrentAccount currentAccount=new CurrentAccount();
        System.out.println("current account before credit:"+currentAccount.getBalance());

        currentAccount.credit(600.50);
       double totalAmount=currentAccount.getBalance();
        System.out.println("current account after credit:"+totalAmount);

        currentAccount.debit(8000.75);
        System.out.println("current account after debit:"+currentAccount.getBalance());
    }
}
