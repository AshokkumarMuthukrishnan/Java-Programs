package collections;

import java.util.Stack;

public class ImplementStackClass {
    public static void main(String[] args) {
        Stack<String> languages = new Stack<>();
        languages.push("HTML");
        languages.push("CSS");
        languages.push("Js");
        languages.push("PHP");
        languages.push("Java");
        languages.push("Python");

        languages.pop();

        System.out.println(languages);
    }
}
