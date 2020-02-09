package Interview_questions.Java;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

public class String_FrequencyOfCharacters {
    /* Write a return method that can find the frequency of characters
			Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2 */

    public static void main(String[] args) {
        String str = "AAABBCDD";
        System.out.println(FrequencyOfChars1(str));
        System.out.println(FrequencyOfChars2(str));
        System.out.println(FrequencyOfChars3(str));
        System.out.println(FrequencyOfChars4(str));
        System.out.println(FrequencyOfChars5(str));
    }

    //	solution 1:
    public static String FrequencyOfChars1(String str) {
        String nonDup = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains(str.substring(i, i + 1))) {
                nonDup += str.substring(i, i + 1);
            }
        }
        String expectedResult = "";
        for (int j = 0; j < nonDup.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == nonDup.charAt(j)) {
                    count++;
                }
            }
                expectedResult += nonDup.charAt(j) + " " + count;
            }
            return expectedResult;
        }

    //	solution 5:
    public static String FrequencyOfChars5(String str) {
        String nonDup = "";
        for (int i = 0; i < str.length(); i++) {
            if(!nonDup.contains(str.substring(i,i+1))){
                nonDup+=str.substring(i,i+1);

                int count =0;
                for(int j = i; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j))
                        count++;
                }
                nonDup +=" "+count;
            }
        }
        return nonDup;
    }

    //	solution 2:
    public static String FrequencyOfChars2(String str) {
        String expectedResult ="";
        int j =0;
        while(j<str.length()){
            int count =0;
            for(int i=0; i<str.length(); i++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            expectedResult+=str.charAt(j)+" "+count;
            str=str.replace(""+str.charAt(j), "");
        }
        return expectedResult;
    }

    //	solution 3:
    public static String FrequencyOfChars3(String str) {

        String b = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
        b=b.replace(", ","").replace("[","").replace("]","");
        String result ="";
        for(int j=0; j<b.length();j++) {
            int count=0;
            for(int i=0; i<str.length(); i++)
                if(str.substring(i,i+1).equals(str.substring(j, j+1)))
                    count++;
            result+=b.substring(j, j+1)+" "+count;
        }
        return result;
    }

    //	solution 4:
    public static String FrequencyOfChars4(String str) {
        String nonDup ="";
        String result ="";
        for(int i=0; i < str.length(); i++)
            if(! nonDup.contains(""+str.charAt(i)))
                nonDup += ""+str.charAt(i);

        for(int i=0; i < nonDup.length(); i++) {
            int num = Collections.frequency(Arrays.asList(str.split("")),""+nonDup.charAt(i));
            result+=""+nonDup.charAt(i)+" "+num;
        }
         return result;
    }



    }



