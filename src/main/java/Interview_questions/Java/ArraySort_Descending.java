package Interview_questions.Java;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySort_Descending {
	/*
	Write a return method that can sort an int array in descending order without using
	the sort method of the Arrays class
	Ex:  int[] arr = {10,20,7, 8, 90};
	           arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};   // larger to smaller
	  */
    public static void main(String[] args) {
        int[] arr = {10,20,7, 8, 90};
        System.out.println(Arrays.toString(Sort(arr)));  // [90, 20, 10, 8, 7]
    }

    public static int findMax(ArrayList<Integer> a){
        int max = Integer.MIN_VALUE;
        for(Integer each: a){
            if(each>max){
                max=each;
            }
        }
        return max;
    }

    public static int[] Sort(int[] a){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int each: a){
            list.add(each);
        }
        for(int i=0; i<a.length; i++){
            a[i]=findMax(list);         // list = {10, 20, 7, 8, 90}   a={10, 20, 7, 8, 90}
                                         // 90,20,7,8,90    90,20,7,8,90   90,20,10,8,90   90,20,10,8,90   90,20,10,8,7
                                // index     0					1                 2                 3                 4
            list.remove(Integer.valueOf(a[i]));		//list = {10,20,7, 8}   {10,7,8}  {7,8}  {7}  {}
        }
        return a;
    }

}
