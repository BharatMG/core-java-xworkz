package com.porvikamobiles.mobileapp;

import java.util.Scanner;

public class MobileShopTester {

    public static void main(String[] args) {
        System.out.println("Main method started");

        Scanner scn = new Scanner(System.in);
        MobileShop mobile = new MobileShop();
        for(int i=0;i<mobile.mobileNames.length;i++){
            System.out.println("mobile brands are:");
        String mobiles = scn.next();
        mobile.AddMobile(mobiles);
        }
        mobile.getMobileNames();
        System.out.println("main method ended");
    }
}
