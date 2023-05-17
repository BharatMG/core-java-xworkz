package com.porvikamobiles.mobileapp;

public class MobileShop {

    String mobileNames[]= new String[6];
    int index;
    public boolean AddMobile(String mobileName){
        System.out.println("add mobile names Started");
        boolean isAdded = false;
        if(mobileName!=null && index< mobileNames.length){
            mobileNames[index++]=mobileName;
            isAdded= true;
        }
        else{
            System.out.println("enter valid mobileName");
        }
        System.out.println("add mobile names Ended");
        return isAdded;
    }
    public void getMobileNames(){
        System.out.println("get mobileName method started");
        for(int i=0;i<mobileNames.length;i++){
            System.out.println(mobileNames[i]);
        }
        System.out.println("get mobileName method Ended");
    }
}
