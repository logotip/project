package ru.geekbrains;

public class Lesson6 {
    public static void main(String[] args) {
       Cat cat = new Cat("Мурзик");
       Dog dog = new Dog("Шарик");
       System.out.println(Animal.animalCount);

       cat.isRun(150);
       dog.isRun(440);
       dog.isSwim(8);
       cat.isSwim(100);
       cat.isRun(600);

    }
}
