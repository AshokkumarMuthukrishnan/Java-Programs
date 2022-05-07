package basiclogicprograms;

public class GCDUsingEuclidAlgo {
    public static void main(String[] args) {
        System.out.println(euclid(48, 24));
    }

    public static int euclid(int x, int y) {
        if (x == 0 || y == 0) {
            return 1;
        }

        if (x < y) {
            int temp = x;
            x = y;
            y = temp;
        }

        if (x % y == 0) {
            return y;
        } else {
            return euclid(y, x % y);
        }
    }
}
