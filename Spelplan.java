package com.company;

public class Spelplan {

    private Punkt StartPunkt;
    public Punkt size;
    private int zebraNumber;
    private int cheetahNumber;


    public Spelplan() {
        size= new Punkt(10, 10);
    }

    public Spelplan(int x, int y) {
        size = new Punkt(x, y);
    }

    public Punkt getSize() {
        return size;
    }

    public void setZebra(int z) {
        this.zebraNumber = z;
    }

    public void setCheetah(int c) {
        this.cheetahNumber = c;
    }

}

  /*  private int x;
    private int y;
    Djur[][] grid;

    public Spelplan() {
        this.x = 10;
        this.y = 10;
    }

    public Spelplan(int x, int y) {
        grid = new Djur[x][y];
        this.x = y;
        this.x = y;
    }

    public void setZebra(Djur djur, Punkt punkt) {
        grid[punkt.getX()][punkt.getY()] = djur;
    }

    public void setCheetah(Djur djur, Punkt punkt) {
        grid[punkt.getX()][punkt.getY()] = djur;
    }
    *//**
     * Denna metod garanterar att punkten den returnerar är ledig
     * Denna method används bara under initieringen av spelat för att placera ut alla djuren
     * @return
     *//*
    public Punkt giveMeRandomFreeCell() {
        do {
            int x = (int) (Math.random() * 9) + 1;
            int y = (int) (Math.random() * 9) + 1;
            if (grid[x][y] == null) {
                return new Punkt(x, y);
            }
        } while (true);
    }*/




