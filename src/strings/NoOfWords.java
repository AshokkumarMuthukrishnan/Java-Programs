package strings;

public class NoOfWords {
    public static void main(String[] args) {
        String str = "One two three four five  ";
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && (str.charAt(i + 1) != ' ') ){
                count++;
            }
        }
        System.out.println("No of words : " + count);
    }
}
