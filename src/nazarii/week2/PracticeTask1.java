package nazarii.week2;

public class PracticeTask1 {

    public static void main(String[] args) {

        /*
           - Numbers -- Swap Numbers -
        Swap two variable values without using a third variable
         */

        int a = 5;
        int b = 10;

        //Swap values:

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap: a = " + a + ", b = " + b);



    }

}
