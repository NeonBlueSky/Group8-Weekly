package Week3;

public class PrimeNumber {

    public static boolean isPrime(int n) {
        // Check if n is less than or equal to 1
        if (n <= 1) {
            return false;
        }
        // Check if n is less than or equal to 3
        if (n <= 3) {
            return true;
        }
        // Check if n is divisible by 2 or 3
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        // Check from 5 to sqrt(n) with step of 6
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(11));  // true
        System.out.println(isPrime(14));  // false
    }
}
