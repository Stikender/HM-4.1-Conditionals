public class Main {
    public static void main(String[] args) {

    System.out.println("Exercise 1");
        int age1 = 15;
        if (age1 >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }

        if (age1 < 18) {
            System.out.println("Тебе еще нет 18 лет, нужно немного подождать.");
        }

        System.out.println("Exercise 2");
        int age2 = 25;
        if (age2 <=7) {
            System.out.println("Ребенок еще мал для обучения в образовательных учреждениях.");
        }

        if (age2 >= 7) {
            System.out.println("Ребенок школьник");
        }

        if (age2 >= 18) {
            System.out.println("Человек студент.");
        }

        if (age2 >= 24) {
            System.out.println("Человек закончил Университет, можно искать работу.");
        }


    }
}