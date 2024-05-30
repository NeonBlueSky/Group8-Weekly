package AJ.week1;

public class DivisionWithoutOperator {

    public static void main(String[] args) {

        System.out.println("Quotient = " + divNoOp(12, 2));

    }

    public static int divNoOp(int dividend, int divisor) {
        int result = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            result++;
        }return result;
        }
    }









