package com.xworkz.bankapp.savings;

import com.xworkz.bankapp.bankaccount.BankAccount;

public class SavingAccountTester {
    public static void main(String[] args) {


        SavingAccount savingAccount = new SavingAccount();
       // System.out.println("Saving balance before credit:"+savingAccount.getBalance());

        savingAccount.credit(10000);
       double totalAmount =savingAccount.getBalance();
        System.out.println("saving account after credit:"+totalAmount);

     //   savingAccount.debit(500.);
       // System.out.println("saving account after debit:"+savingAccount.getBalance());

       //benificiary Account
        BankAccount benificiaryAccount=new BankAccount();
      //  System.out.println("benificiary account is:"+benificiaryAccount.getBalance());
       // benificiaryAccount.credit(00);
      //  System.out.println("benificiary account after credit"+benificiaryAccount.getBalance());
    //    System.out.println("saving account is:"+savingAccount.getBalance());


        savingAccount.transfer(benificiaryAccount,3000);

        System.out.println("benificiary account after credit:"+benificiaryAccount.getBalance());
        System.out.println("saving account is:"+savingAccount.getBalance());
// tom
      //  BankAccount benificiaryAccount1=new BankAccount();
    }
}
