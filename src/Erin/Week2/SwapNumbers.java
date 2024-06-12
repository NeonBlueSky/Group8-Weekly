package Erin.Week2;

public class SwapNumbers {

    public static void main(String[] args) {

        int a = 56;
        int b = 43;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swapping without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}

/*
Numbers -- Swap Numbers
Swap two variable values without using a third variable*/
