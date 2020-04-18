package Interview_questions.Java;

import org.testng.annotations.Test;

import java.util.Arrays;

public class Array_FindMaximum_Minimum {

    public static void main(String[] args) {
        int[] array = {1, 5, 7, 0, 10};
        System.out.println(findMax(array));
        System.out.println(findMax2(array));
        System.out.println(findMin(array));
        System.out.println(findMin2(array));
    }

    //  Write a method that can find the maximum number from an int Array
    // Solution 1
    public static int findMax(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
    // Solution 2
    public static int findMax2(int[] arr) {
        int max = Integer.MIN_VALUE;
      //  int max = 0;
      //  int max = arr[0];
        for(int each: arr){
            if(each>max){  // min.Math(min,each);
                max=each;
            }
        }
        return max;
    }

    //  Write a method that can find the minimum number from an int Array
    // solution 1
    public static int findMin(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    // solution 2
    public static int findMin2(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int each: arr){
            if(each<min){
                min=each;
            }
        }
        return min;
    }


}
