package Week1.nazarii;
/* Write a method which can identifies given number is even or odd
Example:
        identify(5) -> "Odd"
        identify(6) -> "Even"
 */

public class PracticeTask {

        public static String EvenOrOdd(int number) {
            if (number % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }
        }

        public static void main(String[] args) {
            int number = 6;
            String result = EvenOrOdd(number);

            System.out.println("Number " + number + " is " + result);
        }
    }

