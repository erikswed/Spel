package com.company;

public class Zebra extends Djur {

    private String name;

    public Zebra() {
       //körs superklassens Djur default konstruktor
    }
    public Zebra(String name, int x, int y) {
        super (name, x, y);
    }
   public void setName(String name) {
        this.name ="zebra";
   }




    @Override
    public void move() {
        System.out.println("---NU TAR OVERRIDE KONTROLL----");

    }


    @Override
    public String toString() {
        return toString();
    }
}
