package com.constructor.riceapp;

public class RiceTester {

        public static void main(String R[]){
            Rice rice = new Rice(1,"Gangavati","Brown rice",75);
            System.out.println(rice.riceId+" "+rice.brandName+" "+rice.type+" "+rice.price);

            Rice rice1 = new Rice(1,"Bullet","Basumati rice",110);
            System.out.println(rice1.riceId+" "+rice1.brandName+" "+rice1.type+" "+rice1.price);
        }
    }
