package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Hogwarts[] hogwarts = {
                new Hogwarts("Гарри Поттер", 75, 50),
                new Hogwarts("Гермиона Грейнджер", 70, 80),
                new Hogwarts("Рон Уизли", 50, 40),
                new Hogwarts("Драко Малфой", 41, 21),
                new Hogwarts("Грэхэм Монтегю", 32, 12),
                new Hogwarts("Грегори Гойл", 47, 42),
                new Hogwarts("Захария Смит", 58, 95),
                new Hogwarts("Седрик Диггори", 78, 55),
                new Hogwarts("Джастин Финч-Флетчли", 8, 34),
                new Hogwarts("Чжоу Чанг", 46, 61),
                new Hogwarts("Падма Патил", 65, 35),
                new Hogwarts("Маркус Белби", 71, 42)
        };

        Griffindor[] griffindors = {
                new Griffindor("Гарри Поттер", 75, 50, 80, 70, 80),
                new Griffindor("Гермиона Грейнджер", 70, 80, 70, 60, 65),
                new Griffindor("Рон Уизли", 50, 40, 50, 48, 64)
        };

        Slizerin[] slizerins = {
                new Slizerin("Драко Малфой", 41, 21, 38, 68, 90, 41, 82),
                new Slizerin("Грэхэм Монтегю", 32, 12, 10, 46, 45, 25, 41),
                new Slizerin("Грегори Гойл", 47, 42, 5, 48, 0, 84, 74)
        };

        Puffendui[] puffenduis = {
                new Puffendui("Захария Смит", 58, 95, 12, 45, 78),
                new Puffendui("Седрик Диггори", 78, 55, 23, 34, 54),
                new Puffendui("Джастин Финч-Флетчли", 8, 34, 65, 65, 23),
        };

        Cogtevran[] cogtevrans = {
                new Cogtevran("Чжоу Чанг", 46, 61, 54, 48, 36, 65),
                new Cogtevran("Падма Патил", 65, 35, 75, 24, 42, 81),
                new Cogtevran("Маркус Белби", 71, 42, 91, 32, 46, 42)
        };


        Services services = new Services();
        services.whoBetterGriffindor(griffindors, "гарри поттер", "гермиона грейнджер");
        services.whoBetterSlizerin(slizerins, "Грэхэм Монтегю","Грегори Гойл");
        services.whoBetterPuffendui(puffenduis, "Захария Смит", "Седрик Диггори");
        services.whoBetterCogtevran(cogtevrans, "Чжоу Чанг","Маркус Белби");

        services.whoBetterHogwarts(hogwarts,"Чжоу Чанг","Седрик Диггори","powerOfMagic");
        services.whoBetterHogwarts(hogwarts,"Чжоу Чанг","Седрик Диггори","transgressionDistance");

        services.printPupil(griffindors, slizerins, puffenduis, cogtevrans, "Грэхэм Монтегю");

    }
}