package HW_09;

// Напишіть метод, який приймає рядок (String) як аргумент та повертає новий рядок,
// який складається з букв цього рядка у зворотньому порядку.

public class StringReverser {

    public static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
