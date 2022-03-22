package basiclogicprograms;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int num = 20;
        System.out.println(sumOfNaturalNumbers(num));
    }

    public static int sumOfNaturalNumbers(int num) {
        if (num != 0)
            return num + sumOfNaturalNumbers(num - 1);
        else
            return num;
    }
}
