package ru.geekbrains;

public class TaskOne {
    public static void main(String[] args) {
        byte a = 2;
        short b = 3;
        int c = 4;
        long d = 44444444444L;
        float e = 25.35f;
        double f = 3.3456;
        char g = 0;
        boolean bol = false;
        System.out.println(result(4,7,5,8));
        System.out.println(sum(7,9));
        znak(-2);
        System.out.println(isMinus(-45));
        getString("Василий");
    }
    public static float result (float a, float b, float c, float d){
       return a * (b + (c / d));
    }
    public static boolean sum(int a, int b){
        int suma;
        suma = a + b;
        if(10<suma || suma >= 20) {
            return true;
        }
        else return false;
    }
    public static void znak(int a){
        if(a<0){
            System.out.println("Число отрицательное");
        }
        else System.out.println("Число положительное");
    }
    public static boolean isMinus(int a){
        if(a<0){
            return true;
        }
        else return false;
    }
    public static void getString(String name){
        System.out.println("Привет, " + name + "!");
    }

}
