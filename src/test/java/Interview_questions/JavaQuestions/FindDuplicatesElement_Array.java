package Interview_questions.JavaQuestions;

// Naveen

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class FindDuplicatesElement_Array {

    public static void main(String[] args) {

        String[] names ={"Java", "JavaScript", "Ruby", "C", "Python", "Java", "C"};
        FindDupElements(names);
        FindDupElements2(names);
        FindDupElements3(names);
    }

    // compare each element
    public static void FindDupElements(String[] arr) {  // worst approach  0(nxn) time complexity

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
        System.out.println();
    }


    // Using HashSet
    public static void FindDupElements2(String[] arr) {  // 0(n)
        Set<String> list = new HashSet<String>();
        for(String each: arr){
            if(list.add(each) == false)  // list.add(each) If it is already added return false, if it is  ot added return true
            System.out.print (each + " ");
        }
    }

    // Using HashMap
    public static void FindDupElements3(String[] arr) {  // 0(2n)
        Map<String, Integer> list = new HashMap<String, Integer>();
        for(String each: arr){
            Integer count = list.get(arr);
            if(count == null) {
                list.put(each, 1);
            }else{
                list.put(each, ++count);
        }
    }
            Set<Map.Entry<String, Integer>> entrySet =  list.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }

        }

    }
    }
