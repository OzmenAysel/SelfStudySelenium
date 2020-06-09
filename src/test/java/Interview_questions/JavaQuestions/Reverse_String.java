package Interview_questions.JavaQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse_String {
    /*
	Write a return method that can reverse  String
	Ex: Reverse("ABCD"); ==> DCBA
		 */

    public static void main(String[] args) {
        String str = "ABCD";
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }

//        System.out.println(StrReverse1(str));
//        System.out.println(StrReverse2(str));
//        System.out.println(StrReverse3(str));
//        System.out.println(StrReverseStream(str));

    }
    // solution 1:
    public static String StrReverse1(String str){
       String reverse = "";
       for(int i=str.length()-1; i>=0; i--){
          // reverse+=str.substring(i, i+1);
           reverse+=str.charAt(i);  // OR  reverse+=str.toCharArray()[i];
       }
//       while(str.length()>0){
//           reverse+=str.charAt(str.length()-1);
//           str =str.substring(0,str.length()-1);
//       }
       return reverse;
    }

    // solution 2:
    public static String StrReverse2(String str) {

        return new StringBuffer(str).reverse().toString();
    }

    // solution 3: Iterator
    public static String StrReverse3(String str) {
        String reverse = "";
        List<Character> list = new ArrayList<>();
        for(char each : str.toCharArray()){
            list.add(each);
        }
        Collections.reverse(list);
        Object[] arr = list.toArray();
        for(int i=0; i<arr.length; i++){
            reverse +=arr[i];
        }
        return reverse;
    }

    // solution 4: Stream
    public static String StrReverseStream(String str) {
        List<Character> list = new ArrayList<>();
        String reverse = list.stream()   // Stream Character
                .map(String::valueOf)    // Stream<String>
                .collect(Collectors.joining());
        return reverse;
    }


}
