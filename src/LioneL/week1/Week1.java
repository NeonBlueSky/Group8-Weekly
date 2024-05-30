package LioneL.week1;

public class Week1 {
    public static void main(String[] args) {
        isOdd(100);
        isEven(100);
    }
    public static void isOdd(int number){
        if (number %2 == 1){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

    public static void isEven(int number){
        if (number % 2 == 0){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }

}

