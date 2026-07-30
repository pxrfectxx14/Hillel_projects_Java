package HW_09;

// Напишіть метод, який приймає масив цілих чисел та обчислює і повертає суму всіх елементів масиву.

public class ArraySumCalculator {

        public static int sumArray(int[] array) {

            int sum = 0;
            for (int value : array) {
                sum += value;
            }
            return sum;
        }
    }

