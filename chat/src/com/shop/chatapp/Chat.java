package com.shop.chatapp;

public class Chat {
String chatnames[] = new String[5];
int index;

 public boolean addChatName(String chatname) {
     boolean isAdded = false;
     if (chatname != null && index < chatnames.length) {
         chatnames[index++] = chatname;
         isAdded = true;
     } else {
         System.out.println("chat name is full...");
     }
     return isAdded;
 }

 public void getChatNames(){
     System.out.println("get chat names are:");
     for(int i=0;i<chatnames.length;i++){
         System.out.println(chatnames[i]);
     }
 }
}