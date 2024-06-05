package csWeeklyTasks.week1;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = in.nextInt();


        if (x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }


}
