package Interview_questions.JavaQuestions;

import org.testng.asserts.SoftAssert;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters_Map_String {

   // Write a method that prints the frequency of each character from a String

    public static void main(String[] args) {
        String str = "Hello word";
        String word = "aaaabbbbccccdef";
        FrequencyTest(word);
        FrequencyTestSeyfo(word);
    }

   // Solution:

    public static void FrequencyTest(String  str ) {

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character each : str.toCharArray()) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        System.out.println(map);
    }


    public static void FrequencyTestSeyfo(String  str ) {

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i =0; i<str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i),1);
            } else {
                map.put(str.charAt(i), map.get(str.charAt(i)+1));  // { a, 4 } , { b , 3 }
            }
        }
//        for(Map.Entry each: map.entrySet()){
//            System.out.println("word contains "+ each.getValue()+" times "+each.getKey());
//        }
             // OR
        map.forEach( (k,v) ->{
            System.out.println("word contains "+ v+" times "+k);
        } );
    }


}
