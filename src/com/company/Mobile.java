package com.company;

public class Mobile implements Cloneable {
    private simCard card = null;
    Mobile(){
    }
    Mobile(simCard card){
        this.card = card;
    }
    public void makeCall(){
        card.makeCall();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean cMod(){
        if (this.card instanceof Modifiable) return true;
        else return false;
    }
}
