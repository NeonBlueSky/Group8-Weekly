package csWeeklyTasks.week3;

import java.util.Scanner;

public class ReverseNegativeNum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter a negative number");

        int x = in.nextInt();
        System.out.println("given int: " + x);

        x = ReverseNum(x);
        System.out.println("result: " + x);
    }

    public static int ReverseNum(int x) {
        String result = "" + x;//enters the given integer into a string
        char[] n = result.toCharArray();//split the string into char array

        result = "-";
        for (int i = n.length - 1; i > 0; i--) {    //loop iterates backwards through char array and adds the elements back into the string
            result += n[i]+"";
        }


        return Integer.parseInt(result);
    }


}
