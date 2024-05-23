package Week1;

import java.util.Scanner;
public class Week1 {
    public static void main(String[] args) {

        System.out.println("Week 1 Odd or Even Project Test");

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        System.out.print("Enter a number: ");

        while (!validInput) {

            System.out.print("Enter a number: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        scanner.close();
    }
}