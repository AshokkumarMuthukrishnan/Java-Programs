package basiclogicprograms;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        int num = 371, remainder, result = 0;
        int originalNo = num;

        while(num != 0) {
            remainder = num%10;
            result += Math.pow(remainder, 3);
            num /= 10;
        }

        if (result == originalNo)
            System.out.println("Given number is Armstrong No");
        else
            System.out.println("Given number is not a Armstrong No");

    }
}
