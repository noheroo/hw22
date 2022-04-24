package ru.skypro;

public class Cogtevran extends Hogwarts {
    private final int smart;
    private final int wisdom;
    private final int witty;
    private final int creation;

    public Cogtevran(String fullName, int powerOfMagic,
                     int transgressionDistance, int smart, int wisdom,
                     int witty, int creation) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.smart = smart;
        this.wisdom = wisdom;
        this.witty = witty;
        this.creation = creation;
    }

    public int getSmart() {
        return smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreation() {
        return creation;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Ум: " + smart +
                ", Мудрость: " + wisdom +
                ", Верность: " + witty +
                ", Творчество: " + creation;
    }
}
