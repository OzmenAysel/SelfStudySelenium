package Interview_questions.Java;

import java.util.Arrays;
import java.util.Collections;

public class String_FindTheUnique {
    /*
	Write a return  method that can find the unique characters from the String
	Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
	 */
    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        System.out.println(unique1(str));
        System.out.println(unique2(str));
        System.out.println(unique3(str));
        System.out.println(unique4(str));
    }

    //solution 1:
    public static String unique1(String str) {

        String[] arr = str.split("");
        String unique = "";

        for (int j = 0; j < str.length(); j++) {

            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (arr[i].contains(arr[j])) {
                    count++;
                }
            }
            if (count == 1) {
                unique += arr[j];
            }
        }
        return unique;
    }

    //solution 2:
    public static String unique2(String str) { // hakan abi

        char[] arr = str.toCharArray();
        String unique = "";

        for (int j = 0; j < str.length(); j++) {

            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (arr[i] == arr[j])
                    count++;
            }
                if (count == 1)
                    unique += arr[j];

        }
            return unique;
        }


    //solution 3:
    public static String unique3(String str) {  // hakan abi
        String unique = "";
        while (str.length() > 0) {
            if (str.substring(1).contains(str.substring(0, 1))) {
                str = str.replaceAll(str.substring(0, 1), "");
            } else {
                unique += str.substring(0, 1);
                str = str.substring(1);
            }
        }
        return unique;
    }

    //solution 4:
    public static String unique4(String str){
        String unique = "";
        for(String each: str.split(""))
            unique+=( (Collections.frequency(Arrays.asList(str.split("")), each))==1) ? each :"";
      return unique;

    }
}
