package com.company;

public class Gepard extends Djur {
    private String name;
    private int x, y;
    private Punkt punkt;

    public Gepard() {
        //körs superklassen Djur default konstrukto
    }
    public Gepard(String name, int x, int y) {
        super(name, x,y);
    }
    public void setName (String name){
        this.name = "gepard";
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
