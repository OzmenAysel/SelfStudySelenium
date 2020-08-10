package Interview_questions.JavaQuestions;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        /*
         What are different ways of copying an array into another way?
         Using for loop
         Using Arrays.copyOf() method
         Using clone() method
         */
        int[] number = {4, 54, 66, 567, 3983};
        int[] n = new int[number.length];

        // for loop
        for (int i = 0; i < number.length; i++) {
            n[i] = number[i];
        }
        System.out.println(Arrays.toString(n)); //[4, 54, 66, 567, 3983]

        // Arrays.copyOf() method
        int[] number2 = {4, 54, 66, 567, 3983};
        int[] n2 = Arrays.copyOf(number2, 5);
        System.out.println(Arrays.toString(n2));  // [4, 54, 66, 567, 3983]

        // clone() method
        int[] number3 = {4, 54, 66, 567, 3983};
        int[] n3 = number3.clone();
        System.out.println(Arrays.toString(n3)); //[4, 54, 66, 567, 3983]


        // How do you check the equality of two arrays in Java?
        // Arrays.equals() method
        int[] arr1 = {3, 5, 7, 9};
        int[] arr2 = {10, 20};
        System.out.println(Arrays.equals(arr1, arr2));  //False

        // For multi dimensional arrays
        // arrays.deepEquals() method


        // How do you sort the array elements?
        //Arrays.sort() method
        int[] array = new int[]{13, 45, 66, 2, 300};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array)); //[2, 13, 45, 66, 300]


        // What are the different ways to iterate over an array in Java?

        // using for loop
        System.out.println("using for loop");
        int[] array2 = new int[]{13, 45, 66, 2, 300};
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println();

        // using for each
        System.out.println("using for each");
        for (int each: array2) {
            System.out.println(each);
        }
        System.out.println();


        // How do you search an array to check whether it contains the given element or not?
        // using Arrays.binarySearch() method
        System.out.println("search the given element");
        int[] numbers = {13, 45, 66, 2, 300};
        System.out.println(Arrays.binarySearch(numbers,66)); // 2

        // If there is no that element in the array, java gives us negative number
        System.out.println(Arrays.binarySearch(numbers,10));
        System.out.println(Arrays.binarySearch(numbers,95));
    }
    }
