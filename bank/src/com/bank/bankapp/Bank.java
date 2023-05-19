package com.bank.bankapp;

public class Bank {
    private int bankId;
    private String bankName;
    private double accountNumber;
    private String branchName;
    private String accountType;
    private String ifscCode;
    private String location;

    public void setBankId(int bankId){
        this.bankId=bankId;
    }
    public int getBankId(){
        return bankId;
    }
    public void setBankName(String bankName){
        this.bankName=bankName;
    }
    public String getBankName(){
        return bankName;
    }
    public void setAccountNumber(double accountNumber){
        this.accountNumber=accountNumber;
    }
    public double getAccountNumber(){
        return accountNumber;
    }
    public void setBranchName(String branchName){
        this.branchName=branchName;
    }
    public String getBranchName(){
        return branchName;
    }
    public void setAccountType(String accountType){
        this.accountType=accountType;
    }
    public String getAccountType(){
        return accountType;
    }
    public void setIfscCode(String ifscCode){
        this.ifscCode=ifscCode;
    }
    public String getIfscCode(){
        return ifscCode;
    }
    public void setLocation(String location){
        this.location=location;
    }
    public String getLocation(){
        return location;
    }
}