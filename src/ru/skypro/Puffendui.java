package ru.skypro;

public class Puffendui extends Hogwarts{
    private final int hardworking;
    private final int loyalty;
    private final int honesty;

    public Puffendui(String fullName, int powerOfMagic,
                     int transgressionDistance, int hardworking,
                     int loyalty, int honesty) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Трудолюбивость: " + hardworking +
                ", Верность: " + loyalty +
                ", Честность: " + honesty;
    }
}
