package arrays;

public class NormalAndTraceOfAMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{8, 9, 11},
                {0, 1, 15},
                {4, 10, -7}};
        int normal = 0, trace = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                normal += matrix[i][j] * matrix[i][j];
            }
        }

        trace = matrix[0][0] + matrix[1][1] +matrix[2][2];

        System.out.println((int)Math.sqrt(normal) + ", " + trace);
    }
}
