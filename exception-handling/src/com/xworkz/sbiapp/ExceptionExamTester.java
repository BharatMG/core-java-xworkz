package com.xworkz.sbiapp;

public class ExceptionExamTester {

    public static void main(String[] args) {
        System.out.println("main method started...");

       int div= divide();
        System.out.println(div);

        String myName = addName("bharat");
        System.out.println(myName);

        int[] sports = addMarks();
        System.out.println(sports);

        conversion();

        System.out.println("main method ended.....");
    }
        public static int divide() {
            System.out.println("dividing method started");
            try {
                int a = 220 / 0;
            } catch (Exception y) {
                y.printStackTrace();
                // System.out.println(y);
            }
            System.out.println(".....dividing method ended..");
            return 0;
        }

       public static String addName(String name){
           System.out.println("name is adding");

           String a = "bharat";
           String b = "bujji";
           String c = null;
           try{System.out.println(c.equals(b));
           }catch (Exception n){
             n.printStackTrace();
               System.out.println("Exception ");
           }
        return a;
    }

    public static int[] addMarks() {
        System.out.println("adding marks names method invoked..");
        int[] str=new int[2];
        int[] str1={1,2,3,4,5,6};
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(str[i]);
            }
        }catch(Exception sport){
            sport.printStackTrace();
            System.out.println("Marks method ended");
        }
        return str1;

    }
    public static void conversion(){
        System.out.println("Number conversion method started");
      try{  String number="12345q";
        int aa=Integer.parseInt(number);
        System.out.println(aa);}
      catch (Exception dd){
          dd.printStackTrace();
          System.out.println("Number conversion method Ended");

      }
    }

}