package ru.skypro;

public class Hogwarts {
    private final String fullName;
    private final int powerOfMagic;
    private final int transgressionDistance;

    public Hogwarts(String fullName, int powerOfMagic, int transgressionDistance) {
        this.fullName = fullName;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getFullName() {
        return fullName;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    @Override
    public String toString() {
        return "Полное имя: " + fullName + ", Сила магии: " + powerOfMagic +
                ", Дальность трансгрессии: " + transgressionDistance;
    }
}
