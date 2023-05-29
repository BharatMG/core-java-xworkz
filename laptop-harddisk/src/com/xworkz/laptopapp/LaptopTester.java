package com.xworkz.laptopapp;

import com.xworkz.laptopapp.harddisk.Harddisk;

public class LaptopTester {
    public static void main(String[] args) {
    Harddisk disk=new Harddisk();
    Laptop laptop=new Laptop(disk);

    laptop.disk.toStore();
}
}
