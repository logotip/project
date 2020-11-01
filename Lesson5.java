package ru.geekbrains;

public class Lesson5 {

    public static void main(String[] args) {
        Person[] arrPerson = new Person[5];
        arrPerson[0] = new Person("Grigorev Sergey", "driver", "s.grigorev@mail.ru", "89010000001", 25000, 52);
        arrPerson[1] = new Person("Antonov Sergey", "driver", "s.antonov@mail.ru", "89010000002", 25000, 47);
        arrPerson[2] = new Person("Ladan Elena", "bookkeeper", "e.ladan@mail.ru", "89010000003", 35000, 31);
        arrPerson[3] = new Person("Filonov Ivan", "ingineer", "i.filonov@mail.ru", "89010000004", 40000, 34);
        arrPerson[4] = new Person("Osipova Alina", "operator", "a.osipovan@mail.ru", "89010000005", 24000, 23);

        System.out.println("Список сотрудников старше 40 лет:");


        for(int i=0; i< arrPerson.length; i++){
            if(arrPerson[i].getAge() > 40) {
                System.out.println(arrPerson[i].seePerson());
            }
        }
    }
}
