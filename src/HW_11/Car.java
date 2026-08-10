package HW_11;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Автомобіль заведено");
    }

    private void startElectricity() {
        System.out.println("Подається електрика на бортову систему");
    }

    private void startCommand() {
        System.out.println("Команда запуску передана до двигуна");
    }

    private void startFuelSystem() {
        System.out.println("Паливна система активована");
    }
}