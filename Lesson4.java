package ru.geekbrains;


import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static final int BOX = 3;
   // public static final int WIN = 3; //сколько должно быть совпадений для выигрыша
    public static final char PLAYER = 'X';
    public static final char PC = '0';
    public static final char EMPTY = '-';

    public static void main(String[] args) {
        char[][] field = new char[BOX][BOX];
        for (int i = 0; i < BOX; i++) {
            for (int j = 0; j < BOX; j++) {
                field[i][j] = EMPTY;
            }
        }
        print(field);
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        while (true) {
            //ход игрока
            System.out.println("Ваш ход! Например: 1 1");
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            int x = Integer.parseInt(parts[0]) - 1;
            int y = Integer.parseInt(parts[1]) - 1;
            if (x < 0 || y < 0 || x > BOX || y > BOX) {
                System.out.println("Координаты за границей поля");
                continue;
            }
            if (field[x][y] != EMPTY) {
                System.out.println("Эта ячейка занята!");
                continue;
            } else field[x][y] = PLAYER;
            System.out.println("Ход игрока:");
            print(field);
           if(isWin(field, PLAYER)){
                System.out.println("Победил Игрок!");
                break;
            }else if(!hasEmptyCells(field)) {
               System.out.println("Ничья!");
               break;
           }

            //Ход компьютера
            while (true) {
                int cx = rand.nextInt(BOX);
                int cy = rand.nextInt(BOX);
                if (field[cx][cy] != EMPTY) {
                    continue;
                } else field[cx][cy] = PC;
                break;
            }
            print(field);
            if(isWin(field, PC)){
                System.out.println("Победил Компьютер!");
                break;
            }else if(!hasEmptyCells(field)) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

    public static void print(char[][] field) {
        for (int i = 0; i < BOX; i++) {
            for (int j = 0; j < BOX; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean isWin(char[][] field, char player) {
        for (int i = 0; i < BOX; i++) {
            for(int j=0;j<BOX; j++){
                if(field[i][0] == player&&field[i][1] == player&&field[i][2] == player)
                    return true;
                if(field[0][j] == player&&field[1][j] == player&&field[2][j] == player)
                    return true;
            }
        }
        if (field[0][0] == player && field[1][1] == player && field[2][2] == player)
            return true;
        if (field[2][0] == player && field[1][1] == player && field[0][2] == player)
            return true;
        return false;
    }
    public static boolean hasEmptyCells(char[][] field){
        System.out.println();
        for(int i = 0; i < BOX; i++) {
            for (int j = 0; j < BOX; j++) {
                if (field[i][j] == EMPTY) return true;
            }
        }
        return false;
    }
}
