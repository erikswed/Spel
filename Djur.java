package com.company;

public abstract class Djur implements Myinterface{
    Spelplan spel = new Spelplan();
    private int cheetah;
    private Punkt punkt;
    private String name;
    private Punkt size;

    //default konstruktor
    public Djur() {
        this.name ="djur";
        punkt = new Punkt(3, 1);

    }

    public Djur(String name, int x, int y) {
        punkt = new Punkt(x, y);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPosition(int x, int y) {
        punkt.setX(x);
        punkt.setY(y);
    }
    public Punkt getPosition() {
        return punkt;
    }

   public void move(Punkt size) {
        this.size = size;
        //OM X Ã„R NOLL HÃ„NDER DETTA:
        if (getPosition().getX() == 0) {
            setPosition(getPosition().getX() + 1, getPosition().getY());
        }
        //OM X INTE Ã„R NOLL
        else {
            //Ã„R X TIO?
            if (getPosition().getX() == size.getX()) {

                //OM X Ã„R TIO HÃ„NDER DETTA:
                //Ã„R Y TIO?
                if (getPosition().getY() == size.getY()) {

                    //OM X OCH Y Ã„R TIO HÃ„NDER DETTA:
                    //setPosition(getPosition().getX() - 1, getPosition().getY());
                    for (int x = getPosition().getX(); x > 0; x--) {
                        setPosition(getPosition().getX() - 1, getPosition().getY());
                        System.out.println("\nX: " + getPosition().getX() + "  Y: " + getPosition().getY());
                    }
                    for (int y = getPosition().getY(); y > 0; y--) {
                        setPosition(getPosition().getX(), getPosition().getY() - 1);
                        System.out.println("X: " + getPosition().getX() + "  Y: " + getPosition().getY());
                    }

                } else {
                    setPosition(getPosition().getX(), getPosition().getY() + 1);
                }
                //OM X Ã„R TIO MEN Y INTE Ã„R TIO HÃ„NDER DETTA:

            }

            //OM X INTE Ã„R TIO HÃ„NDER DETTA:
            else {
                setPosition(getPosition().getX() + 1, getPosition().getY());
            }
        }

   }


    public abstract String toString ();


}
