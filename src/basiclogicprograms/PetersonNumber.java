package basiclogicprograms;

public class PetersonNumber {
    public static int getFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        int number = 145;
        int result = 0;
        int temp = 0;

        while (number != 0) {
            temp = number%10;
            result += getFactorial(temp);
            number/=10;
            temp = 0;
        }

        System.out.println(result);
    }
}
