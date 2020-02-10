package Interview_questions.Java;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class String_FindTheUnique {
    /*
	Write a return  method that can find the unique characters from the String
	Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
	 */
    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        System.out.println(unique(str));
        System.out.println(unique2(str));
    }

    //solution 1:
    public static String unique(String str){
        String[] arr = str.split("");
        String unique = "";
        for(int j=0; j<str.length(); j++){
            int num =0;
            for(int i=0; i<str.length(); i++) {
                if (arr[i].contains(arr[j])) {
                    num++;
            }
        }
            if(num==1){
                unique +=arr[j];
            }
        }
        return unique;
    }

    //solution 2:
    public static String unique2(String str){
        String result = "";
        for(String each: str.split("")){
            result+=( (Collections.frequency(Arrays.asList(str.split("")), each))==1) ? each :"";
        }
      return result;

    }
}
