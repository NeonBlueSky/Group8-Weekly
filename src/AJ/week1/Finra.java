package AJ.week1;

public class Finra {

    public static void main(String[] args) {

        System.out.println(numToFinra(3));
    }

    public static String numToFinra(int num) {

        if (num % 5 == 0 && num % 3 == 0) {
            return "FINRA";
        }else if (num % 3 == 0) {
            return "FIN";
        }else if (num % 5 == 0){
            return "RA";
        }else return String.valueOf(num);



    }



}
