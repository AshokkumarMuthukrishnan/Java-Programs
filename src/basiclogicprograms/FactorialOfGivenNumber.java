package basiclogicprograms;

public class FactorialOfGivenNumber {
    public static void main(String[] args) {
        int num = 5, factorialOfNum = 1;
        for (int i = 1; i <= num; i++) {
            factorialOfNum *= i;
        }
        System.out.println("Factorial of %d" + factorialOfNum);
    }
}
