package com.company;

public class Punkt {
    private int x;
    private int y;

    //default konstruktor
    public Punkt (){
        //spårkonstruktor
        x = 0;
        y = 0;
    }
    public Punkt(int x, int y) {
        setX(x);
        setY(y);

    }
    public void setX(int x) {
        if(x>=0) {
            this.x = x;
        } else {
            x = 0;
        }

    }
    public void setY(int y) {
        if (y>=0) {
            this.y = y;
        } else {
            y = 0;
        }
    }
    public int getX(){

        return x;
    }
    public int  getY (){

        return y;
    }

}
