package basiclogicprograms;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int num = 20;
        System.out.println(sumOfNaturalNumbers(num));

        int no = 564;
        System.out.println(sumOfDigits(no));
    }

    public static int sumOfNaturalNumbers(int num) {
        if (num != 0)
            return num + sumOfNaturalNumbers(num - 1);
        else
            return num;
    }

    public static int sumOfDigits(int no) {
        if (no == 0) {
            return 0;
        }
        return (no%10 + sumOfDigits(no/10));
    }
}
