package basiclogicprograms;

public class CountDigitsOfNumber {
    public static void main(String[] args) {
        int number = 348765;
        int count = 0;
        while (number != 0) {
            number/=10;
            count++;
        }
        System.out.println(count);
    }
}
