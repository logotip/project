package ru.lesson1;

public class Treadmill implements Obstracle{
    private int track;
    private String treadmill;

    public Treadmill(String treadmill, int track){
        this.treadmill = treadmill;
        this.track = track;
    }


    @Override
    public boolean isObstracle(Participant participant) {
        if(participant.Run()>=track){
            System.out.println(participant.Name() + " пробежал "+treadmill+" длиною " + track + " метров!");
            return true;
        }else {
            System.out.println(participant.Name() +  " не смог пробежать дестанцию :(((!");
            return false;
        }
    }
}
