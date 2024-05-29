package csWeeklyTasks.week1;

import java.util.Scanner;

public class Week1Methods {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println(EvenOdd(num1));
        System.out.println(DivideWithoutOperator(num1, num2));
        System.out.println(FINRA(num2));

    }

    public static String EvenOdd(int x) {
        //Write a method which can identify is the given number is even or odd
        String result = "";
        if (x % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }
        return result;
    }

    public static int DivideWithoutOperator(int x, int y) {
        //Write a method that can divide two numbers without using the division operator
        int count = 0;
        int i = x;

        while (i > 0) {
            if (i - y < 0) {
                break;
            }
            i = i - y;
            count++;
        }
        return count;
    }

    public static String FINRA(int x) {
        /*Write a method which prints out the numbers from 1 to 30 but for numbers which
        are a multiple of 3print "FIN" instead of the number and for numbers which are a
        multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
        both 3 and 5, print "FINRA" instead of the number.*/
        String result = "";
        if (x < 1 || x > 30) {
            result = "Please input a number from 1 to 30";
            return result;
        }

        if (x % 3 == 0 && x % 5 == 0) {
            result = "FINRA";
        } else if (x % 3 == 0) {
            result = "FIN";
        } else if (x % 5 == 0) {
            result = "RA";
        }

        return result;
    }


}
