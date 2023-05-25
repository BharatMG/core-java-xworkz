package com.xworkz.bankapp.bankaccount;

//base class /super/parent
public class BankAccount {
    private double balance;

    public void credit(double amount) {
        balance = amount + balance;
    }
    public void debit(double amount) {
        balance =balance-amount;
    }
    public double getBalance(){
        return balance;
    }
    public void transfer(BankAccount benificiaryAccount,double amount){
        benificiaryAccount.credit(amount);
        this.debit(amount);
    }
}