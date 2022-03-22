package basiclogicprograms;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "Java is Awesome Programming Language!";
        char ch = 'a';
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of given char is " + frequency);
    }
}
