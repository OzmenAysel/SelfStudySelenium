package Interview_questions.JavaQuestions;

import java.util.*;

public class APractice_1 {


    public static void main(String[] args) {

        //        String str1 = "abc"; String str2= "cab";
        //        System.out.println(sameLetter(str1,str2));
//        String str = "AAABBBCCC";
//        System.out.println(removeDup(str));
        //        String str = "AAABBBCCCDEF";
        //        System.out.println(findUnique(str));
//        String str1 = "AAABBCDD";
//        System.out.println(FrequencyOfChar(str1));
        //        String str = "04March2435*@"; // 123abc#@$AB
        //        System.out.println(passwordValidation(str));
//        int[] arr = {1,5,17,8,56,30,0};
//        System.out.println(maxNum(arr));
//        System.out.println(minNum(arr));

//        int[] arr3 = {1,5,17,8,56,30,0};
//        System.out.println(Arrays.toString(sortAscending(arr3)));
//        System.out.println(Arrays.toString(sortDescending(arr3)));
    }

    public static int[] sortDescending(int[] arr){
        ArrayList<Integer> list =new ArrayList<Integer>();
        for(int each: arr)
            list.add(each);

        for(int i =arr.length-1; i>=0; i--){
            arr[i]=findMax(list);
            list.remove(Integer.valueOf(arr[i]));
        }
        return arr;
    }
    public static int findMax(ArrayList<Integer> list){
        int maxNum = Integer.MIN_VALUE;
        for(int each: list)
            if(each>maxNum)
            maxNum=each;
            return maxNum;
    }



        public static int[] sortAscending(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int each: arr)
            list.add(each);

            for(int i =0; i<arr.length; i++){
                arr[i]=findMin(list);
                list.remove(Integer.valueOf(arr[i]));
            }
            return arr;
        }
        public static int findMin(ArrayList<Integer> list){
            int minNumber = Integer.MAX_VALUE;
            for(int each:list)
                minNumber=each<minNumber? each : minNumber;
            return minNumber;
            }


    public static int minNum(int[] arr){
        Arrays.sort(arr);
        int minNumber= arr[0];
//        int minNumber = Integer.MAX_VALUE;
//       for (int each:arr)
//           if(each<minNumber)
//               minNumber=each;
        return minNumber;
    }

    public static int maxNum(int[] arr){
//        Arrays.sort(arr);
//        int maxNumber = arr[arr.length-1];
        int maxNumber = Integer.MIN_VALUE;
        for(int each:arr)
            if(each>maxNumber)
                maxNumber=each;
       return maxNumber;
    }

    public static boolean passwordValidation(String password){
        boolean Lower = password.matches("(.*[a-z].*)");
        boolean Upper = password.matches("(.*[A-Z].*)");
        boolean Digits = password.matches("(.*[0-9].*)");
        boolean Special = password.matches("(.*\\W.*)");
        boolean valid = false;
        if(password.length()>=6 && !password.contains(" ") )
            if(Lower && Upper && Digits && Special)
                 valid=true;
        return valid;
    }

    public static String FrequencyOfChar(String str) {
        String nonDup = "";
//        str=new LinkedHashSet<>(Arrays.asList(str.split(""))).toString(); // non dup boyle de olur
//        str = str.replace(", ","").replace("[","").replace("]","");
        for(int i =0; i<str.length(); i++){
            if(!nonDup.contains(""+str.charAt(i))) {
                nonDup += "" + str.charAt(i);
            }}

        String frqOfChar = "";
        for(int i =0; i<nonDup.length(); i++){
            int num = 0;
            for(int j =0; j<str.length(); j++){
                if(str.charAt(j)==nonDup.charAt(i)){
                    num++;
                }
            }
            frqOfChar+=nonDup.charAt(i)+""+num;
        }
        return frqOfChar;

//        String result = "";
//        int num = 0;
//        while (num < str.length()) {
//            int count = 0;
//            for (int i = 0; i < str.length(); i++) {
//                if (str.charAt(i) == str.charAt(num)) {
//                    count++;
//                }
//                result += str.charAt(i) + "" + count;
//                str = str.replace("" + str.charAt(i), "");
//            }
//        }
//        return result;

    }


    public static String findUnique(String str) {
        String unique = "";
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            int num = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    num++;
                }
            }
            if (num == 1) {
                unique += arr[i];
            }

        }
        return unique;
    }

    public static String removeDup(String str) {
//        String result = "";
//       for(int i =0; i<str.length(); i++)
//           if(!result.contains(""+str.charAt(i))) {
//               result += "" + str.charAt(i);
//           }
//        return result;
        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
        str = str.replace("[", "").replace("]", "").replace(", ", "");
        return str;
    }


    public static boolean sameLetter(String str1, String str2) {
//        String[] arr1 = str1.split(""); Arrays.sort(arr1);
//        String[] arr2 = str2.split(""); Arrays.sort(arr2);
//        String a = "", b="";
//        for(String each: arr1)
//            a+=each;
//        for(String each: arr2)
//            b+=each;
//        return a.equals(b);

        char[] ch1 = str1.toCharArray();
        Arrays.sort(ch1);
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);

//        String[] arr1 = str1.split(""); Arrays.sort(arr1);
//        String[] arr2 = str2.split(""); Arrays.sort(arr2);
//        return Arrays.equals(arr1, arr2);

//        str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
//        str2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
//        return str1.equals(str2);
    }


}
