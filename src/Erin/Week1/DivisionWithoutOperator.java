package Erin.Week1;

public class DivisionWithoutOperator {
    public static void main(String[] args) {


        double a = 12;
        double b = 6;
        double c = divide(a, b);
        System.out.println(c);
    }

    public static double divide(double first, double second){
        double answer = first * Math.pow(second, -1);
        return answer;

    }





}
