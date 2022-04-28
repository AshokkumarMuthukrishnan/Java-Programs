package arrays;

public class SumOfDiagonals {
    public static void main(String[] args) {
        int[][] b = { { 8, 2, 13, 4 },
                    { 9, 16, 17, 8 },
                    { 1, 22, 3, 14 },
                    { 15, 6, 17, 8 } };
        int principalDiagonalResult = 0, secondaryDiagonalResult = 0;
        for (int i = 0; i < b.length; i++) {
            principalDiagonalResult += b[i][i];
            secondaryDiagonalResult += b[i][(b[i].length - (i+1))];
        }

        System.out.println(principalDiagonalResult + ", " + secondaryDiagonalResult);
    }
}
