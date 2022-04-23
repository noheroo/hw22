package ru.skypro;

public class Slizerin extends Hogwarts{
    private final int cunning;
    private final int resoluteness;
    private final int ambitiousness;
    private final int resourcefulness;
    private final int lustForPower;

    public Slizerin(String fullName, int powerOfMagic,
                    int transgressionDistance, int cunning, int resoluteness,
                    int ambitiousness, int resourcefulness, int lustForPower) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.resoluteness = resoluteness;
        this.ambitiousness = ambitiousness;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public int getAmbitiousness() {
        return ambitiousness;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", Хитрость: " + cunning +
                ", Решительность: " + resoluteness +
                ", Амбициозность: " + ambitiousness +
                ", Находчивость: " + resourcefulness +
                ", Жажда власти: " + lustForPower;
    }
}
