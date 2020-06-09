package Interview_questions.JavaQuestions;

public class SwapTwoStrings_String {

     public static void main(String[] args) {
         String str1 = "Zeynep";
         String str2 = "Bera";

         System.out.println("before swapping: " + str1+" : "+str2);

         System.out.println("after swapping:");
         System.out.println(swap1(str1,str2));
         System.out.println(swap2(str1,str2));
         System.out.println(swap3(str1,str2));
     }

    public static String swap1(String str1, String str2){
        str1 =str1+str2;  //abcdef
        str2 =str1.replace(str2,"");//abc
        str1 =str1.replace(str2,"");//def
//			System.out.println(str1);
//			System.out.println(str2);
        return str1+" : "+str2;
    }

    public static String swap2(String str1, String str2){
         // Without using third variable
         str1 = str1 + str2; // ZeynepBera
         str2 = str1.substring(0, str1.length() - str2.length()); // Zeynep
         str1 = str1.substring(str2.length()); // Bera

//         // Using third variable
//         String temp = str1;
//         str1 = str2;
//         str2 = temp;
//         System.out.println(str2);

           return str1+" : "+str2;
    }

    public static String swap3(String str , String str2) {//abc   defg
        String str3=str+str2; //abcdefg   7-4=3    7-
        str=str3.substring(str3.length()-str2.length());//defg
        str2=str3.substring(0,str3.length()-str.length());
        return str+" : "+str2;
    }
}
