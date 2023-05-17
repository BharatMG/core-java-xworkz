package com.govtLibrary.libraryapp;

public class Library {
    String bookNames[]= new String[8];
    int index;

    public boolean addBooks(String book){
        System.out.println("adding books method started");
        boolean isAdded = false;
        if(book!= null && index< bookNames.length){
            bookNames[index++]= book;
            isAdded=true;
        }
        else{
            System.out.println("books are full...");
        }
        System.out.println("adding book method ended");
        return isAdded;
    }

    public void getBooks(){
        System.out.println("get book names are:");
        for(int i=0;i<bookNames.length;i++){
            System.out.println(bookNames[i]);
        }
    }
}
