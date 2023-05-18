package com.company;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        CDMA_Mobile mobile = new CDMA_Mobile();
        mobile.makeCall();


        Mobile mobile1;
        simCard card = new Airtel();
        mobile1 = new Mobile(card);
        Mobile mobile2 = (Mobile) mobile1.clone();
        mobile1.makeCall();
        mobile2.makeCall();
        System.out.println("Card of this phone is Modifiable: "+mobile1.cMod());
    }
}

interface SCard{
    void makeCall();
}