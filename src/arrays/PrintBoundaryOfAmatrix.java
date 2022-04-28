package arrays;

public class PrintBoundaryOfAmatrix {
    public static void main(String[] args) {
        int mat[][] = new int[][] { { 1, 2, 3 },
                                    { 4, 5, 6 },
                                    { 7, 8, 9 } };

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == 0 || i == mat.length -1 || j == 0 || j == mat[i].length -1) {
                    System.out.print(mat[i][j]);
                } else
                    System.out.print(" ");
            }
            System.out.println();

        }
    }
}
