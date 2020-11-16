package ru.lesson1;

public class People implements Participant {
    private String name;
    private int run;
    private int jump;

    public People(String  name, int run, int jump){
        this.name = name;
        this.run = run;
        this.jump = jump;
    }
    public People(String name){
        this.name = name;
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
