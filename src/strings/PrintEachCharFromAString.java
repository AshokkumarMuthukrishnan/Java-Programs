package strings;

public class PrintEachCharFromAString {
    public static void main(String[] args) {
        String str = "Java is a awesome language";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + ", ");
        }

        System.out.println(str.contains("awesoem"));
    }
}
