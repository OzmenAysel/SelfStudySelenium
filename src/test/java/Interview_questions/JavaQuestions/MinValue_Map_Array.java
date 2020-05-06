package Interview_questions.JavaQuestions;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class MinValue_Map_Array {

   // Write a method that can return the minimum value from ta map (DO NOT use sort method)



    //Solution:

    public  static  int  minValue( Map<String,Integer> map  ) {

        SortedSet<Integer> sm = new TreeSet<>(map.values());

        return sm.first( );

    }
}
