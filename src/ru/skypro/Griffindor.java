package ru.skypro;

public class Griffindor extends Hogwarts{
    private final int nobility;
    private final int honour;
    private final int bravery;

    public Griffindor(String fullName, int powerOfMagic,
                      int transgressionDistance, int nobility,
                      int honour, int bravery) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }


    public int getNobility() {
        return nobility;
    }

    public int getHonour() {
        return honour;
    }

    public int getBravery() {
        return bravery;
    }


    @Override
    public String toString() {
        return  super.toString() +
                ", Благородство: " + nobility +
                ", Честь: " + honour +
                ", Храбрость:" + bravery;
    }
}
