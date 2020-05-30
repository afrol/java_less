package less_3;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int listSize = 10;
        int[] list = new int[listSize];

        initList(list, 0, listSize);
        bubbleSort(list);
        printResult(Arrays.toString(list));
    }

    private static void initList(int[] list, int counter, int size)
    {
        if (counter == size) {
            return;
        }

        Scanner in = new Scanner(System.in);
        printResult("Enter element of list # " + counter + ":");

        if (isExit(in)) {
            printResult("Exit");
            return;
        }

        list[counter++] = in.nextInt();
        initList(list, counter, size);
    }

    private static void bubbleSort(int[] list)
    {
        int length = list.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < (length - i - 1); j++) {
                if (list[j] > list[j + 1] ){
                    swap(list, j, j + 1);
                }
            }
        }
    }

    public static void swap (int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
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
