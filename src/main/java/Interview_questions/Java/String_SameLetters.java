package Interview_questions.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class String_SameLetters {
    	/*Write a return method that check if a string is build out of the same letters as another string.
			Ex:  SameLetter("abc",  "cab"); -> true
			SameLetter("abc",  "abb"); -> false:*/

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cab";
        System.out.println(SameLetter(str1, str2));
        System.out.println(SameLetter2(str1, str2));
    }
    //	Solution 1:
    public static boolean SameLetter(String a, String b){
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1 ="";
        String a2 ="";
        for(char each: ch1){
            a1+=each;
        }
        for(char each: ch2){
            a2+=each;
        }
        return a1.equals(a2);
    }

    //	Solution 2:
    public static boolean SameLetter2(String a, String b){

        a = new TreeSet<String>(Arrays.asList(a.split(""))).toString();
        b = new TreeSet<String>(Arrays.asList(b.split(""))).toString();

        return a.equals(b);
    }

}
