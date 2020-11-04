package ru.geekbrains;

public class Lesson7 {
    public static void main(String[] args) {
        Cat[] cats= new Cat[5];
        cats[0] = new Cat("Мурзик");
        cats[1] = new Cat("Мусик");
        cats[2] = new Cat("Бельчик");
        cats[3] = new Cat("Тимон");
        cats[4] = new Cat("Барс");

        Plate plate = new Plate(445);
        for (int i = 0; i< cats.length;i++){
            cats[i].eat(plate);

        }

    }
}
