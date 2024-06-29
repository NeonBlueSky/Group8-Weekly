package ivan.week3;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

//Numbers -- PrimeNumber
//Write a method that can check if a number is prime or not

public class PrimeNumber {

    public static void main(String[] args) {
        //Making scanner to ask user to input a number
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scan.nextInt();
        scan.close();

        if(isPrime(number)){  // calling isPrime method to check for condition
            System.out.println(number + " is a Prime number");
        } else{
            System.out.println(number + " is not a Prime number");
        }
    }

    public static boolean isPrime(int number) {

        for (int i = 2; i < number; i++) {
            if(number % i == 0){
                return false;
            }
        }

        return true;
    }


}