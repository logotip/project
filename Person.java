package ru.geekbrains;

public class Person {
    private String fio;
    private String job;
    private String email;
    private String phone;
    private int price;
    private int age;

    public Person(String fio, String job, String email, String phone, int price, int age){
        this.fio = fio;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.price = price;
        this.age = age;
    }
    public String seePerson(){
        return "ФИО: " + fio + ". Должность: " + job + ". Е-мейл: "+ email +". Телефон: " + phone + " Зарплата: "+price +". Возраст: "+ age;
    }

    public int getAge() {
        return age;
    }
}
