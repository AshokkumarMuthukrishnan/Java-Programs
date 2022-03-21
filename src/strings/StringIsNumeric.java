package strings;

public class StringIsNumeric {
    public static void main(String[] args) {
        String number = "1254";
        boolean isNumeric = true;

        try {
            int no = Integer.parseInt(number);
        } catch (NumberFormatException e) {
            isNumeric = false;
        }

        System.out.println(isNumeric ? "String is a number" : "String is not a number");
    }
}
