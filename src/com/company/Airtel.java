package com.company;

public class Airtel extends simCard implements Modifiable {

    @Override
    public void makeCall() {
        System.out.println("Calling from Airtel!");
    }
}
