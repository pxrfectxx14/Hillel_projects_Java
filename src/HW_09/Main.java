package HW_09;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Напишіть метод, який приймає ціле число як аргумент і виводить його квадрат.
        System.out.print("1. Введіть ціле число: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        SquareCalculator.printSquare(number);
        System.out.println(" ");

        // Напишіть метод, який приймає два аргументи типу double - радіус та висоту - і повертає об'єм циліндра.
        // Виведіть об'єм циліндра на екран.
        System.out.print("2. Введіть радіус циліндра: ");
        double radius = Double.parseDouble(scanner.nextLine());
        System.out.print("  Введіть висоту циліндра: ");
        double height = Double.parseDouble(scanner.nextLine());
        double volume = CylinderCalculator.cylinderVolume(radius, height);
        System.out.println("  Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume + ".");
        System.out.println(" ");

        // Напишіть метод, який приймає масив цілих чисел та обчислює і повертає суму всіх елементів масиву.
        System.out.print("3. Введіть числа масиву через пробіл: ");
        String[] numbersAsText = scanner.nextLine().trim().split("\\s+");
        int[] array = new int[numbersAsText.length];
        for (int i = 0; i < numbersAsText.length; i++) {
            array[i] = Integer.parseInt(numbersAsText[i]);
        }
        int sum = ArraySumCalculator.sumArray(array);
        System.out.println("  Масив чисел: " + Arrays.toString(array));
        System.out.println("  Сума всіх елементів масиву дорівнює " + sum + ".");
        System.out.println(" ");

        // Напишіть метод, який приймає рядок (String) як аргумент та повертає новий рядок,
        // який складається з букв цього рядка у зворотньому порядку.
        System.out.print("4. Введіть рядок: ");
        String text = scanner.nextLine();
        String reversed = StringReverser.reverseString(text);
        System.out.println("  Рядок в зворотньому порядку: " + reversed);
        System.out.println(" ");

        // Напишіть метод, який приймає два цілих числа, a та b, і повертає результат a^b (a підняте до степеня b).
        System.out.print("5. Введіть a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("  Введіть b: ");
        int b = Integer.parseInt(scanner.nextLine());
        long powerResult = PowerCalculator.power(a, b);
        System.out.println("  Результат " + a + "^" + b + " дорівнює " + powerResult + ".");
        System.out.println(" ");

        // Напишіть метод, який приймає параметри: ціле число n і рядок text.
        // Метод повинен вивести текстовий рядок text n рази, розділяючи кожен рядок символом переносу.
        System.out.print("6. Введіть ціле число n: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.print("  Введіть текстовий рядок: ");
        String repeatText = scanner.nextLine();
        TextPrinter.printTextNTimes(n, repeatText);

        scanner.close();
    }
}
