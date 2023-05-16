package com.constructor.riceapp;

public class Rice {
        int riceId;
        String brandName;
        String type;
        int price;

        public Rice(int riceId,String name,String typ,int p ){
            System.out.println("to feed ");
            this.riceId= riceId;
            brandName = name;
            type=typ;
            price=p;
        }
    }
