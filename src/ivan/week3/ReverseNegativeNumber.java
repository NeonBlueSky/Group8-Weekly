package ivan.week3;

public class ReverseNegativeNumber {


        public static int reverse(int num) {
            int reversedNum = 0;
            while (num != 0) {
                int lastDigit = num % 10;
                reversedNum = reversedNum * 10 + lastDigit;
                num /= 10;
            }

            // Check if the original number was negative
            if (num < 0) {
                reversedNum *= -1;
            }

            return reversedNum;
        }

        public static void main(String[] args) {
            int num = -35;
            int reversedNum = reverse(num);
            System.out.println("The reversed number is: " + reversedNum);
        }
    }



//Numbers -- Reverse Negative Number
//Write a return method that can reverse digits of a negative number and return it as int
//input: -35  output: -53
