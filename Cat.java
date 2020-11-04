package ru.geekbrains;

import javax.xml.namespace.QName;

public class Cat extends Animal{
    public static int catsCount;
    protected int appetit;

    public Cat(String name){
        super(name, 100, false);
        catsCount++;
    }

    public void voice(){
        System.out.println("Муррр Мя!");
    }

    @Override
    public void isRun(int len) {
        if (len<=200){
            System.out.println(getName() + " пробежал " + len + " метров!");
        } else {
            super.isRun(len);
        }
    }
}
