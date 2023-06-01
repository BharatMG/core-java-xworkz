package com.xworkz.inputdevice;

import com.xworkz.inputdevice.inputapp.InputDevice;
import com.xworkz.inputdevice.keyboard.Keyboard;

public class InputDeviceTester {
    public static void main(String[] args) {
        InputDevice inputDevice=new Keyboard();
        inputDevice.provideData();
    }
}