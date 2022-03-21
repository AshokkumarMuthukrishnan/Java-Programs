package files;

import java.io.File;

public class CreateDirectory {
    public static void main(String[] args) {
        File file = new File("Directory");
        boolean value = file.mkdir();
        if (value) {
            System.out.println("The new directory is created.");
        } else {
            System.out.println("The directory already exists.");
        }
    }
}
