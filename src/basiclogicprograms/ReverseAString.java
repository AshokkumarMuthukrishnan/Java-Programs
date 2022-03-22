package basiclogicprograms;

public class ReverseAString {
    public static void main(String[] args) {

        String sampleText = "Java is Awesome!";
        for (int i = (sampleText.length() - 1); i >= 0; i--) {
            System.out.print(sampleText.charAt(i));
        }
    }
}
