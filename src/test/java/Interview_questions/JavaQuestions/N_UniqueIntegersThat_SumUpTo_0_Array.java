package Interview_questions.JavaQuestions;

import java.util.Arrays;

public class N_UniqueIntegersThat_SumUpTo_0_Array {   //????????

    /*Write a function:
		that, given an integer N (1 < N < 100), returns an array containing N unique
		 integers that sum up to 0. The function can return any such array.
		 For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
		 The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
		 For N = 3 one of the possible answers is [-1,0,1]  (but there are many more
		 correct answers).
*/
    public static void main(String[] args) {

        int num = 3;
       int[] arr1 = SumUpToZero1(num);
       int[] arr2 = SumUpToZero2(num);
       int[] arr3 = SumUpToZero2(num);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
    //Solution:
    public static int[] SumUpToZero1(int num){

        int[] arr = new int[num];
        int sum =0;

        for(int i=0; i<num-1; i++) {
            arr[i]+=i;
            sum+=i;
        }
        arr[num-1]=-sum;
        return arr;
    }

    // Hakan abi
    public static int[] SumUpToZero2(int num) {

        int[] arr = new int[num];
        int sum =0;

        if (num % 2 == 1)
            arr[num/2] = 0;

        for(int i = 0; i < num/2; i++) {
            arr[i] = -(i+1);
            arr[num-1-i] = i+1;
        }
        return arr;
    }

    // Hakan abi
    public static int[] SumUpToZero3(int num) {

        int[] arr = new int[num];
        int sum =0;

        if (num % 2 == 1)
            arr[num/2] = 0;

        for(int i = 0; i < num-1; i++) {
            arr[i] = i+1;
            sum+= i+1;
        }
        arr[num-1] = -sum;
        return arr;
    }

}
