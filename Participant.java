package ru.lesson1;

public interface Participant extends Runner, Jumper {
    default boolean isGo(Obstracle obstracle){
       return isAction(obstracle);
    }
    private boolean isAction(Obstracle obstracle){
       return obstracle.isObstracle(this);
    }



}
