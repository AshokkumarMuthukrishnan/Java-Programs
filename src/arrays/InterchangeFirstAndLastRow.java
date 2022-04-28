package arrays;

public class InterchangeFirstAndLastRow {
    public static void main(String[] args) {
        int mat[][] =   { { 2, 3, 4, 5 },
                        { 8, 9, 6, 15 },
                        { 13, 22, 11, 18 },
                        { 19, 1, 2, 0 } };

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == 0) {
                    int temp = mat[mat.length-1][j];
                    mat[mat.length-1][j] = mat[i][j];
                    mat[i][j] = temp;
                }
                break;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(" ");
        }


    }
}
