package HW_05;

public class hw_05 {

    public static void main(String[] args) {

        int sum = 0;

        for (int a = 1; a <= 6; a++) {
            sum += a;
            System.out.println(a + ") Num is " + a + ", " + "sum is " + sum);
        }
        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + sum);
    }
}
