package com.crud.libraryapp;

public class Library {
        static String libraryBooks[]={null,null,null,null,null,null,null,null,null,null,null,null,null,
                null,null};
        static int index;

        public static boolean addLibraryBooks(String libraryBook){
            System.out.println("add LibraryBooks method started");
            boolean isAdded=false;
            if(libraryBook!=null){
                libraryBooks[index++]=libraryBook;
                isAdded=true;
            }
            else{
                System.out.println("book name is invalid");
            }
            System.out.println("add LibraryBooks method Ended");
            return isAdded;
        }

        public static void getLibraryBooks(){
            System.out.println("get LibraryBooks method Started");
            for(int i=0;i<libraryBooks.length; i++){
                System.out.println(libraryBooks[i]);
            }
        }
        public static boolean updateLibraryBooks(String oldBookName,String updatedBookName){
            System.out.println("updated book name method Started");
            boolean isUpdated= false;
            for(int i=0;i<libraryBooks.length; i++){
                if(libraryBooks[i].equals(oldBookName)){
                    libraryBooks[i]=updatedBookName;
                    isUpdated= true;
                }
            }
            System.out.println("updated book name method Ended");
            return isUpdated;
        }
    }
