package PeldaHanar.week1;

public class OddOrEven {

    public static void main(String[] args) {
        int number = 19;
        identifyNumber(number);

    }
    public static void identifyNumber(int number){
        if (number % 2 == 0) {
            System.out.println(number + "is an odd number.");
        } else {
            System.out.println(number + "is an even number.");
        }
    }
}
