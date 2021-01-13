package Interview_questions.JavaQuestions;

import java.util.*;

public class ConvertMapToSet {
    public static void main(String[] args) {

        //Map<Integer,String> map = getMap();

        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1,"Sunday");
        myMap.put(2,"Monday");
        myMap.put(3,"Tuesday");
        myMap.put(4,"Wednesday");

        //Convert Map keys to Set
        Set<Integer> keySet= new HashSet<Integer>(myMap.keySet());
        //    keySet.forEach(key-> System.out.println(key));
        for(Integer each:myMap.keySet()){
            keySet.add(each);
            System.out.print(each+" ");
        }
        System.out.println(keySet);


        //Convert Map values to Set
        Set<String> valueSet= new HashSet<String>(myMap.values());
        //  valueSet.forEach(value-> System.out.println(value));
        for(String each:myMap.values()){
            valueSet.add(each);
            System.out.print(each+" ");
        }
        System.out.println(valueSet);

        List<String> targetList = new ArrayList<>(myMap.values());
        System.out.println(targetList);
        List<Integer> targetList2 = new ArrayList<>(myMap.keySet());
        System.out.println(targetList2);

    }

}
