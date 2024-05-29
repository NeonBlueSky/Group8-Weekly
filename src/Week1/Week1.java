package Week1;

public class OddorEven {
    public static void main(String[] args) {
        int number = 25;
        identifyNumber(number);
    }

    public static void identifyNumber(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
}
