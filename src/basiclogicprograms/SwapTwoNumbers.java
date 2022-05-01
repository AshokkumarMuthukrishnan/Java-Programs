package basiclogicprograms;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 130, b = 250;

         a = a + b;
         b = a - b;
         a = a - b;

        System.out.println(a + "," + b);
    }
}
