package Zac_week1;

public class DivisionWithoutOperator {
    public static void main(String[] args) {
        int dividend = 25;
        int divisor = 4;

        try {
            int quotient = divide(dividend, divisor);
            System.out.println("The quotient is: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        int quotient = 0;
        int sign = 1;

        if (dividend < 0) {
            dividend = -dividend;
            sign = -sign;
        }

        if (divisor < 0) {
            divisor = -divisor;
            sign = -sign;
        }

        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        return quotient * sign;
    }
}
