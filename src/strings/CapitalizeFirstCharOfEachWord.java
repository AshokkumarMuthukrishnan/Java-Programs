package strings;

public class CapitalizeFirstCharOfEachWord {
    public static void main(String[] args) {
        String str = "java is awesome programming language!";
        char[] charArray = str.toCharArray();
        boolean foundSpace = true;

        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
            if (Character.isLetter(charArray[i])) {
                if (foundSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }

        str = String.valueOf(charArray);
        System.out.println(str);
    }
}
