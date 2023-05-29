package com.xworkz.trainapp;

import com.xworkz.trainapp.compartments.Compartments;

public class TrainTester {
    public static void main(String[] args) {
        Compartments compartments=new Compartments();
        Train train=new Train(compartments);

        train.compartments.toSit();
    }
}
