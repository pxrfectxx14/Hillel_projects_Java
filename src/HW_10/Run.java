package HW_10;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        Person[] people = {
                new Person("John", 30, "Інженер"),
                new Person("Mary", 25, "Вчитель"),
                new Person("Bob", 35, "Лікар"),
        };

        System.out.println("Список осіб:");
        for (Person person : people) {
            person.printInfo();
        }

        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);

        boolean continueLoop = true;

        //Повтор циклу
        while (continueLoop) {

            System.out.print("Введіть ім'я особи, якій потрібно змінити професію: ");
            String nameToFind = scanner.nextLine();

            Person foundPerson = null;
            for (Person person : people) {
                if (person.getName().equalsIgnoreCase(nameToFind)) {
                    foundPerson = person;
                    break;
                }
            }

            if (foundPerson == null) {
                System.out.println("Особу з ім'ям " + '"' + nameToFind + '"' + " не знайдено.");
            } else {
                System.out.print("Введіть нову професію для " + foundPerson.getName() + ": ");
                String newProfession = scanner.nextLine();
                foundPerson.setProfession(newProfession);

                System.out.println(" ");
                System.out.println("Оновлений список осіб:");
                for (Person person : people) {
                    person.printInfo();
                }
            }

            System.out.println(" ");
            System.out.print("Змінити ще одну професію? (так/ні): ");
            String answer = scanner.nextLine();
            continueLoop = answer.equalsIgnoreCase("так");
            System.out.println(" ");
        }

        System.out.println("Роботу програми завершено.");
        scanner.close();
    }
}