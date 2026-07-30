package HW_09;

// Напишіть метод, який приймає два цілих числа, a та b, і повертає результат a^b (a підняте до степеня b).

public class PowerCalculator {

    public static long power(int a, int b) {

        long result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
