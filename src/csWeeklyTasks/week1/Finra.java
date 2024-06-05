package csWeeklyTasks.week1;

import java.util.Scanner;

public class Finra {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please input a number from 1 to 30");
        int x = in.nextInt();
        String result = "";

        if (x % 3 == 0 && x % 5 == 0) {
            result = "FINRA";
        } else if (x % 3 == 0) {
            result = "FIN";
        } else if (x % 5 == 0) {
            result = "RA";
        }

        System.out.println(result);


    }

}
