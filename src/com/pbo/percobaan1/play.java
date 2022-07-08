package com.pbo.percobaan1;

public class play {
    protected String archer = "Jarak Jauh";
    protected String swordman = "Jarak dekat";
    public static void main (String[] args){
        Archer overloading = new Archer(10);//overloading pertama
        Archer overloading2 = new Archer(15, "Pemanah");
        Archer overloading3 = new Archer(20, 5, 10);

        System.out.println();
    }

}
