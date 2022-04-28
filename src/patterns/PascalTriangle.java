package patterns;

public class PascalTriangle {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i ; j++) {
                System.out.print(" ");
            }
            int C = 1;
            for (int a = 1; a <= i; a++) {

                // The first value in a line is always 1
                System.out.print(C + " ");

                C = C * (i - a) / a;
            }

            // By now, we are done with one row so
            // a new line is required
            System.out.println();
        }
    }

}
