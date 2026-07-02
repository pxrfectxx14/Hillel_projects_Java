/*
Product No 1: smartphone,
total sales for 5 days is EUR 12153,41,
sales by day is EUR 2430,68.

Product No 2: laptop,
total sales for 7 days is EUR 10486,85,
sales by day is EUR 1498,12.
*/

package HW_03;

public class hw_03 {

    public static void main(String[] args) {

        int n = 1;
        String product = "smartphone";
        int days = 5;
        double totalSales = 12153.41;
        double oneSale = totalSales / days;

        System.out.println("Product No " + n + ": " + product + ",");
        System.out.println("total sales for " + days + " days is EUR " + totalSales + ",");
        System.out.printf("sales by day is EUR %.2f", oneSale);
        System.out.println(".");

        n = 2;
        product = "laptop";
        days = 7;
        totalSales = 10486.85;
        oneSale = totalSales / days;

        System.out.println("         ");
        System.out.println("Product No " + n + ": " + product + ",");
        System.out.println("total sales for " + days + " days is EUR " + totalSales + ",");
        System.out.printf("sales by day is EUR %.2f", oneSale);
        System.out.println(".");
    }
}