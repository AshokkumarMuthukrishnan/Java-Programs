package basiclogicprograms;

public class SumOfAllDigits {
    public static void main(String[] args) {
        int number = 565, result = 0;
        while(number != 0) {
            result += number % 10;
            number/=10;
        }
        System.out.println(result);
    }
}
