
package com.pbo.percobaan1;

public class Swordsman {
    protected String unitName = "Swordsman";
    protected int unitNumber;
    
    Swordsman(int howMuchUnit){
        this.unitNumber = howMuchUnit;
    }
     public void display(){
         System.out.println("Unit Number " + this.unitNumber + " is a " + unitName);
     }
}
