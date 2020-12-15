package Interview_questions.JavaQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseSentence {

        public static void main(String[] args) {
            String str = "Wherever you go, you can         always        find beauty.";
//            System.out.println(str);
//            System.out.println(reverse(str));
            reverseSentence(str);
        }

        public static void reverseSentence(String str){
           String[] words = str.split("\\s+");
          //  String[] words = str.split(" ");
            String rev = "";
            for(int i = words.length - 1; i >= 0 ; i--) {
                rev += words[i] + " ";
            }
            rev=rev.replaceAll("\\.","");
            rev=rev.replaceAll("\\,","");
            System.out.println(rev);
        }
                /*






        // can also use StringBuilder:
        StringBuilder revb = new StringBuilder();
        for(int i = words.length - 1; i >= 0 ; i--)
        {
           revb.append(words[i]);
           revb.append(" ");
        }
        //
         */
//        public static String reverse(String str) {
//            List<String> list = Arrays.asList(str.replaceAll("\\.", "").replaceAll(",", "").split(" "));
//            String reversed = "";
//            Collections.reverse(list);
//           // for (var i = 0; i < list.size(); i++) {
//            for (int i = 0; i < list.size(); i++) {
//                if (i==0){
//                    reversed=list.get(i).toUpperCase().charAt(0)+list.get(i).substring(1)+" ";
//                    continue;
//                }
//                if (i==list.size()-1){
//                    reversed+=list.get(i).toLowerCase();
//                    break;
//                }
//                if (i == 2) {
//                    reversed += list.get(2) + ", ";
//                    continue;
//                }
//                reversed += list.get(i) + " ";
//            }
//            return reversed.trim() + ".";
//        }
}
