package basiclogicprograms;

public class CountDigitsOfNumber {
    public static void main(String[] args) {
        int number = 348765;
        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp = temp/10;
            count++;
        }
        System.out.println(count);
    }
}
