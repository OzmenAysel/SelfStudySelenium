package Interview_questions.JavaQuestions;

import java.util.Arrays;

public class MinimumArray {

    public static void main(String[] args) {
        int[] array = {1, 5, 7, 0, 10};
        System.out.println(findMin(array));
        System.out.println(findMin2(array));

        findMaxAndMin(array);  // Naveen's solution
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

    public static void findMaxAndMin(int[] numbers){  // Naveen
        int largest = numbers[0];
        int smallest = numbers[0];
        // Time complexity 0(n)
        for(int i= 1; i<numbers.length; i++ ){
            if(numbers[i]>largest){
                largest = numbers[i];
            }else if (numbers[i]<smallest){
                smallest = numbers[i];
        }
       }
        System.out.println("given array is: "+Arrays.toString(numbers));
        System.out.println("Largest number is: "+ largest);
        System.out.println("Smallest number is: "+smallest);
    }


}
