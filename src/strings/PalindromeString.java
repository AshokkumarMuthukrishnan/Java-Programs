package strings;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "Madam";
        String temp = "";
        str = str.toLowerCase();

        for (int i = str.length() - 1; i >= 0; i--) {
            temp = temp + str.charAt(i);
        }

        if (str.equals(temp)) {
            System.out.println(str+" is a palindrome");
        } else {
            System.out.println(str+" is not a palindrome");
        }


    }
}
