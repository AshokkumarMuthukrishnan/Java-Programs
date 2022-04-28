package patterns;

public class PyramidNumberPattern {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < 2*(rows-i); j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(" " + k);//create left half
            }
            for (int l=2; l<= i; l++){
                System.out.print(" "+l);    //create right half
            }
            System.out.println();
        }
    }
}
