package com.xworkz.lulluapp.lullumall;

public class LulluMall {
    private double balance;

    public void credit(double amount){
    balance=balance+amount;
    }
    public void debit(double amount){
        balance=balance-amount;
    }
    public double getBalance(){
        return balance;
    }
    public void transfer(LulluMall shopNames,double amount){
        shopNames.credit(amount);
        this.debit(amount);
    }
}
