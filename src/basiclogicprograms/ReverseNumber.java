package basiclogicprograms;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 876384, reversed = 0;
        System.out.println("Original Number: " + num);

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("The reversed number of a given number is " + reversed);
    }
}
