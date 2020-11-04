package ru.geekbrains;

public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("РРРав! Гав! Тяв, блин!");
    }

    @Override
    public void isRun(int len) {
        if (len<=500){
            System.out.println(getName() + " пробежал " + len + " метров!");
        } else {
            super.isRun(len);
        }
    }

    @Override
    public void isSwim(int len) {
        if (len<=10){
            System.out.println(getName() + " проплыл " + len + " метров! Красавчик!");
        } else {
            super.isSwim(len);
        }
    }
}
