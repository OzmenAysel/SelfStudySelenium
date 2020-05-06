package Interview_questions.JavaQuestions;

// Albert

import java.util.Arrays;

public class FirstTwoMaxNumber_Array {

    public static void main(String[] args) {
        int[] numbers ={1,67,8,90,333,86,2,3};
        getTwoMaxNumber(numbers);
    }

    public static void getTwoMaxNumber(int[] numbers){

        int maxOne=0;
        int maxTwo=0;

        Arrays.sort(numbers);
        System.out.println("max1: "+ (numbers[numbers.length-1]));
        System.out.println("max2: "+ (numbers[numbers.length-2]));

    }
}
