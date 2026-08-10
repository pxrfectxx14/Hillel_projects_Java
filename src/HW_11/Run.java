package HW_11;

import HW_11.Employee;
import HW_11.Car;

public class Run {
    public static void main(String[] args) {
        Employee employee = new Employee(
                "Іваненко Іван Іванович",
                "Java Developer",
                "ivanenko@example.com",
                "+380501234567",
                28
        );
        System.out.println(employee);

        Car car = new Car();
        car.start();

         // car.startElectricity(); // не скомпілюється, якщо розкомментувати: метод private
    }
}