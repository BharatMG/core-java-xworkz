package com.bank.bankapp;

import java.util.Scanner;

public class BankTester {
    public static void main(String[] args) {
        System.out.println("main method started");
        Scanner sc=new Scanner(System.in);

        Bank bank =new Bank();
        System.out.println("bank id");
        int bankId=sc.nextInt();
        bank.setBankId(bankId);

        System.out.println("bank name:");
        String bankName=sc.next();
        bank.setBankName(bankName);

        System.out.println("account number:");
        double accountNumber=sc.nextDouble();
        bank.setAccountNumber(accountNumber);

        System.out.println("branch name:");
        String branchName=sc.next();
        bank.setBranchName(branchName);

        System.out.println("account type:");
        String accountType=sc.next();
        bank.setAccountType(accountType);

        System.out.println("ifsc code:");
        String ifscCode=sc.next();
        bank.setIfscCode(ifscCode);

        System.out.println("location");
        String location=sc.next();
        bank.setLocation(location);

        System.out.println("bankId:"+bank.getBankId()+" bankname:"+bank.getBankName()+" account number:"+
                bank.getAccountNumber()+" branch name:"+bank.getBranchName()+" account type:"+
                bank.getAccountType()+" Ifsc code:"+bank.getIfscCode()+" location"+bank.getLocation());
    }
}
