package csWeeklyTasks.week4;

public class RemoveDupes {/*String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC*/

    public static void main(String[] args){

        String before = "AAABBBCCC";
        String after = RemoveDuplicate(before);
        System.out.println(after);
    }

    public static String RemoveDuplicate(String in){
        String result = "";
        for (int i = 0; i<in.length(); i++){
            if (!result.contains(""+in.charAt(i))){
                result+=""+in.charAt(i);
            }
        }
        return result;
    }

}
