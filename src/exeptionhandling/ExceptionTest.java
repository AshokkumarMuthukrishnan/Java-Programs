package exeptionhandling;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            int[] arr = {0, 3, 1, 2};
            try {
                int x = arr[0] / arr[1];
                System.out.println("The value of x is " + x);
            } catch (ArithmeticException e) {
                System.out.println("divide by zero");
            }
            arr[4] = 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
