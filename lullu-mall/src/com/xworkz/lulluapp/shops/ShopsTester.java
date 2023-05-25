package com.xworkz.lulluapp.shops;

import com.xworkz.lulluapp.lullumall.LulluMall;

public class ShopsTester {
    public static void main(String[] args) {

        Shops shops=new Shops();
        System.out.println("my account balance is:"+shops.getBalance());

        shops.credit(100000);
        System.out.println("after my account balance :"+shops.getBalance());

        //1st purchasing
        LulluMall leatherJacket=new LulluMall();
        shops.transfer(leatherJacket,12999);
        System.out.println("leather jacket price :"+leatherJacket.getBalance());
        System.out.println("my present account balance :"+shops.getBalance());

        LulluMall forsiningWatch=new LulluMall();
        shops.transfer(forsiningWatch,15999);
        System.out.println("Forsining analog watch price :"+forsiningWatch.getBalance());
        System.out.println("account balace after purchasing watch :"+shops.getBalance());

        LulluMall trimmer=new LulluMall();
        shops.transfer(trimmer,9999);
        System.out.println("philips trimmer price :"+trimmer.getBalance());
        System.out.println("account balance after purchasing Trimmer :"+shops.getBalance());

        LulluMall shoes=new LulluMall();
        shops.transfer(shoes,8999);
        System.out.println("adidas shoe price :"+shoes.getBalance());
        System.out.println("account balance after purchasing shoes :"+shops.getBalance());

      //  LulluMall mobile=new LulluMall();

        LulluMall mobileName=new LulluMall();
        shops.transfer(mobileName,28999);
        System.out.println("google pixel price :"+mobileName.getBalance());
        System.out.println("balance after purchasing mobile :"+shops.getBalance());

        LulluMall refrigerator =new LulluMall();
        shops.transfer(refrigerator,11999);
        System.out.println("LG refrigerator :"+refrigerator.getBalance());
        System.out.println("balance after purchasing refrigerator :"+shops.getBalance());

        LulluMall chocalate= new LulluMall();
        shops.transfer(chocalate,789);
        System.out.println("Ferrero Rocher moments truffles :"+chocalate.getBalance());
        System.out.println("balance after purchasing chocalate :"+shops.getBalance());
    }
}
