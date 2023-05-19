package com.cakeshop.cakeapp;

import java.util.Scanner;

public class CakeTester {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);

            System.out.println("enter cake id");
            int cakeId= sc.nextInt();
            System.out.println("enter the shape of the cake");
            String shape= sc.next();
            System.out.println("color of the cake");
            String color=sc.next();
            System.out.println("cake flaver");
            String flaver=sc.next();
            System.out.println("cake price");
            double price=sc.nextDouble();

            Cake cake=new Cake();

            cake.setCakeId(cakeId);
            cake.setShape(shape);
            cake.setColor(color);
            cake.setFlaver(flaver);
            cake.setPrice(price);
            System.out.println("Id"+cake.getCakeId()+" shape:"+cake.getShape()+" color:"+
                    cake.getColor()+" flaver:" +cake.getFlaver()+" price:"+cake.getPrice());

        }
    }

