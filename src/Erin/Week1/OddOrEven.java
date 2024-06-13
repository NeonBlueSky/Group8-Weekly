package Erin.Week1;

public class OddOrEven {

    public static void main(String[] args) {

    int a = 204;
    String number = evenOrOdd(a);
    System.out.println(number);

}

public static String evenOrOdd(int number){
    if (number % 2 == 0){
        return "Even";
    }else{
        return "Odd";
    }

}
}
