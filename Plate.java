package ru.geekbrains;

public class Plate {
    protected int food;

    public Plate(int food){
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void  addFood(int food){
        this.food += food;
    }

    public void getFood(int food){
        this.food -= food;
    }
}
