package csWeeklyTasks.week3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        boolean isPrime = false;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int n = in.nextInt();
        in.close();

        for (int i = n - 1; i > 1; i--) {   // loops through every number besides int n and 1
            if (n % i == 0) {               // if the number can be divided by anything other than 1 and itself, it is not a prime number
                isPrime = false;
                break;
            } else {
                isPrime = true;
            }
        }


        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}
