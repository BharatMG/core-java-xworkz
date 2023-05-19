package com.world.countryapp;

import java.util.Scanner;

public class CountryTester {
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);

            System.out.println("enter the country id");
            int countryId= sc.nextInt();
            System.out.println("enter the country code");
            int countryCode=sc.nextInt();
            System.out.println("enter name of the country");
            String countryName=sc.next();
            System.out.println("enter number of states in the country");
            int noOfStates= sc.nextInt();
            System.out.println("enter the population of the country");
            String population=sc.next();
            System.out.println("enter country's currency");
            String currency= sc.next();
            System.out.println("enter capital of the country");
            String capital= sc.next();
            System.out.println("enter country's economy");
            String economy=sc.next();
            System.out.println();

            Country country=new Country();
            country.setCountryId(countryId);
            country.setCountryCode(countryCode);
            country.setCountryName(countryName);
            country.setNoOfStates(noOfStates);
            country.setPopulation(population);
            country.setCurrency(currency);
            country.setCapital(capital);
            country.setEconomy(economy);

            System.out.println("id:"+country.getCountryId()+" code:"+country.getCountryCode()+
                    " name:"+country.getCountryName()+" states"+country.getNoOfStates()+
                    " population"+country.getPopulation()+" cuttency"+country.getCurrency()+
                    " capital"+country.getCapital()+" economy"+country.getEconomy());
        }
    }
