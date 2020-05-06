package Interview_questions.JavaQuestions;

import java.util.Arrays;

public class MaximumArray {

    public static void main(String[] args) {
        int[] array = {1, 5, 7, 0, 10};
        System.out.println(findMax(array));
        System.out.println(findMax2(array));

        System.out.println(findMax3(array, 5));

        findMaxAndMin(array);  // Naveen's solution
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


    public static int findMax3(int[] numbers, int total){
        int temp;
        for(int i = 0; i<total; i++){
            for(int j = i; j<total; j++) {
                if(numbers[i] > numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        return numbers[total-1];
    }

}
