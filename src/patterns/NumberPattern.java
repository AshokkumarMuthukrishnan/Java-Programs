package patterns;

public class NumberPattern {
    public static void main(String[] args) {
        int line = 10;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");

        for (int i = 5; i >= 0; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
