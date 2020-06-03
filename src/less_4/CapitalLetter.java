package less_4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printResult("Enter string:");

        StringTokenizer st = new StringTokenizer(in.nextLine());
        StringBuilder b = new StringBuilder();
        while (st.hasMoreElements()) {
            b.append(' ');
            b.append(capitalize(st.nextToken()));
        }

        printResult(b.toString().trim());
    }

    private static String capitalize(String msg)
    {
        return msg.substring(0, 1).toUpperCase() + msg.substring(1);
    }

    private static void printResult(String msg)
    {
        System.out.println(msg);
    }
}
