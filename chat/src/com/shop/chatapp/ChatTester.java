package com.shop.chatapp;
import java.util.Scanner;
public class ChatTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    Chat chat = new Chat();
    for(int i=0;i<chat.chatnames.length;i++){
        System.out.println("enter the chat name ");
        String chatName = sc.next();
        chat.addChatName(chatName);
    }
   chat.getChatNames();
    }
}
