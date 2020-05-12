package Interview_questions.JavaQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class ChangeLetters_String {

        public static void main(String[] args) {
            String str = "       Do you  love    java? ";
            System.out.println(changeLetters(str));
        }
        public static String changeLetters(String str) {
            String newstr="";
            String[] arr = str.trim().split("\\s+");// ["Do", "you",]=>4
            String temp="";
            for(int i=0; i<arr.length; i++) {
                ArrayList<String> list = new ArrayList<>(Arrays.asList(arr[i].split("")));//{y,o,u}
                temp=list.get(0);//y
                list.set(0,list.get(1));//{"o","o","u"}
                list.set(1, temp);//{"o","y","u"}
                for(String each:list){
                    newstr+=each;//oyu
                }
                newstr+=" ";//"oyu "
            }
            return newstr;
        }
    }

