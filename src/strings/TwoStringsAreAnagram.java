package strings;

import java.util.Arrays;

public class TwoStringsAreAnagram {
    public static void main(String[] args) {
        String str1 = "Race";
        String str2 = "Care";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {

            char[] charArr1 = str1.toCharArray();
            char[] charArr2 = str2.toCharArray();

            Arrays.sort(charArr1);
            Arrays.sort(charArr2);

            boolean result = Arrays.equals(charArr1, charArr2);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }

        } else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }
    }
}
