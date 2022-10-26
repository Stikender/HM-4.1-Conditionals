import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

    System.out.println("Exercise 1.1");
        int age1 = 15;
        if (age1 >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }

        if (age1 < 18) {
            System.out.println("Тебе еще нет 18 лет, нужно немного подождать.");
        }

        System.out.println("Exercise 1.2");
        int age2 = 19;


        if (age2 >= 7 && age2 < 18) {
            System.out.println("Ребенок школьник");
        }

        if (age2 >= 18 && age2 < 24) {
            System.out.println("Человек студент.");
        }

        if (age2 >= 24) {
            System.out.println("Человек закончил Университет, можно искать работу.");
        }

        System.out.println("Exercise 1.3");
        int placeTrain = 30;

        if (placeTrain < 102 && placeTrain <= 60) {
            System.out.println("В вагоне имеются сидячие и стоячие места.");
        }
        if (placeTrain < 102 && placeTrain > 60) {
            System.out.println("В вагоне имеются только стоячие места.");
        }
        if (placeTrain > 102) {
            System.out.println("В вагоне нет совбодных мест.");
        }

        System.out.println("Exercise 2.1");
        if (age1 >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        else  {
            System.out.println("Тебе еще нет 18 лет, нужно немного подождать.");
        }

        System.out.println("Exercise 2.2");

        if (age2 >= 7 && age2 < 18) {
            System.out.println("Ребенок школьник");
        } else if (age2 >= 18 && age2 < 24) {
            System.out.println("Человек студент.");
        }
        else {
            System.out.println("Человек закончил Университет, можно искать работу.");
        }

        System.out.println("Exercise 2.3");

        if (placeTrain < 102 && placeTrain <= 60) {
            System.out.println("В вагоне имеются сидячие и стоячие места.");
        }
        else if (placeTrain < 102 && placeTrain > 60) {
            System.out.println("В вагоне имеются только стоячие места.");
        }
        else {
            System.out.println("В вагоне нет совбодных мест.");
        }

        System.out.println("Exercise 3.1");
        int age3 = 30;
        if (age3 >= 2 && age3 < 6) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в детский сад");
        }
        else if (age3 >= 6 && age3 < 18) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в школу.");
        }
        else if (age3 >= 18 && age3 < 24) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в университет.");
        }
        else {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить на работу.");
        }

        System.out.println("Exercise 3.2");
        int ageChild = 5;
        if (ageChild < 5) {
            System.out.println("Ребенку запрещено кататься на аттракционе.");
        }
        else if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Ребенку можно кататься на аттрационе в сопровождении взрослого.");
        }
        else  {
            System.out.println("Ребенку можно кататься на аттрационе самостоятельно, без сопровождения взрослого.");
        }

        System.out.println("Exercise 3.3");

        int one = 15;
        int two = 5;
        int free = 10;

        if (one >= two && one >= free) {
            System.out.println("Число равное " + one + " больше.");
        }
        else if (two >= one && two >= free) {
            System.out.println("Число равное " + two + " больше.");
        }
        else {
            System.out.println("Число равное " + free + " больше.");
        }
    }
}