package HW_06;

import java.util.Random;

public class hw_06 {

    public static void main(String[] args) {

        int[] numbers = new int[20];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(201) - 100;
        }

        System.out.print("Елементи масиву: [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println(" ");

        // Знайдіть та виведіть суму всіх від'ємних чисел в масиві.

        int negativeSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                negativeSum += numbers[i];
            }
        }
        System.out.println("Сума від'ємних чисел: " + negativeSum + ".");

        // Знайдіть та виведіть кількість парних і непарних чисел в масиві.

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
            else {
                oddCount++;
            }
        }

        System.out.println("Кількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);

        // Знайдіть найбільший та найменший елементи масиву та їхні індекси.

        int min = numbers[0];
        int max = numbers[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }

        System.out.println("Найменший елемент: " + min + " (з індексом " + minIndex + ")" + ".");
        System.out.println("Найбільший елемент: " + max + " (з індексом " + maxIndex + ")" + ".");

        /*
        Знайдіть і виведіть середнє арифметичне чисел, розташованих
          після першого від'ємного числа у масиві
          (або повідомте, якщо від'ємних чисел немає).
         */

        int firstNegativeIndex = -1;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }
        if (firstNegativeIndex == -1) {
            System.out.println("У масиві немає від'ємних чисел.");
        } else if (firstNegativeIndex == numbers.length - 1) {
            System.out.println("Після першого від'ємного числа немає елементів.");
        } else {
            for (int i = firstNegativeIndex + 1; i < numbers.length; i++) {
                sum += numbers[i];
                count++;
            }

            double average = (double) sum / count;
            System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %.2f", average);
            System.out.printf(".");
            System.out.println(" ");
        }


    }
}
