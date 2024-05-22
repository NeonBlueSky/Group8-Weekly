package Week1;

import java.util.Scanner;
public class Week1 {
    public static void main(String[] args) {
        System.out.println("Week 1 Odd or Even Project Test");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        scanner.close();
    }
}
