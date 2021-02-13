import Interview_questions.JavaQuestions.main_Method.mainMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question {

    /*

3, 9, 50, 15, 99, 7, 98, 65   ​​​

     */

    public static void main(String[] Args){

        List<Integer> list = new ArrayList<>(Arrays.asList(3, 9, 50, 15, 99, 7, 98, 65));

        System.out.println(distClosestNumbers(list));
    }

    public static Integer distClosestNumbers(List<Integer> numbers) {
        int dist =Integer.MAX_VALUE;
        int temp =0; //6
        for(int i=0; i<numbers.size()-1; i++){
            for(int j=i+1; j<numbers.size(); j++){
                if(numbers.get(i)>numbers.get(j)){
                    temp= numbers.get(i)-numbers.get(j);
                }else{
                    temp=numbers.get(j)-numbers.get(i); // 6, 43
                }
                if(dist>temp){ //43
                dist=temp; //6
            }
            }
        }
        return dist;

    }




}
