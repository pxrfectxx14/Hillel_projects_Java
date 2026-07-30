package HW_09;

// Напишіть метод, який приймає два аргументи типу double - радіус та висоту - і повертає об'єм циліндра.
// Виведіть об'єм циліндра на екран.

public class CylinderCalculator {

        public static double cylinderVolume(double radius, double height) {

            return Math.PI * radius * radius * height;
        }
    }
