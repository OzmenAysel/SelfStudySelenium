package Interview_questions.JavaQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class AAPractice_3 {

    public static void main(String[] args) {

//        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
//        moveZerosToTheEnd(arr);
                //        System.out.println(reverseNegativeNumber(-5009));
//        System.out.println(primeNum(7));
                //        System.out.println(palindrome("lEveL"));
//       System.out.println(palindromeNumber(6556));
                //        System.out.println(factorial(3));
//       fibonacci(5);
                //        int[] arr = {1,67,8,90,333,86,2,3};
                //        maxTwoNumbers(arr);
//        System.out.println(armstrong(153));
                //        int[] arr1 ={1,2,3,9};
                //        int[] arr2 ={4,5,6,7};
                //        System.out.println(concatTwoArrays1(arr1,arr2));
                //        System.out.println(Arrays.toString(concatTwoArrays2(arr1,arr2)));
        }

//        public static ArrayList<Integer> concatTwoArrays1(int[] arr1, int[] arr2){
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int each: arr1)
//            list.add(each);
//        for(int each: arr2)
//                list.add(each);
//        return list;
          //      OR
            public static int[] concatTwoArrays2(int[] arr1, int[] arr2){
            int[] result = new int[arr1.length+arr2.length];
            int i = 0;
            for(int each: arr1) {
                result[i] += each;
                i++;
            }
            for(int each: arr2) {
                result[i] += each;
                i++;
            }
            return result;

        }

        public static boolean armstrong(int num){ //153 => 153 = 1+125+27
        int cube =0;
        int remainder =0;
        int temp =num;
        while(num>0){
            remainder = num % 10;
            num = num / 10;
            cube = cube + (remainder*remainder*remainder);
        }if(temp==cube){
            return true;
            }return false;
        }

        public static void maxTwoNumbers(int[] arr) {
//            int num1 = arr[arr.length - 1];
//            int num2 = arr[arr.length - 2];
//            Arrays.sort(arr);
//            System.out.println(num1 + " " + num2);
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            for(int each: arr) {
                if (each > max1) {
                    max2 = max1;
                    max1 = each;
                } else if (each > max2) {
                    max2 = each;
                }
            }
                System.out.println(max1 + " " + max2);
            }

    public static void fibonacci(int num){ // 0 1 1 2 3 5 8 13 21
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" "); // 0 1 1
        for(int i=0; i<=num; i++){    // 1 2 3 4 5
        int c = a+b;
        a = b;
        b = c;
        System.out.print(c+" ");
    }


    }

    public static int factorial(int num){
        int result = 1;
            if(num==0)
               return 1;
            if(num>0)
                for (int i = 1; i <= num; i++) {
                    result = result*(i);
                }
            return result;
        }

    public static boolean palindromeNumber(int num){
        String str = Integer.toString(num);
        String result = "";
        for(int i = str.length()-1; i>=0; i--) {
            result += str.charAt(i);
        }
        return str.equalsIgnoreCase(result);
        }


    public static boolean palindrome(String str){
//        String result ="";
//            for(int i = str.length()-1; i>=0; i--){
//              result += ""+str.charAt(i);
//            }
//            if(str.equalsIgnoreCase(result)){
//                return true;
////            }
//        return false;

            if(str==null) {
                return false;
            }
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString().equalsIgnoreCase(str);


}

    public static boolean primeNum(int num){
        if(num<=1) {
            return false;
        }
        for(int i=2; i<num; i++) {
            if (num % i == 0) {
                return true;
            }
        }
                return false;
            }

    public static int reverseNegativeNumber(int num){
        String result = new StringBuilder(""+num).reverse().toString();
        if(num<0){
            result="-"+result.substring(0,result.length()-1);
        }
      return Integer.valueOf(result);
    }

    public static void moveZerosToTheEnd(int[] arr) {
//        ArrayList<Integer> zeros = new ArrayList<Integer>();
//        for (int each : arr)
//            if (each == 0)
//                zeros.add(each);
//        ArrayList<Integer> noZeros = new ArrayList<Integer>();
//        for (int each : arr)
//            if (each != 0)
//                noZeros.add(each);
//        ArrayList<Integer> result = new ArrayList<Integer>();
//        for (int each : noZeros)
//            result.add(each);
//        for (int each : zeros)
//            result.add(each);
//        System.out.println(result);

    ArrayList<Integer> list = new ArrayList<>();
    int countZero =0;
    for(int each: arr) {
        list.add(each);
        if (each == 0) {
            countZero += 1;
        }else{
           countZero += 0;
            }
        }
        list.removeAll(Arrays.asList(0));
        arr = new int[arr.length];
        for (int i = 0; i < arr.length - countZero; i++) {
            arr[i] = list.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
/*
 int countZero = 0;
        for (int each : arr) {
            list.add(each);
            countZero += (each == 0) ? 1 : 0;
        }
        list.removeAll(Arrays.asList(0));
        arr = new int[arr.length];
        for (int i = 0; i < arr.length - countZero; i++) {
            arr[i] = list.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
 */

    }

