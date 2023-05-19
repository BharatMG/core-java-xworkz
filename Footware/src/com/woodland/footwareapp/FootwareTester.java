package com.woodland.footwareapp;

import javafx.stage.Screen;

import java.util.Scanner;

public class FootwareTester {
    public static void main(String[] args) {
        System.out.println("Main method started");

        Scanner sc = new Scanner(System.in);

        Footware footware =new Footware();
        System.out.println("footware details..");
        System.out.println("footware Id");
        int footwareId= sc.nextInt();
        footware.setFootwareId(footwareId);

        System.out.println("brand");
        String brand=sc.next();
        footware.setBrand(brand);

        System.out.println("size");
        int size=sc.nextInt();
        footware.setSize(size);

        System.out.println("type");
        String type=sc.next();
        footware.setType(type);

        System.out.println("price");
        double price=sc.nextDouble();
        footware.setPrice(price);

        System.out.println("materialType");
        String materialType=sc.next();
        footware.setMaterialType(materialType);

        System.out.println("Id:"+footware.getFootwareId()+" brand:"+footware.getBrand()+" size:"+
                footware.getSize()+" type:"+footware.getType()+" price:"+footware.getPrice()+
                " materialType"+footware.getMaterialType());
        System.out.println("main method ended");
    }

}
