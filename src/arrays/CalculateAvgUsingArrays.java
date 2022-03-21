package arrays;

public class CalculateAvgUsingArrays {

    public static void main(String[] args) {
        int[] numbers = {4, 48, 7, 82, 38, 26, 27, 19, 36, 25, 10};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Avg is " + sum / numbers.length);
    }
}
