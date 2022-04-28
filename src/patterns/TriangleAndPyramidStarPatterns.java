package patterns;

public class TriangleAndPyramidStarPatterns {
    public static void main(String[] args) {
        System.out.println("Right triangle");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        System.out.println("Left triangle");
        for (int i = 1; i <= 5; i++) {
            for (int j = 2 * (5 - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println(" ");

        for (int i = 1; i <= 5; i++) {
            for (int j = 2 * (5 - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++) {
                System.out.print(" " + i);
            }
            System.out.println(" ");
        }

        System.out.println("\n\n");

        System.out.println("Pyramid pattern");
        int rows = 5, num;

        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= rows - i ; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }


        System.out.println("\n");
        num = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println(" ");
        }

        System.out.println("\n");
        System.out.println("Diamond pattern");
        for (int i = 1; i <= (rows/2 + 1); i++) {
            for (int k = 1; k <= (rows/2 + 1) - i ; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println(" ");
        }
        int space = 1;
        int stars = rows - 2;
        for (int i = rows-1; i >= 1; i--) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            space++;
            for (int k = 1; k <= stars; k++) {
                System.out.print("* ");
            }
            stars = stars - 2;
            System.out.println("");
        }

        System.out.println("Square pattern");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        System.out.println("\n");
        System.out.println("Left arrow pattern");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
        for (int i = 4-1; i >= 1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            for (int j = 2* (5-i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        System.out.println("\n");
        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= rows - i ; k++) {
                System.out.print("  ");
            }
            int b = i;
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print(b++ + " ");
            }
            System.out.println(" ");
        }

        System.out.println("\n");
        System.out.println("Reverse pyramid star pattern");
        int pyRows = 5;
        for (int i = pyRows; i >= 1 ; i--) {
            for (int j = i; j < pyRows ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=(2 * i - 1) ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Mirror star pattern");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= rows ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= rows ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}
