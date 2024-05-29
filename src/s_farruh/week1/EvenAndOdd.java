package s_farruh.week1;

public class EvenAndOdd {
    public static String identify(int number) {

        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static void main(String[] args) {
        System.out.println(identify(5));
        System.out.println(identify(6));


    }
}
