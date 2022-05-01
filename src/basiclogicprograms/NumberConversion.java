package basiclogicprograms;

public class NumberConversion {
    static void binaryToDecimal () {
        System.out.println("Binary to Decimal no");
        int num = 11011, decimal = 0;
        int remainder, exp = 0;
        while (num != 0) {
            remainder = num%10;
            decimal += remainder * Math.pow(2, exp);
            num/=10;
            exp++;
        }
        System.out.println(decimal);
    }

    static void binaryToOctal() {
        System.out.println("Binary to Octal no");
        int num = 100100, decimal = 0;
        int remainder, exp = 0;
        while (num != 0) {
            remainder = num%10;
            decimal += remainder * Math.pow(2, exp);
            num/=10;
            exp++;
        }
        String octal = Integer.toOctalString(decimal);
        int octalNumber = Integer.parseInt(octal);
        System.out.println(octalNumber);
    }

    static void octalToDecimal() {
        System.out.println("Octal to Decimal no");
        int num = 167, decimal = 0;
        int remainder, exp = 0;
        while (num != 0) {
            remainder = num%10;
            decimal += remainder * Math.pow(8, exp);
            num/=10;
            exp++;
        }
        System.out.println(decimal);
    }

    static void decimalToOctal() {
        System.out.println("Decimal to Octal no");
        int num = 33, octalNo = 0, remainder = 0, i = 1;
        while (num != 0) {
            remainder = num % 8;
            octalNo = octalNo + remainder*i;
            num/=8;
            i*=10;
        }
        System.out.println(octalNo);
    }

    static void hexadecimalToDecimal() {
        System.out.println("Hexadecimal to Decimal");
        String digits = "0123456789ABCDEF";
        String hexVal = "1AB";
        hexVal = hexVal.toUpperCase();
        int val = 0;
        for (int i = 0; i < hexVal.length(); i++) {
            char c = hexVal.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        System.out.println(val);
    }

    static void decimalToBinary () {
        System.out.println("Decimal to Binary");
        int num = 7, remainder = 0;
        String binaryNo = "";
        while (num != 0) {
            remainder = num % 2;
            binaryNo = remainder + binaryNo;
            num/=2;
        }
        System.out.println(binaryNo);
    }

    public static void main(String[] args) {
        binaryToDecimal();
        System.out.println();
        binaryToOctal();
        System.out.println();
        octalToDecimal();
        System.out.println();
        decimalToOctal();
        System.out.println();
        hexadecimalToDecimal();
        System.out.println();
        decimalToBinary();
    }
}
