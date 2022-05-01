package basiclogicprograms;

public class ProductOfTwoNoUsingRecursion {
    public static void main(String[] args) {
        int num1 = 7, num2 = 8;
        System.out.println(productOfTwoNumbers(num1, num2));
    }

    public static int productOfTwoNumbers(int num1, int num2) {
        if (num1 < num2)
            return productOfTwoNumbers(num2, num1);
        else if (num2 != 0) {
            return (num1 + productOfTwoNumbers(num1, num2 -1));
        }
        else
            return 0;
    }
}
