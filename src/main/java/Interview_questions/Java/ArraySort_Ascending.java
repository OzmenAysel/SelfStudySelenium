package Interview_questions.Java;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySort_Ascending {
    	/*
	Write a return method that can sort an int array in Ascending order without using
	the sort method of the Arrays class
	Ex:	int[] arr = {10, 9, 8, 7};
	        arr = Sort(arr);  ==>{ 7, 8, 9, 10};  smaller to larger
	     */
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        System.out.println(Arrays.toString(Sort(arr)));

    }
    public static int findMin(ArrayList<Integer> a){
        int min = Integer.MAX_VALUE;
        for(Integer each: a){
            if(each<min){
                min=each;
            }
       }
        return min;
    }

    public static int[] Sort(int[] a) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int each : a) {
            list.add(each);
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = findMin(list);                // list = {10,9,8,7}   a={10,9,8,7}
                                                                     //    7,9,8,7    7,8,8,7   7,8,9,7  7,8,9,10
                                                                // index   0		    1	        2	        3
            list.remove(Integer.valueOf(a[i]));                  // list ={10,9,8}   {10,9}   {10}	{}
        }
            return a;
    }


}
