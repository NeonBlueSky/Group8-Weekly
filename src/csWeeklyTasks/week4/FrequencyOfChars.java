package csWeeklyTasks.week4;

import jdk.jfr.Frequency;

import java.util.Arrays;

public class FrequencyOfChars { /*String -- Frequency of Characters
    Write a return method that can find the frequency of
            characters
    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2 */

    public static void main(String[] args){

        String before = "AAABBCDD";
        String after = Frequency(before);
        System.out.println(after);
    }

    public static String Frequency(String in){

        char[] arr = in.toCharArray();
        String result = "";

        for(int i = 0; i< arr.length; i++){
            int count = 0;
            if(result.contains(""+arr[i])){ // checks if the character at the given index has already been added to the result// string
                continue;
            }

            for(int x = i; x<arr.length;x++){ //counts the amount of times the character at arr[i] is in the char array
                if (arr[x]==arr[i]) {
                    count++;
                }
            }

            result+= "" + arr[i]+count;
        }

        return result;
    }
}
