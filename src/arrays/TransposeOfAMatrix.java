package arrays;

import java.util.Arrays;

public class TransposeOfAMatrix {
    public static void main(String[] args) {
        int rows = 2, columns = 3;
        int[][] matrix = {{1, 5, 4}, {7, 8, 6}};
        System.out.println(Arrays.deepToString(matrix));
        int[][] transposeMatrix = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        display(transposeMatrix);
    }

    public static void display(int[][] matrix) {
        System.out.println("The matrix is: ");
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
