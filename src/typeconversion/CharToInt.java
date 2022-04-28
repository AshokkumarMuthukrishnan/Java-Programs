package typeconversion;

public class CharToInt {
    public static void main(String[] args) {
        char a = 'a';
        int ashok = a;
        System.out.println(ashok);

        int num = '5';
        char val = (char) num;
        System.out.println(val);

        String number = "12456";
        long value = Long.parseLong(number);
        System.out.println(value);

    }
}
