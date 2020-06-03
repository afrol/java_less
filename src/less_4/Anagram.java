package less_4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        printResult("Enter string:");
        String str = in.nextLine();

        printResult("Enter next sting:");
        String anagramStr = in.nextLine();

        if (str.equals(anagramStr)) {
            printResult("Error: Two string are equal");
            return;
        }

        printResult(
            "Is Anagram: " + (
                    sortString(
                        normalizeString(str)
                    ).equals(
                        sortString(
                                normalizeString(anagramStr)
                        )
                    ) ? "Yes" : "No"
                )
        );
    }

    private static String sortString(String str)
    {
        char[] chArray = str.toCharArray();
        Arrays.sort(chArray);

        return new String(chArray);
    }

    private static String normalizeString(String str)
    {
        str = str
                .toLowerCase()
                .trim()
                .replaceAll("[^\\p{L}\\p{Nd}]+", "")
                .replace(" ", "");
        return str;
    }

    private static void printResult(String msg)
    {
        System.out.println(msg);
    }
}
