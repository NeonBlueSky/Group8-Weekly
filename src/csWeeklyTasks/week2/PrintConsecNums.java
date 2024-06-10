package csWeeklyTasks.week2;

import java.util.Scanner;

public class PrintConsecNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int x = in.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 5 == 0 && i % 3 == 0 && i % 2 == 0) { // checks if divisible by 5, 3 and 2
                System.out.println(i + " - CodilityTestCoders");
            } else if (i % 5 == 0 && i % 3 == 0) { // checks if divisible by 5 and 3
                System.out.println(i + " - TestCoders");
            } else if (i % 2 == 0 && i % 5 == 0) { // checks if divisible by 5 and 2
                System.out.println(i + " - CodilityCoders");
            } else if (i % 2 == 0 && i % 3 == 0) { // checks if divisible by 2 and 3
                System.out.println(i + " - CodilityTest");
            } else if (i % 5 == 0) {
                System.out.println(i + " - Coders");
            } else if (i % 3 == 0) {
                System.out.println(i + " - Test");
            } else if (i % 2 == 0) {
                System.out.println(i + " - Codility");
            } else {
                System.out.println(i);
            }
        }
    }

}
