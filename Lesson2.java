package ru.geekbrains;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        int[] task1 = {0,1,1,0,0,0,0,1,1,0,1,0,1};
        int[] task2 = new int[8];
        int[] task3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] task4 = new int[10][10];
        int i , j;

        System.out.println("Задача 1:");
        for(i=0; i<13;i++){
            if(task1[i] == 0){
                task1[i]=1;
            } else task1[i] = 0;
            System.out.print(task1[i]);
        }

        System.out.println(" ");
        System.out.println("Задача 2:");
        for(i=0, j = 0; i<8;i++, j=j+3){
            task2[i]=j;
            System.out.print(task2[i] + " ");
        }

        System.out.println(" ");
        System.out.println("Задача 3:");
        for(i=0;i<12;i++){
            if(task3[i]<6){
                task3[i] = task3[i]*2;
            }
            System.out.print(task3[i] + ", ");
        }

        System.out.println(" ");
        System.out.println("Задача 4:");
        for(i=0,j=0;i< task4.length;i++,j++){
            task4[i][j] = 1;
            System.out.println(Arrays.toString(task4[i]) + ", ");
        }
    }
}

