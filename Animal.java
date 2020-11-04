package ru.geekbrains;

public abstract class Animal {
    protected String name;
    public static int animalCount;
    protected int appetit;
    private boolean full;


    public Animal(String name, int appetit, boolean full){
        this.name = name;
        this.appetit = appetit;
        this.setFull(full);
        animalCount++;
    }

    public void eat(Plate plate){
        System.out.println(getName() + " пошел кушать:");
        if(plate.getFood() >= appetit) {
            plate.getFood(appetit);
            setFull(true);
            System.out.println("Хозяин, я покушал! В тарелке осталось " + plate.getFood() + ". Сытость = " + getFull());
        }else {

            System.out.println("Здесь слишком мало еды для " + getName() + "а. Осталось " + plate.getFood());
            System.out.println("Сытость = " + getFull());
        }
    }

    public  int getAppetit(){
        return appetit;
    }
    public boolean getFull(){
        return full;
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

    public void setFull(boolean full) {
        this.full = full;
    }
}
