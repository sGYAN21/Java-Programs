import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
     public static boolean areAnagrams(String str1, String str2) {
        // Remove any spaces and convert to lowercase
        String s1 = str1.replace(" ", "").toLowerCase();
        String s2 = str2.replace(" ", "").toLowerCase();

        // Check if the lengths are equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted char arrays
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
