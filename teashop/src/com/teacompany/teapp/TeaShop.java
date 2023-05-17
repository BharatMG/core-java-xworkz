package com.teacompany.teapp;

public class TeaShop {
    String teaNames[]= new String[6];
    int index;

    public boolean addTeaNames(String teaName){
        System.out.println("Tea names method Started");
        boolean isAdded= false;
        if(teaName != null){
            teaNames[index++]= teaName;
            isAdded = true;
            System.out.println(teaName);
        }
        else{
            System.out.println("tea name is not mentioned");
        }
        System.out.println("tea names ended ");
        return isAdded;
    }
    public void getTeaNames(){
        System.out.println("get tea names method Started");
    System.out.println("list of tea names available:");
        for(int i =0;i<teaNames.length; i++){
            System.out.println(teaNames[i]);
        }
        System.out.println("get tea names method ended");

    }
}
