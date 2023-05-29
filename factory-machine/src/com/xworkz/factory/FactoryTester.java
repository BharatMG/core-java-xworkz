package com.xworkz.factory;

import com.xworkz.factory.machine.Machine;

import java.util.Scanner;

public class FactoryTester {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Machine machine=new Machine();
        Factory factory=new Factory(machine);

        factory.machine.productionPurpose();

        System.out.println("machione id");
        int machineId=sc.nextInt();
        System.out.println(machineId);

        System.out.println("machine name");
        String machineName=sc.next();
        System.out.println(machineName);

        System.out.println("price");
        int price=sc.nextInt();
        System.out.println(price);

        System.out.println("machine Id :"+machineId+" machine Name :"+machineName+" price :"+price);
    }
}
