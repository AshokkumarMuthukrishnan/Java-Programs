package basiclogicprograms;

public class NumberIsPrimeOrNot {

    public static void main(String[] args) {
        checkPrime(20);
        checkPrime(17);
        checkPrime(2);
        checkPrime(1);
        checkPrime(72);
        checkPrime(47);
    }

    static void checkPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " is a prime number!");
        } else {
            System.out.println(n + " isn't a prime number!");
        }
    }
}
