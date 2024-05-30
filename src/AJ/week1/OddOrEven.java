package AJ.week1;

public class OddOrEven {

    public static void main(String[] args) {

        System.out.println(identify(5));
        System.out.println(identify(6));

    }

    public static String identify(int n) {

        if(n % 2 == 0) {
            return "Even";
        }else{
            return "Odd";
        }

    }



}
