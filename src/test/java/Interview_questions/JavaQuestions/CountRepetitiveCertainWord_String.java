package Interview_questions.JavaQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountRepetitiveCertainWord_String {

    public static void main(String[] args) {

      //   String[] names ={"Java", "JavaScript", "Ruby", "C", "Python", "Java", "C"};
        String str = "Aysel     Aysel Saadet     Fatma Fatma     fatma";
        //FindDupElements(str);
        FindDupElements2(str);
       // FindDupElements3(str);

        System.out.println("Finding Aysel");
        System.out.println(str.matches(".*Aysel.*")); // true
        System.out.println(str.matches(".*Bera.*"));  // false
    }


    public static void FindDupElements(String str) {  // worst approach  0(nxn) time complexity
        String[] words = str.trim().split("\\s+"); // Fazla bosluklarin onemsemez
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase("saaDET")) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void FindDupElements2(String str) {  // rebootcamp
        int count = 0;
        str = str.toLowerCase();
        while(str.contains("Aysel")){
                count++;
            str = str.replaceFirst("Aysel", "");
            }
        System.out.println(count);
    }

    public static void FindDupElements3(String str) {  // rebootcamp
        int count = 0;
        for (int i = 0; i<str.length()-6; i++) {
            if(str.substring(i, i+6).equalsIgnoreCase("saaDET"))
                count++;
        }
        System.out.println(count);

    }

        public static void FindDupElements4(String str) {     // ??????
        String[] words = str.split("\\s");
        HashSet<String> set = new HashSet<String>();
        for (String each : words) {
            if (!set.add(each)) {
                System.out.println("Duplicate Element is : " + each);
            }
        }

    }

    public static void FindDupElements5(String str) {      // Naveen
        String[] words = str.trim().split("\\s+");
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String each : words) {
            if (map.containsKey(each)) {
                map.put(each.toLowerCase(), map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        Set<String> wordsInString = map.keySet();
        for (String each : wordsInString) {
            if (map.get(each) > 1) {
                System.out.println(each + " : " + map.get(each));
            }

        }

    }


}