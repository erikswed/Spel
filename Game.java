package com.company;

import java.util.Scanner;

public class Game {
   public Spelplan spelplan = new Spelplan(10, 10);
    private int zebra;
    private int cheetah;

    /**
     * TODO:  Djur.move();
     * TODO:  Cheeta som ligger granne med zebra ska gÃ¥ till zebran
     * TODO:  AnvÃ¤ndaren kan styra antal djur
     * TODO:  AnvÃ¤ndaren kan styra storlek pÃ¥ spelplan
     */
    public Game (){

    }
    public void startGame () {
        Scanner scan = new Scanner(System.in);


        //System.out.println ("WElCOME!!!!!!! " +  "\nHow many zebras you want? ");
        // spelplan.setZebra (scan.nextInt());


        //System.out.println ("How many cheetah your want?");
        //spelplan.setZebra(scan.nextInt());

        Zebra zebraEtt = new Zebra();
        Gepard gepardEtt = new Gepard();


        int zebra = 1; //FUSKAR IHOP ANTAL ZEBROR, BEHÃ–VER RÃ„KNARE.


        while (zebra>0){
            zebraEtt.move(spelplan.size);
            gepardEtt.move(spelplan.size);


            System.out.printf("%nZEBRAN: %n X: %d\tY: %d", zebraEtt.getPosition().getX(), zebraEtt.getPosition().getY());
            System.out.printf("%nGEPARDEN: %n X: %d \t Y: %d", gepardEtt.getPosition().getX(), gepardEtt.getPosition().getY());

        }
    }
 /*   public Spelplan spelplan = new Spelplan(10, 10);
    private boolean cont = true;
    private int nrZebra, nrCheetah;

    public Game() {
    }
    public void startGame(){
    Scanner scan = new Scanner(System.in);
    System.out.println("WElCOME!!!!!!! "+"\nHow many zebras do you want? ");
        nrZebra = scan.nextInt();
    System.out.println("How many cheetah do you want?");
        nrCheetah = scan.nextInt();

    int count = 0;
    do

    {
        Djur djur = new Zebra();
        Punkt punkt = getEmptyCellOnTheBoard();
        djur.setZebra(djur, punkt);
        count++;
    } while(count<nrZebra);
    count =0;

        do
    {
        Djur djur = new Gepard();
        Punkt punkt = getEmptyCellOnTheBoard();
        spelplan.setCheetah(djur, punkt);
        count++;
    } while(count<nrCheetah);
}


    private Punkt getEmptyCellOnTheBoard()z {
        return spelplan.giveMeRandomFreeCell();
    }*/
}
