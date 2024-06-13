package ivan.week2;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        //Swap two variable values without using a third variable

        int a = 10;
        int b = 5;

        a = a + b;  //15
        b = a - b;  //10
        a = a - b;  //5

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}

