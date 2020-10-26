package ru.geekbrains;

import java.lang.ref.SoftReference;
import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        //задание 1
        while(true) {
            int random = ran.nextInt(10);
            for (int i = 0; i < 3; i++) {
                System.out.println("Введите число! Попытка №"+(i+1));
                int a = scan.nextInt();
                if (a > random) {
                    System.out.println("Слишком большое число! Попробуйте еще раз!");
                } else if (a < random) {
                    System.out.println("Слишком маленькое число! Попробуйте еще раз!");
                } else {
                    System.out.println("Вы угадали! " + a + "=" + random);
                    break;
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            int b = scan.nextInt();
            if(b==0) break;
        }
        System.out.println("До встречи!");
        //Задание 2
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};

        int arrCount = ran.nextInt(words.length);
        while (true) {
            System.out.println("Введите слово");
            String word = scan.nextLine();
            String s = words[arrCount];
            if (s.equals(word)) {
                System.out.println("Вы угадали! Это слово " + s);
                break;
            } else {
                for(int i=0; i< 15;i++){
                    int x = Math.min(word.length(),s.length());
                 if(i < x && s.charAt(i)==word.charAt(i)){
                     System.out.print(s.charAt(i));
                 }  else System.out.print("#");
                }
                System.out.println(" ");
                System.out.println("Ошибка! Попробуйте еще раз!");

            }
        }
    }
}
