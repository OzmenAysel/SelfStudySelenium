package Interview_questions.JavaQuestions;

import java.util.HashMap;
import java.util.Map;

public class AbdullahA2 {
    public static void main(String[] args) {


        String s="(((()))){{{{}}}}[[[[]]]]";  // {()[}
        System.out.println(paranthes(s));
    }
    public static boolean paranthes(String str){
        Map<String,Integer> map=new HashMap<>();
        for (String each:str.split(""))   {
            map.put(each,map.getOrDefault(each,0)+1);
        }
        System.out.println(map);

        return map.get("(")==map.get(")")
                &&map.get("[")==map.get("]")
                &&map.get("{")==map.get("}");
    }
}
