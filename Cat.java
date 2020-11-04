package ru.geekbrains;

import javax.xml.namespace.QName;

public class Cat extends Animal{

    public Cat(String name){
        super(name);
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
