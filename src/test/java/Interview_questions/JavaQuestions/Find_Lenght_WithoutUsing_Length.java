package Interview_questions.JavaQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Lenght_WithoutUsing_Length {

    // Find length of a String, without using length() method.
    public static void main(String[] args) {

        String str = "Aysel Dalcicek";



        // solution 1
        System.out.println(str.lastIndexOf(""));

        // My solution
        int count1 =0;
        for (int i=0; i<str.length(); i++){
            count1++;
        }
        System.out.println(count1);



        // solution 2
        char[] ch = str.toCharArray();
        int count =0;
        for(char each: ch){
           count++;
        }
        System.out.println(count);

        // solution 3
        String[] str2 = str.split("");
        List<String> list = new ArrayList<String>(Arrays.asList(str2));
        System.out.println(list.size());
    }


}
