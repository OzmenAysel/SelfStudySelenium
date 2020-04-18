package Interview_questions.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array_Sort_Descending {
	/*
	Write a return method that can sort an int array in descending order without using
	the sort method of the Arrays class
	Ex:  int[] arr = {10,20,7, 8, 90};
	           arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};   // larger to smaller
	  */
    public static void main(String[] args) {
        int[] arr = {10,20,7, 8, 90};
        System.out.println(Arrays.toString(Sort1(arr)));  // [90, 20, 10, 8, 7]
        System.out.println(Sort2(arr));
    }

    // max value of a list
    public static int findMax(ArrayList<Integer> a){
        int max = Integer.MIN_VALUE;
        for(Integer each: a){
            if(each>max){
                max=each;
            }
        }
        return max;
    }

    public static int[] Sort1(int[] arr){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int each: arr){
            list.add(each);
        }
        for(int i=0; i<arr.length; i++){
            arr[i]=findMax(list);         // list = {10, 20, 7, 8, 90}   a={10, 20, 7, 8, 90}
                                         // 90,20,7,8,90    90,20,7,8,90   90,20,10,8,90   90,20,10,8,90   90,20,10,8,7
                                // index     0					1                 2                 3                 4
            list.remove(Integer.valueOf(arr[i]));		//list = {10,20,7, 8}   {10,7,8}  {7,8}  {7}  {}
        }
        return arr;
    }

    // Arrays.sort Method
    public static ArrayList<Integer> Sort2(int[] arr){
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        for(int each : arr){
            list.add(each);
        }
        Collections.reverse(list);
        return list;
//        ArrayList<Integer> list2 = new ArrayList<>();  // instead of Collections.reverse(list); method
//        for(int i = list.size()-1; i>=0; i--){
//            list2.add(list.get(i));
//        }
//        return list2;

    }

}
