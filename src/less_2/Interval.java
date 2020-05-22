package less_2;

import java.util.Scanner;

public class Interval {
    final static int[][] range = {
            {0, 14},
            {15, 35},
            {36, 50},
            {51, 100},
    };

    public static void main(String[] args) {
        Scanner request = new Scanner(System.in);
        System.out.println("Enter number from 0 to 100:");
        int number = request.nextInt();

        for (int i = 0; i < range.length; i++) {
            if (number >= range[i][0] && number <= range[i][1]) {
                printResult(number, i);
                return;
            }
        }

        System.out.println("Error:: The number [" + number + "] is not in numbers range.");
    }

    private static void printResult(int number, int i)
    {
        System.out.println("The number [" + number + "] is in "
                + range[i][0] + " - " + range[i][1] + " range.");
    }
}
