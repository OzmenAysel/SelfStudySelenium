package Interview_questions.JavaQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort_Ascending_Array {
    /*
Write a return method that can sort an int array in Ascending order without using
the sort method of the Arrays class
Ex:	int[] arr = {10, 9, 8, 7};
        arr = Sort(arr);  ==>{ 7, 8, 9, 10};  smaller to larger
     */
    public static void main(String[] args) {
        int[] arr = {5, 9, 8, 7};
        System.out.println(Arrays.toString(Sort1(arr)));
      //  System.out.println(Arrays.toString(Sort2(arr)));
       // System.out.println(Arrays.toString(Sort3(arr)));
    }

    // min value of list
    public static int findMin(ArrayList<Integer> a) {
        int min = Integer.MAX_VALUE;
        for (Integer each : a) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    // ArrayList
    public static int[] Sort1(int[] a) {
        ArrayList<Integer> list = new ArrayList<>();
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

    // nested loop and swap
    public static int[] Sort2(int[] arr) {        // {5, 9, 8, 7};
        for (int i = 0; i < arr.length; i++) {    // 5
            for (int j = i+1; j < arr.length; j++) {  // 9
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    // Arrays.sort method
    public static int[] Sort3(int[] arr){
        Arrays.sort(arr);
        return arr;
    }
}
