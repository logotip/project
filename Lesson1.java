package ru.lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        Obstracle[] obstracles = {new Treadmill("Скоростной бег",100), new Wall("Стена",1),
                                    new Treadmill("Марафонский бег",400),new Wall("Стена",2)};
        Participant[] participants = {new People("George", 400, 3),
                new Cat("Муся", 200, 2),
                new Robot("C-3PO", 100, 1)};
        for (int i=0; i< participants.length; i++){
            for (int j = 0; j< obstracles.length; j++){
                if(participants[i].isGo(obstracles[j]) == true){
                    System.out.println(obstracles[j]);
                }else {
                    System.out.println(obstracles[j]);
                    break;
                }
            }
        }

    }
}
