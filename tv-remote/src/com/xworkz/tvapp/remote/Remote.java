package com.xworkz.tvapp.remote;

public class Remote {
    public int remoteId;
    public int price;
    public String remoteName;

    public Remote(){

    }

    public void toControl(){
        System.out.println("Constructor is invoked");
        System.out.println("remoteId :"+remoteId);
        System.out.println("price :"+price);
        System.out.println("RemoteName :"+remoteName);
    }
}
