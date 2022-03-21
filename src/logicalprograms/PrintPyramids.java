package logicalprograms;

public class PrintPyramids {
    public static void halfPyramid() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(" ");
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
        }
    }

    public static void halfPyramidUsingNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(" ");
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
        }
    }

    public static void invertedHalfPyramid() {
        for (int i = 5; i >= 0; i--) {
            System.out.println(" ");
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
        }
    }

    public static void main(String[] args) {
        PrintPyramids.halfPyramid();
        System.out.println();
        PrintPyramids.invertedHalfPyramid();
        System.out.println();
        PrintPyramids.halfPyramidUsingNumbers();
    }
}
