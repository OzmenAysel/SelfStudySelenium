package Interview_questions.JavaQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapAnArray {

    public static void main(String[] args) {
       int[] arr = {10,20,30,40,50};
       swap(arr);
       swap2(arr);
    }

    public static void swap(int[] arr){
        int i = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1]=i;
        System.out.println(Arrays.toString(arr));
    }

    public static void swap2(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int each : arr){
            list.add(each);
        }
        Collections.swap(list,0,4 );
        System.out.println(list);

    }
}
