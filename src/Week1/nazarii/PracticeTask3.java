package Week1.nazarii;

/*
Write a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3print "FIN" instead of the number and for numbers which are a
multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "FINRA" instead of the number.
 */
public class PracticeTask3 {

    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {

            boolean divBy3 = i % 3 == 0;
            boolean divBy5 = i % 5 == 0;
            String result = "";

            if (divBy3){
                System.out.println("FIN");
            } else if (divBy5){
                System.out.println("RA");
            } else if (divBy3 && divBy5) {
                System.out.println("FINRA");
            } else {
                result = " ";
            }
            System.out.println(result + " ");

        }

    }
}