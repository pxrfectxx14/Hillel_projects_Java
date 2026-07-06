package HW_04;

public class hw_04 {

    public static void main(String[] args) {

        double income = 8000;
        double firstTax = 2.5;
        double secondTax = 4.3;
        double thirdTax = 6.7;

        if (income >= 0 && income <= 10000) {
            System.out.printf("Сума податку від доходу: %.0f", income * firstTax / 100);
            System.out.println(".");
        } else if (income <= 25000) {
            System.out.printf("Сума податку від доходу: %.0f", income * secondTax / 100);
            System.out.println(".");
        } else {
            System.out.printf("Сума податку від доходу: %.0f", income * thirdTax / 100 );
            System.out.println(".");
        }
    }

}
