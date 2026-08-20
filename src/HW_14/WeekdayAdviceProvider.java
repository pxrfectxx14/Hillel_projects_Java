package HW_14;

public class WeekdayAdviceProvider implements AdviceProvider {

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> printWorkdayAdvice();
            case FRIDAY -> printFridayGreeting();
            case SATURDAY, SUNDAY -> printWeekendAdvice();
        }
    }

    private void printWorkdayAdvice() {
        System.out.println("Порада: розбий великі задачі на дрібні кроки та");
        System.out.println("працюй методом Pomodoro — 25 хвилин фокусу, 5 хвилин відпочинку.");
    }

    private void printFridayGreeting() {
        System.out.println("Happy Friday!");
    }

    private void printWeekendAdvice() {
        System.out.println("Рекомендую відвідати: місцевий парк, кав'ярню з друзями");
        System.out.println("або музей, який давно відкладав.");
    }
}
