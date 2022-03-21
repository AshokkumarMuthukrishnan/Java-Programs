package files;

import java.io.FileWriter;
import java.io.IOException;

public class TextWriteOnExistingFile {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir") + "/src/test.txt";
        String text = "Java is awesome.";

        try {
            FileWriter file = new FileWriter(path, true);
            file.write(text);
            file.close();
        } catch (IOException e) {

        }

    }
}
