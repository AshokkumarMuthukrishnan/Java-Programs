package arrays;

public class DeterminantOfAMatrix {
    public static void main(String[] args) {
        int[][] a = { { 4, 3 }, { 2, 3 } };
        int determinant = 0;

        determinant = ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));

        System.out.println(determinant);

    }
}
