package files;

import java.io.File;

public class GetAllFilesFromADirectory {
    public static void main(String[] args) {
        File file = new File("/Users/ashok-7336/JavaPrograms/Directory");
        String[] fileList = file.list();

        for (String str : fileList) {
            System.out.println(str);
        }
    }
}
