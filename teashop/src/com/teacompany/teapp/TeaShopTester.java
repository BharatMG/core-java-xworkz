package com.teacompany.teapp;

import java.util.Scanner;

public class TeaShopTester {
    public static void main(String[] args) {
        System.out.println("Main method started");
        Scanner scn = new Scanner(System.in);
        TeaShop teaShop = new TeaShop();
        for(int i=0;i<teaShop.teaNames.length;i++){
            System.out.println("tea shop names:");
            String tea = scn.next();
            teaShop.addTeaNames(tea);
        }
        teaShop.getTeaNames();
        System.out.println("Main method ended");
    }
}
