package ru.skypro;

import java.lang.reflect.Array;

public class Services {
    //region Кто лучше в Гриффиндоре
    public void whoBetterGriffindor(Griffindor[] griffindors, String pupil1, String pupil2) {
        int firstPupil = -1;
        int secondPupil = -1;
        //поиск учеников
        for (int i = 0; i < griffindors.length; i++) {
            if (griffindors[i].getFullName().equalsIgnoreCase(pupil1)) {
                firstPupil = i;
            }
            if (griffindors[i].getFullName().equalsIgnoreCase(pupil2)) {
                secondPupil = i;
            }
            if (firstPupil != -1 && secondPupil != -1) {
                break;
            }
        }
        //проверка на ошибки
        if (firstPupil == -1 || secondPupil == -1) {
            System.out.println("Некорректный ввод или Такой ученик отсутствует");
            return;
        }
        if (firstPupil == secondPupil) {
            System.out.println("Вы сравниваете одного и того же ученика");
            return;
        }
        //подсчет очков
        int points1 = griffindors[firstPupil].getNobility() + griffindors[firstPupil].getHonour() +
                griffindors[firstPupil].getBravery();
        int points2 = griffindors[secondPupil].getNobility() + griffindors[secondPupil].getHonour() +
                griffindors[secondPupil].getBravery();
        //вывод в консоль
        System.out.println("\nКто лучше в Гриффиндоре:");
        if (points1 < points2) {
            System.out.println(griffindors[secondPupil].getFullName() + " лучше,чем " + griffindors[firstPupil].getFullName());
        } else {
            System.out.println(griffindors[firstPupil].getFullName() + " лучше,чем " + griffindors[secondPupil].getFullName());
        }
    }
    //endregion
    //region Кто лучше в Слизерене
    public void whoBetterSlizerin(Slizerin[] slizerins, String pupil1, String pupil2) {
        int firstPupil = -1;
        int secondPupil = -1;
        //поиск учеников
        for (int i = 0; i < slizerins.length; i++) {
            if (slizerins[i].getFullName().equalsIgnoreCase(pupil1)) {
                firstPupil = i;
            }
            if (slizerins[i].getFullName().equalsIgnoreCase(pupil2)) {
                secondPupil = i;
            }
            if (firstPupil != -1 && secondPupil != -1) {
                break;
            }
        }
        //проверка на ошибки
        if (firstPupil == -1 || secondPupil == -1) {
            System.out.println("Некорректный ввод или Такой ученик отсутствует");
            return;
        }
        if (firstPupil == secondPupil) {
            System.out.println("Вы сравниваете одного и того же ученика");
            return;
        }
        //подсчет очков
        int points1 = slizerins[firstPupil].getCunning() + slizerins[firstPupil].getResoluteness() +
                slizerins[firstPupil].getAmbitiousness() + slizerins[firstPupil].getResourcefulness() +
                slizerins[firstPupil].getLustForPower();
        int points2 = slizerins[secondPupil].getCunning() + slizerins[secondPupil].getResoluteness() +
                slizerins[secondPupil].getAmbitiousness() + slizerins[secondPupil].getResourcefulness() +
                slizerins[secondPupil].getLustForPower();
        //вывод в консоль
        System.out.println("\nКто лучше в Слизерене:");
        if (points1 < points2) {
            System.out.println(slizerins[secondPupil].getFullName() + " лучше,чем " + slizerins[firstPupil].getFullName());
        } else {
            System.out.println(slizerins[firstPupil].getFullName() + " лучше,чем " + slizerins[secondPupil].getFullName());
        }
    }
    //endregion
    //region Кто лучше в Пуффендуе
    public void whoBetterPuffendui(Puffendui[] puffenduis, String pupil1, String pupil2) {
        int firstPupil = -1;
        int secondPupil = -1;
        //поиск учеников
        for (int i = 0; i < puffenduis.length; i++) {
            if (puffenduis[i].getFullName().equalsIgnoreCase(pupil1)) {
                firstPupil = i;
            }
            if (puffenduis[i].getFullName().equalsIgnoreCase(pupil2)) {
                secondPupil = i;
            }
            if (firstPupil != -1 && secondPupil != -1) {
                break;
            }
        }
        //проверка на ошибки
        if (firstPupil == -1 || secondPupil == -1) {
            System.out.println("Некорректный ввод или Такой ученик отсутствует");
            return;
        }
        if (firstPupil == secondPupil) {
            System.out.println("Вы сравниваете одного и того же ученика");
            return;
        }
        //подсчет очков
        int points1 = puffenduis[firstPupil].getHardworking() + puffenduis[firstPupil].getLoyalty() +
                puffenduis[firstPupil].getHonesty();
        int points2 = puffenduis[secondPupil].getHardworking() + puffenduis[secondPupil].getLoyalty() +
                puffenduis[secondPupil].getHonesty();
        //вывод в консоль
        System.out.println("\nКто лучше в Пуффендуе:");
        if (points1 < points2) {
            System.out.println(puffenduis[secondPupil].getFullName() + " лучше,чем " + puffenduis[firstPupil].getFullName());
        } else {
            System.out.println(puffenduis[firstPupil].getFullName() + " лучше,чем " + puffenduis[secondPupil].getFullName());
        }
    }
    //endregion
    //region Кто лучше в Когтевране
    public void whoBetterCogtevran(Cogtevran[] cogtevrans, String pupil1, String pupil2) {
        int firstPupil = -1;
        int secondPupil = -1;
        //поиск учеников
        for (int i = 0; i < cogtevrans.length; i++) {
            if (cogtevrans[i].getFullName().equalsIgnoreCase(pupil1)) {
                firstPupil = i;
            }
            if (cogtevrans[i].getFullName().equalsIgnoreCase(pupil2)) {
                secondPupil = i;
            }
            if (firstPupil != -1 && secondPupil != -1) {
                break;
            }
        }
        //проверка на ошибки
        if (firstPupil == -1 || secondPupil == -1) {
            System.out.println("Некорректный ввод или Такой ученик отсутствует");
            return;
        }
        if (firstPupil == secondPupil) {
            System.out.println("Вы сравниваете одного и того же ученика");
            return;
        }
        //подсчет очков
        int points1 = cogtevrans[firstPupil].getSmart() + cogtevrans[firstPupil].getWisdom() +
                cogtevrans[firstPupil].getWitty() + cogtevrans[firstPupil].getCreation();
        int points2 = cogtevrans[secondPupil].getSmart() + cogtevrans[secondPupil].getWisdom() +
                cogtevrans[secondPupil].getWitty() + cogtevrans[secondPupil].getCreation();
        //вывод в консоль
        System.out.println("\nКто лучше в Когтевране:");
        if (points1 < points2) {
            System.out.println(cogtevrans[secondPupil].getFullName() + " лучше,чем " + cogtevrans[firstPupil].getFullName());
        } else {
            System.out.println(cogtevrans[firstPupil].getFullName() + " лучше,чем " + cogtevrans[secondPupil].getFullName());
        }
    }
    //endregion
    //region Кто лучше в Хогвардсе
    public void whoBetterHogwarts(Hogwarts[] hogwarts, String pupil1, String pupil2, String whatCompare) {
        int firstPupil = -1;
        int secondPupil = -1;
        //поиск учеников
        for (int i = 0; i < hogwarts.length; i++) {
            if (hogwarts[i].getFullName().equalsIgnoreCase(pupil1)) {
                firstPupil = i;
            }
            if (hogwarts[i].getFullName().equalsIgnoreCase(pupil2)) {
                secondPupil = i;
            }
            if (firstPupil != -1 && secondPupil != -1) {
                break;
            }
        }
        //проверка на ошибки
        if (firstPupil == -1 || secondPupil == -1) {
            System.out.println("Некорректный ввод или Такой ученик отсутствует");
            return;
        }
        if (firstPupil == secondPupil) {
            System.out.println("Вы сравниваете одного и того же ученика");
            return;
        }
        System.out.println("\nКто лучше в Хогвартсе:");
        if (whatCompare.equalsIgnoreCase("powerOfMagic")) {
            if (hogwarts[firstPupil].getPowerOfMagic() < hogwarts[secondPupil].getPowerOfMagic()) {
                System.out.println(hogwarts[secondPupil].getFullName() + " обладает бОльшей силой магии, чем " + hogwarts[firstPupil].getFullName());
            }else {
                System.out.println(hogwarts[firstPupil].getFullName() + " обладает бОльшей силой магии, чем " + hogwarts[secondPupil].getFullName());
            }
        }

        if (whatCompare.equalsIgnoreCase("transgressionDistance")) {
            if (hogwarts[firstPupil].getTransgressionDistance() < hogwarts[secondPupil].getTransgressionDistance()) {
                System.out.println(hogwarts[secondPupil].getFullName() + " обладает лучшей трансгрессией, чем " + hogwarts[firstPupil].getFullName());
            }else {
                System.out.println(hogwarts[firstPupil].getFullName() + " обладает лучшей трансгрессией, чем " + hogwarts[secondPupil].getFullName());
            }
        }

    }
    //endregion
    // region найти ученика и распечатать его данные
    public void printPupil(Griffindor[] griffindors,
                      Slizerin[] slizerins,
                      Puffendui[] puffenduis,
                      Cogtevran[] cogtevrans,
                      String pupil) {
        System.out.println("\nВывести данные ученика " + pupil);
        //поиск учеников
        for (Griffindor griffindor : griffindors) {
            if (griffindor.getFullName().equalsIgnoreCase(pupil)) {
                System.out.println(griffindor);
                return;
            }
        }

        for (Slizerin slizerin : slizerins) {
            if (slizerin.getFullName().equalsIgnoreCase(pupil)) {
                System.out.println(slizerin);
                return;
            }
        }

        for (Puffendui puffendui : puffenduis) {
            if (puffendui.getFullName().equalsIgnoreCase(pupil)) {
                System.out.println(puffendui);
                return;
            }
        }

        for (Cogtevran cogtevran : cogtevrans) {
            if (cogtevran.getFullName().equalsIgnoreCase(pupil)) {
                System.out.println(cogtevran);
                return;
            }
        }
        System.out.println("Некорректный ввод или Такой ученик отсутствует");
    }
    //endregion

}






