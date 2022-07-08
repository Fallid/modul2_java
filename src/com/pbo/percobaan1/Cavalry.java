
package com.pbo.percobaan1;

public class Cavalry {
    protected String unitName = "Cavalry";
    protected int unitNumber;
    
    //Constructor tanpa modifier
    Cavalry(int unitNumber) {
        this.unitNumber = unitNumber;
    }
    
    //method display dengann modifier publik
    public void display(){
        System.out.println("Unit Number " + this.unitNumber + " is a " + unitName);
    }
}
