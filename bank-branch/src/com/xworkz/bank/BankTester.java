package com.xworkz.bank;

import com.xworkz.bank.branch.Branch;

public class BankTester {
    public static void main(String[] args) {
        Branch branch=new Branch();
        Bank bank=new Bank(branch);

        bank.branch.numberAccounts();
    }
}
