package com.onlyif.flipkartapp;

public class FlipkartTester {
        public static void main(String flipkart[]){

            System.out.println("Main method Started");


            String productName = "Electric Bass Guitar" ;
            double price = Flipkart.searchProduct( productName );
            System.out.println("The price of "+ productName + " is " + price );

            System.out.println("Main method Ended");

        }
    }
