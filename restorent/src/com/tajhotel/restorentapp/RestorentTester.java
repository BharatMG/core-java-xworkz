package com.tajhotel.restorentapp;

import java.util.Scanner;

public class RestorentTester {
    public static void main(String[] args) {
        System.out.println("main method started");

        Scanner scn= new Scanner(System.in);
        Restorent restorent= new Restorent();
        for(int i=0;i<restorent.menu.length;i++){
            System.out.println("menu names are:");
            String food= scn.next();
            restorent.addItems(food);
        }
        restorent.getItems();
        System.out.println("main method ended");
    }
}
