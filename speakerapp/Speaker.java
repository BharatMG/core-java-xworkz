package com.xworkz.speakerapp;

public class Speaker {

    static boolean isConnected;
    static String brandName = "Noise";
    static int price = 3000;
    static int maxVolume = 100;
    static int minVolume;
    static int currentVolume;

    public static void main(String spkr[]) {
        System.out.println("Main started");
        boolean connected = onOrOff();
        System.out.println("Speaker is connected " + connected);
         increaseVolume();
        increaseVolume();
         increaseVolume();
        boolean disConnected = onOrOff();
        System.out.println("Speaker is connected " + disConnected);
         increaseVolume();

        System.out.println("Main Ended");
    }

    public static boolean onOrOff() {
        System.out.println("ON or Off method started ");
        if (isConnected == false) {
            isConnected = true;
            System.out.println("Speaker is turned on  ");
        } else if (isConnected == true) {
            isConnected = false;
            System.out.println("Speaker is turned off ");
        }
        System.out.println("On Or Off method Ended");
        return isConnected;
    }

    public static int increaseVolume() {
        System.out.println("increaseVolume method Started ");
        if (isConnected == true) {
            if (currentVolume < maxVolume) {
                System.out.println(" current volume is less than Max... proceed");
                currentVolume = currentVolume + 1;
                System.out.println("The current volume is " + currentVolume);
            } else {
                System.out.println("Max volume is reached  ");
            }
        }
        else {
            System.out.println("machaa Speaker turn on madu first  ");
        }
        System.out.println("increaseVolume method is Ended");
        return currentVolume;
    }
}




