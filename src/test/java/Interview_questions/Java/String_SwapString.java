package Interview_questions.Java;

public class String_SwapString {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "defg";
        System.out.println(swap2(str1,str2));
        System.out.println(swap1(str1,str2));

    }

    public static String swap1(String str1, String str2){
    str1 =str1+str2;  //abcdef
    str2 =str1.replace(str2,"");//abc
    str1 =str1.replace(str2,"");//def
//			System.out.println(str1);
//			System.out.println(str2);
        return str1+" : "+str2;
}

    public static String swap2(String str , String str2) {//abc   defg
        String str3=str+str2; //abcdefg   7-4=3    7-
        str=str3.substring(str3.length()-str2.length());//defg
        str2=str3.substring(0,str3.length()-str.length());
        return str+" : "+str2;
    }
    }
