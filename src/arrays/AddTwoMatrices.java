package arrays;

public class AddTwoMatrices {
    public static void main(String[] args) {
        int rows = 3, columns = 3;
        int[][] first = {{2, 5, 6}, {2, 5, 9}, {6, 8, 7}};
        int[][] second = {{3, 5, 4}, {2, 4, 5}, {8, 10, 12}};
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }

        System.out.println("Sum of two matrices is: ");
        for (int[] i : result) {
            for (int j : i) {
                System.out.print(j + "    ");
            }
            System.out.println();
        }

    }
}
