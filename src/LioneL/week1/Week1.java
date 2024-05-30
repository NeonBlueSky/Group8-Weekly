package LioneL.week1;

import static LioneL.week1.Week1.OddOrEven.isOdd;

public class Week1 {
    public static void main(String[] args) {
        System.out.println("Week 1");
        System.out.println("Task 1 : Create a branch");
        System.out.println("Task 2 : Write a code that separates odd numbers from even numbers.");
        System.out.println(isOdd(5));
        System.out.println(isOdd(6));

    }
    public class OddOrEven{
        public static boolean isOdd(int n){
            if (n % 2 == 1){
                return true;
            }else {
                return false;
            }
        }
    }
}
