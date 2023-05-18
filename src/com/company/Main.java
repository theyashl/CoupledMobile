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

        // a4g5d4f5rt5
//        String s = "a4g5d4f5rt5";
//        char[] sa = s.toCharArray();
//        int sum = 0;
//        for(char c: sa){
//            if(Character.isDigit(c)){
//                sum = sum + Character.getNumericValue(c);
//            }
//        }
/*
        for (int i=0;i<s.length();i++){
            try{
                sum = sum + Integer.parseInt(String.valueOf(sa[i]));
            }
            catch (NumberFormatException e){
                //pass
            }
        }

        System.out.println(sum);*/
    }
}

interface SCard{
    void makeCall();
}