package Interview_questions.JavaQuestions;

// Albert

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxTwoNumber_Array {

    public static void main(String[] args) {
        int[] numbers ={1,67,8,90,333,86,2,3};
//        getTwoMaxNumber(numbers);
//        System.out.println("===========================");
        getTwoMaxNumber2(numbers);


        // With collection
//        List<Integer> list = new ArrayList<>(Arrays.asList(1,67,8,90,333,86,2,3));
//        Collections.sort(list);
//        int num = list.size();
//        System.out.println("max1 "+list.get(num-1));
//        System.out.println("max2 "+list.get(num-2));
    }

    public static void getTwoMaxNumber(int[] numbers){
//        int maxOne=0;
//        int maxTwo=0;
        Arrays.sort(numbers);
        System.out.println("max1: "+ (numbers[numbers.length-1]));
        System.out.println("max2: "+ (numbers[numbers.length-2]));

    }
    public static void getTwoMaxNumber2(int[] arr){
        int maxnum1 = Integer.MIN_VALUE;
        int maxnum2 = Integer.MIN_VALUE;
        for(int each : arr) {
            if(each>maxnum1){
                maxnum2 = maxnum1;
                maxnum1 = each;
            } else if(each>maxnum2){
                maxnum2 = each;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("maxnumber1 "+ maxnum1);
        System.out.println("maxnumber2 "+ maxnum2);
    }


}
