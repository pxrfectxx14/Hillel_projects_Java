package HW_09;

// Напишіть метод, який приймає параметри: ціле число n і рядок text.
// Метод повинен вивести текстовий рядок text n рази, розділяючи кожен рядок символом переносу.

public class TextPrinter {

    public static void printTextNTimes(int n, String text) {

        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}
