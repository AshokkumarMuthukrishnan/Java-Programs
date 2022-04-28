package arrays;

public class TwoMatricesAreEqual {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        boolean flag = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] != b[i][j]) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("Matrices are equal");
        } else {
            System.out.println("Matrices are not equal");
        }

    }
}
