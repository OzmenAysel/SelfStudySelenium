package Interview_questions.JavaQuestions;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class AAPractice_2 {

    public static void main(String[] args) {
//        int  number = 5;
//        System.out.println(Arrays.toString(sumUpToZero(number)));
                //        char[] ch = { 'A', 'Z', 'B'};
                //        printPermutation(ch);
//        System.out.println(evenNum(6));
//        System.out.println(oddNum(5));
                //        divideTwoNum(8,0);
//        System.out.println(FINRA(15));
                //        swapNum(10,5);
    }

    public static void swapNum(int a, int b){ // 10 5
        a = a+b; // 15
        b = a-b;  // 15-5 == 10
        a = a-b;
        System.out.println("numer a is "+a+ " number b is " +b);
    }

    public static String FINRA(int num){
        String result ="";
        for(int i =0; i<num; i++){
               result+=i%5==0 && i%3==0? "FINRA ":i%5==0 ? "RA ": i%3==0 ? "FIN " : i+" ";
            }
        return result;
    }

    public static void divideTwoNum(int num1, int num2){

        if(num2==0){
            System.out.println("It is not a valid number");
        }else{
            int count = 0;
            while(num1>=num2){
                num1 = num1-num2;
                count++;
            }
            System.out.println("10/2 is " + count + " reminder is "+ num1);
        }


    }

    public static String oddNum(int num){
        return num%2==0? "even" : "odd";
    }
    public static boolean evenNum(int num){
        boolean even = num%2==0;
            return even;
    }

    public static void printPermutation(char[] ch) {
        for(String s: permutation(ch))
            System.out.println(Arrays.toString( s.toCharArray( ) ) );
    }
    public static Set<String> permutation(char[] ch) {
      String str = Arrays.toString(ch).replace(", ","").replace("[","").replace("]","");
      Set<String> set =  new LinkedHashSet<>();
      if(str.length() == 1) {
          set.add(str);
      }else{
          for(int i =0; i<str.length(); i++){
              String a = str.substring(0,i)+str.substring(i+1);
              char[] ch2 = a.toCharArray();
              for(String permutation: permutation(ch2))
                  set.add(str.charAt(i) + permutation);
              }
          }
      return set;
    }

    public static int[] sumUpToZero(int num){
        int[] result = new int[num];
        int sum = 0;
        for(int i =0; i<num-1; i++){
            result[i]+=i;
            sum+=i;
        }
        result[num-1]=-sum;
        return result;
    }

}
