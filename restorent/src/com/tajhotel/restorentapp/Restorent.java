package com.tajhotel.restorentapp;

public class Restorent {
    String menu[] = new String[6];
    int index;
    public boolean addItems(String foodName){
        System.out.println("add items method started ");
        boolean isAdded=false;
        if(menu!=null){
            menu[index++]=foodName;
            isAdded=true;
            System.out.println("food name is found:"+foodName);
        }
        else{
            System.out.println("food name not found"+foodName);
        }
        System.out.println("add items method ended");
        return isAdded;
    }
    public  void getItems(){
        System.out.println("get items method started");
        for(int i=0;i<menu.length;i++){
            System.out.println(menu[i]);
        }
        System.out.println("get items method ended");
    }
}
