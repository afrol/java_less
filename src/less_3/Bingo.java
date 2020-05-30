package less_3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        recusingRandNumber(
            new Random().nextInt(100),
            0
        );
    }

    private static void recusingRandNumber(int randNumber, int counter)
    {
        ++counter;

        Scanner in = new Scanner(System.in);
        printResult("Enter number from 0 to 100:");

        if (isExit(in)) {
            printResult("Exit");
            return;
        }

        int number = in.nextInt();

        if (number == randNumber) {
            printResult("Bingo!!! You guess " + number + " with attempt " + counter);
            return;
        }

        if (randNumber > number) {
            printResult("Guessed number greater then yours");
        } else {
            printResult("Guessed number less then yours");
        }

        recusingRandNumber(randNumber ,counter);
    }

    private static void printResult(String msg)
    {
        System.out.println(msg);
    }

    private static boolean isExit(Scanner in)
    {
        return !in.hasNextInt();
    }
}
