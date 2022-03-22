package basiclogicprograms;

public class CalculatePowerOfNumber {
    public static void main(String[] args) {
        int base = 3, exponent = 5;
        int result = 1;
        while (exponent != 0) {
            result *= base;
            --exponent;
        }
        System.out.println("Answer = " + result);
    }
}
