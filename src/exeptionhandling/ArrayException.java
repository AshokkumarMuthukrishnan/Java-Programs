package exeptionhandling;

import java.io.IOException;

public class ArrayException {
    public static void main(String[] args) throws IOException {
        try {
//            String s = 9;
//            s.charAt(3);
            int[] a = new int[7];
            a[7] = 100;
            System.out.println("First print statement in try block");
        } catch (ArithmeticException e) {
            System.out.println("Warning: ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Warning: ArrayIndexOutOfBounds" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Warning: Other exception");
        }
        System.out.println("Out of try-catch block");
    }
}
