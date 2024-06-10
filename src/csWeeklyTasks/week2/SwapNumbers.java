package csWeeklyTasks.week2;

public class SwapNumbers {
    //swap 2 variables without using a third variable

    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        System.out.println("x is " +x+" y is "+y);

        x = y + x; //adds the two variables together and assigns to int x -> 5 + 7 = 12

        y = x - y; //subtracts from the sum of the two variables and assigns to int y -> 12 - 7 = 5

        x = x - y; // subtracts the value of int y from int x, x -> 12 - 5 = 7

        System.out.println("x is " +x+" y is "+y);

    }

}
