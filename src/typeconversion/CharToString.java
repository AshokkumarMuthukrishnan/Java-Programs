package typeconversion;

import java.util.Arrays;

public class CharToString {
    public static void main(String[] args) {
        // char to string
        char c = 'a';
        String str = Character.toString(c);
        System.out.println("The string is " + str);

        // char array to string
        char[] a = {'a', 's', 'h', 'o', 'k'};
        String name = new String(a);
        System.out.println(name);

        // string to char array
        String myName = "ashok";
        char[] chars = myName.toCharArray();
        System.out.println(Arrays.toString(chars));

    }
}
