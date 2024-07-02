package csWeeklyTasks.week4;

import java.util.Arrays;

public class SameLetters { /*Write a return method that check if a string is build out of the
same letters as another string.
Ex: same("abc", "cab"); -> true
same("abc", "abb"); -> false:*/

    public static void main(String[] args){

        String str1 = "abc";
        String str2 = "cab";
        String str3 = "abb";

        System.out.println("The strings " + str1 + " and " + str2+ " contain the same letters: " + sameLetters(str1,str2));
        System.out.println("The strings " + str1 + " and " + str3+ " contain the same letters: " + sameLetters(str1,str3));
    }


    public static boolean sameLetters(String str1, String str2){
        Boolean same = false;
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1,arr2)){
            same = true;
        }

        return same;
    }
}
