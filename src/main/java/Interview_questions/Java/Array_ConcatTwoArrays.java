package Interview_questions.Java;

import java.util.Arrays;

public class Array_ConcatTwoArrays {
  //  Write a return method that can concate two arrays

    public static void main(String[] args) {
        int[] arr1 ={1,2,3,9};
        int[] arr2 ={4,5,6,7};
        System.out.println(Arrays.toString(concatTwoArrays(arr1, arr2)));
        System.out.println(Arrays.toString(concatTwoArrays2(arr1, arr2)));
    }
   // Solution:

    public static int[] concatTwoArrays(int[] arr1 , int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        for(int each: arr1) {
            result[i] = each;
            i++;
        }
        for(int each: arr2) {
            result[i] =each;
            i++;
        }
        return result;
    }

    public static int[] concatTwoArrays2(int[] arr1 , int[] arr2) {
        int[] arrays = new int[arr1.length+arr2.length];
        for(int i=0; i< arr1.length; i++){
            arrays[i]=arr1[i];
        }
        for(int i=0; i< arr2.length; i++){
            arrays[i+arr1.length]=arr2[i];
        }
        return arrays;
    }


}
