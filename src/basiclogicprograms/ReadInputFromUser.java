package basiclogicprograms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadInputFromUser {

    public static void main(String[] args) throws IOException {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        num = scanner.nextInt();
        System.out.println("Entered integer is: " + num);

        String str = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        str = reader.readLine();
        System.out.println(str);
    }
}
