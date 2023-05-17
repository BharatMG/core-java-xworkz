package com.govtLibrary.libraryapp;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import jdk.nashorn.internal.parser.JSONParser;

import java.util.Scanner;

public class LibraryTester {
    public static void main(String[] args) {
        System.out.println("Main method started");
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        for(int i=0;i<library.bookNames.length;i++) {
            System.out.println("enter the book name is");
            String books= sc.next();
            library.addBooks(books);
        }
library.getBooks();
        System.out.println("Main method ended");
    }
}
