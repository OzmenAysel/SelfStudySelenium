package Interview_questions.JavaQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class String_FrequencyOfCharacters {
    /* Write a return method that can find the frequency of characters
			Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2 */

    public static void main(String[] args) {
        String str = "AAABBCDD";
        System.out.println(FrequencyOfChars(str));
        System.out.println(FrequencyOfChars1(str));
        System.out.println(FrequencyOfChars2(str));
        System.out.println(FrequencyOfChars3(str));
        System.out.println(FrequencyOfChars4(str));
        System.out.println(FrequencyOfChars5(str));
    }


    // Hakan abi
    public static String FrequencyOfChars(String str) {
        String result ="";
        while(str.length()>0){
            int count = 0;
            for(int i =0; i<str.length(); i++){
                if(str.substring(i,i+1).contains(str.substring(0,1)))
                    count++;
            }
            result+= str.substring(0,1)+count;
            str = str.replaceAll(str.substring(0,1), "");
        }
        return result;
    }

    //	solution 1:
    public static String FrequencyOfChars1(String str) {
        String nonDup = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains(str.substring(i, i + 1)))
                nonDup += str.substring(i, i + 1);
        }
        String result = "";
        for (int j = 0; j < nonDup.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == nonDup.charAt(j)) {
                    count++;
                }
            }
                result += nonDup.charAt(j) + "" + count;
            }
            return result;
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
                nonDup +=""+count;
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
            expectedResult+=str.charAt(j)+""+count;
            str=str.replace(""+str.charAt(j), "");
        }
        return expectedResult;
    }

    //	solution 3:
    public static String FrequencyOfChars3(String str) {

        String nunDup = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
        nunDup=nunDup.replace(", ","").replace("[","").replace("]","");

        String result ="";
        for(int i=0; i<nunDup.length();i++) {

//            int count=0;      // Burasi yerine asagidaki iki satiri da yazabiliriz collection kullanarak
//            for(int j=0; j<str.length(); j++)
//                if(str.substring(j,j+1).equals(str.substring(i, i+1)))
//                    count++;
//            result+=nunDup.substring(i, i+1)+""+count;

            int count = Collections.frequency(Arrays.asList(str.split("")), nunDup.substring(i,i+1));
            result += nunDup.substring(i,i+1) + count;
        }
        return result;
    }

    //	solution 4:
    public static String FrequencyOfChars4(String str) {
        String nonDup ="";
        String result ="";
        for(int i=0; i < str.length(); i++)
            if(! nonDup.contains(str.substring(i, i+1)))
                nonDup += str.substring(i, i+1);

        for(int i=0; i < nonDup.length(); i++) {
            int num = Collections.frequency(Arrays.asList(str.split("")),""+nonDup.charAt(i));
            result+=""+nonDup.charAt(i)+num;
        }
         return result;
    }



    }



