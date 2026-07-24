package HW_08;

import java.util.Random;

public class hw_08 {

    public static void main(String[] args) {

        int[][] numbers = new int[4][4];
        Random random = new Random();

        System.out.println("Матриця 4x4:");

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                numbers[row][col] = random.nextInt(50) + 1;
            }
        }


        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                System.out.print(numbers[row][col]);

                if (col < numbers[row].length - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println(" ");

        }

        int evenSumRow = 0;

        for (int col = 0; col < numbers.length; col++) {
            evenSumRow += numbers[0][col];
        }

        for (int col = 0; col < numbers.length; col++) {
            evenSumRow += numbers[2][col];
        }

        int oddSumRow = 0;

        for (int col = 0; col < numbers.length; col++) {
            oddSumRow += numbers[1][col];
        }

        for (int col = 0; col < numbers.length; col++) {
            oddSumRow += numbers[3][col];
        }

        System.out.println(" ");
        System.out.println("Сума елементів у парних рядках (рядок 0, 2): " + evenSumRow);
        System.out.println("Сума елементів у непарних рядках (рядок 1, 3): " + oddSumRow);

        long evenProductCol = 1;

        for (int row = 0; row < numbers.length; row++) {
            evenProductCol *= numbers[row][0];
        }

        for (int row = 0; row < numbers.length; row++) {
            evenProductCol *= numbers[row][2];
        }

        long oddProductCol = 1;

        for (int row = 0; row < numbers.length; row++) {
            oddProductCol *= numbers[row][1];
        }

        for (int row = 0; row < numbers.length; row++) {
            oddProductCol *= numbers[row][3];
        }

        System.out.println("Добуток елементів у парних стовпцях (стовпець 0, 2): " + evenProductCol);
        System.out.println("Добуток елементів у непарних стовпцях (стовпець 1, 3): " + oddProductCol);

        int magicSum = 0;

        for (int j = 0; j < numbers[0].length; j++) {
            magicSum += numbers[0][j];
        }

        boolean isMagic = true;

        for (int row = 0; row < numbers.length; row++) {
            int sum = 0;

            for (int col = 0; col < numbers[row].length; col++) {
                sum += numbers[row][col];
            }

            if (sum != magicSum) {
                isMagic = false;
                break;
            }
        }

        if (isMagic) {
            for (int j = 0; j < numbers[0].length; j++) {
                int sum = 0;

                for (int i = 0; i < numbers.length; i++) {
                    sum += numbers[i][j];
                }

                if (sum != magicSum) {
                    isMagic = false;
                    break;
                }
            }
        }

        if (isMagic) {
            int sum = 0;

            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i][i];
            }

            if (sum != magicSum) {
                isMagic = false;
            }
        }

        if (isMagic) {
            int sum = 0;

            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i][numbers.length - 1 - i];
            }

            if (sum != magicSum) {
                isMagic = false;
            }
        }

        System.out.println(" ");

        if (isMagic) {
            System.out.println("Матриця є магічним квадратом.");
        } else {
            System.out.println("Матриця не є магічним квадратом.");
        }

    }
}