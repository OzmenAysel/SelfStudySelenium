package Interview_questions.JavaQuestions;

import java.util.*;

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
//        System.out.println(consecutiveNumbers(24));
//        consecutiveNumbers(24);
                //        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ahmed", "John", "Aysel","Eric", "Ahmed"));
                //        removeAhmed(list);
//       ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 500, 3, 4, 5, 6,309, 90, 25, 1000, 0));
//        removeGraterThan100(list);

    }


    public static void removeGraterThan100(ArrayList<Integer> list){
//        list.removeIf(p -> p>100 );
//        System.out.println(list);
//              OR
//        ArrayList<Integer> result = new ArrayList<>();
//       for(int each: list){
//           if(each<100) {
//               result.add(each);
//           }
//       }
//       list=result;
//        System.out.println(list);
//              OR
//        Iterator<Integer> it = list.iterator();
//        while(it.hasNext()){
//            if(it.next()>100) {
//                it.remove();
//                System.out.println(list);
//            }
//    }
//              OR
        for(Iterator<Integer>  it=list.iterator(); it.hasNext();){
            if(it.next()>100){
                it.remove();
            }
        }
        System.out.println(list);
    }


    public static void removeAhmed(ArrayList<String> list){
//    list.removeAll(Arrays.asList("Ahmed"));
//    System.out.println(list);
//        OR
//        list.removeIf(s -> s.equals("Ahmed"));
//        System.out.println(list);
//                OR
        for( ListIterator<String> it = list.listIterator(); it.hasNext(); ){
            if(it.next().equals("Ahmed")){
                it.remove();
            }
        }
        System.out.println(list);
    }

    public static void consecutiveNumbers(int num ) {

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                if (i % 2 == 0)
                    System.out.print("Codility");
                if (i % 3 == 0)
                    System.out.print("Test");
                if (i % 5 == 0)
                    System.out.print("Coders");
                System.out.println();
            } else {
                System.out.println(num);
            }
        }
    }
//    public static String consecutiveNumbers(int num ) {
//        String result = "";
//        for (int i = 1; i <= num; i++) {
//            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
//                result += "CodilityTestCoders\n";
//            }else if (i % 2 == 0 && i % 3 == 0) {
//                result += "CodilityTest\n";
//            }else if (i % 2 == 0 &&  i % 5 == 0) {
//                result += "CodilityCoders\n";
//            }else if(i % 3 == 0 && i % 5 == 0) {
//                result += "TestCoders\n";
//            }else if (i % 2 == 0 ) {
//                result += "Codility\n";
//            }else if(i % 3 == 0) {
//                result += "Test\n";
//            }else if(i % 5 == 0){
//                result += "Coders\n";
//            }else{
//                result+=i+"\n";
//            }
//        }
//        return result + " ";
//    }

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
