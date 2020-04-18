package Interview_questions.Java;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_MoveZerosToTheEnd {

//    Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
//
//    Ex:
//
//    input:  {1,0,2,0,3,0,4,0};
//
//    output: [1, 2, 3, 4, 0, 0, 0, 0]
//
//
//
//    Solution:

    public static int[] moveZeros( int[]  arr ) {

        ArrayList<Integer> list = new ArrayList<>();

        int countZero = 0;

        for(int each: arr) {

            list.add(each);

            countZero+= (each==0)?1:0;

        }



        list.removeAll(Arrays.asList(0));

        arr = new int[arr.length];

        for(int i=0; i <arr.length-countZero; i++ ) {

            arr[i] = list.get(i);

        }

        return arr;

    }

// Fatma Hocam
//public static int[] moveZeros( int[]  arr ) {//{5,0,10,0,3,0,8,0,2}
//​
//    ArrayList<Integer> list = new ArrayList<>();
//​
//    int countZero = 0;
//
////		for(int i=0; i<arr.length; i++) {
////			list.add(arr[i]);
////			if(arr[i]==0) {
////				countZero++;
////			}
////		}
//
//    for(int each: arr) {
//​
//        list.add(each);//{5,0,10,0,3,0,8,0,2}
//
//        countZero += (each==0)?1:0;
//
////			if(each==0) {
////				countZero++;
////			}
//
//    }
//
//    list.removeAll(Arrays.asList(0));//{5,10,3,8,2}
//
//    Collections.sort(list);
//​
//    arr = new int[arr.length];//[0,0,0,0,0,0,0,0,0]
//​
//    for(int i=0; i <arr.length-countZero; i++ ) {//
//​
//        arr[i] = list.get(i);
//​
//    }
//​
//    return arr;
//​
//}
//public static int[] moveZero(int[] arr) {
//
//    Arrays.sort(arr);
//    int length = arr.length;//[6,5,4,3,2,1,0,0,0,0]
//    int temp = 0;
//    for(int i=0; i<length/2; i++) {//0,1,2,3,4
//        arr[i]=temp;//1
//        arr[i]= arr[length-1-i];//2
//        arr[length-1-i]=temp;//1
//    }
//
//    return arr;
//}
}
