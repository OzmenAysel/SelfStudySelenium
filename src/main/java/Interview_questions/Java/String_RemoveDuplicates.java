package Interview_questions.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class String_RemoveDuplicates {
    /*
		 *String -- Remove Duplicates
	Write a return method that can remove the duplicated values from String
	Ex:  removeDup("AAABBBCCC")  ==> ABC
		*/

    public static void main(String[] args) {
        String str="AAABBBCCC";
       System.out.println(removeDup1(str));
    //   System.out.println(removeDup2(str));
    }

    //Solution 1:
    public static String removeDup1(String str){
          String nonDup ="";
        for(int i=0; i<str.length(); i++) {
            if(!nonDup.contains(str.substring(i,i+1))){
                nonDup+=str.substring(i,i+1);
            }
        }

//        while(str.length()>0) {
//            if(!nonDup.contains(str.substring(0,1))){
//                nonDup+=str.substring(0,1);
//                str = str.replaceAll(str.substring(0,1),"");
//            }
//        }
        return nonDup;

    }

    //Solution 2:
    public static String removeDup2(String str){   // I can use LinkedHashSet because I do not need order
        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
        str = str.replace(", ","").replace("[","").replace("]","");
        return str;
    }

}
