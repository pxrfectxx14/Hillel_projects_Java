package HW_14;

public class Run {

    public static void main(String[] args) {
        AdviceProvider adviceProvider = new WeekdayAdviceProvider();

        Day today = Day.FRIDAY; // << тут можна підставити будь-який день для перевірки

        adviceProvider.advise(today);
    }
}
