package ru.lesson1;

public class Wall implements Obstracle{
    private int height;
    private String wall;

    public Wall(String wall, int height){
        this.wall = wall;
        this.height = height;
    }


    @Override
    public boolean isObstracle(Participant participant) {
        if(participant.Jump() >= height){
            System.out.println(participant.Name() + " перепрыгнул стену высотой " + height + " метров!");
            return true;
        }else {
            System.out.println(participant.Name() + " не справился с высотой " + height + " метрой :((");
            return false;
        }
    }
}
