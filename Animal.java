package ru.geekbrains;

public abstract class Animal {
    protected String name;
    public static int animalCount;

    public Animal(String name){
        this.name = name;
        animalCount++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void voice();

    public  void isRun(int len){
        System.out.println(getName() +" не бегает так много!");
    }

    public void isSwim(int len){
        System.out.println(getName() +" не поплывет!");
    }

}
