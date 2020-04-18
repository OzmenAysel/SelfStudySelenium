package Interview_questions.JavaQuestions;

import java.util.Arrays;
import java.util.TreeSet;

public class String_SameLetters {
    	/*Write a return method that check if a string is build out of the same letters as another string.
			Ex:  SameLetter("abc",  "cab"); -> true
			SameLetter("abc",  "abb"); -> false:*/

    public static void main(String[] args) {
        String str1 = "ababc";
        String str2 = "cab";
        System.out.println(SameLetter(str1, str2));
        System.out.println(SameLetter2(str1, str2));
        System.out.println(SameLetter3(str1, str2));
    }
    //	Solution 1:
    public static boolean SameLetter(String a, String b){
        char[] stringA = a.toCharArray();
        char[] stringB = b.toCharArray();
        Arrays.sort(stringA);
        Arrays.sort(stringB);
        return Arrays.equals(stringA,stringB);
                    // Bu satir yazilirsa asagidakilere gerek kalmaz harf sayisi esit ise calisir, farkli ise hata verir

//        String a1 ="";
//        String b1 ="";
//        for(char each: stringA) {
//            if (!a1.contains("" + each))
//                a1 += each;
//        }
//        for(char each: stringB){
//            if(!b1.contains(""+each))
//                 b1+=each;
//        }
//        return a1.equals(b1);
    }

    //	Solution 2:
    public static boolean SameLetter2(String str1, String str2){

        if(str1.length() == str2.length()){
            while (str1.length() > 0 ){
                if(str2.contains(str1.substring(0,1))){
                    str2 = str2.replace(str1.substring(0,1), "");
                    str1 = str1.substring(1);
                }
            }
            return str1.length() == str2.length();
        }else{
            return false;
        }
    }

    //	Solution 3: TreeSet
    public static boolean SameLetter3(String a, String b){

        a = new TreeSet<String>(Arrays.asList(a.split(""))).toString();
        b = new TreeSet<String>(Arrays.asList(b.split(""))).toString();

        return a.equals(b);
    }

}
