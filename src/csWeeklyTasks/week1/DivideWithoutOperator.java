package csWeeklyTasks.week1;

import java.util.Scanner;

public class DivideWithoutOperator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int x = in.nextInt();
        int y = in.nextInt();

        int count = 0;
        int i = x;

        while (i > 0) {
            if (i - y < 0) {
                break;
            }
            i = i - y;
            count++;
        }

        System.out.println("The number " +x+ " can be divided by "+y+", "+count+" times.");
    }

}
