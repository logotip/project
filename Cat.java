package ru.lesson1;

public class Cat implements Participant {
    private String name;
    private int run;
    private int jump;

    public Cat(String  name, int run, int jump){
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    @Override
    public int Jump() {
        return jump;
    }

    @Override
    public int Run() {
        return run;
    }

    @Override
    public String Name() {
        return name;
    }

    public String getName() {
        return name;
    }
}
