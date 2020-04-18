package Interview_questions.Java;

public class String_Reverse {
    /*
	Write a return method that can reverse  String
	Ex: Reverse("ABCD"); ==> DCBA
		 */

    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println(StrReverse1(str));
        System.out.println(StrReverse2(str));

    }
    // solution 1:
    public static String StrReverse1(String str){
       String reverse = "";
       for(int i=str.length()-1; i>=0; i--){
           reverse+=str.substring(i, i+1);
           //reverse+=str.charAt(i);
       }
//       while(str.length()>0){
//           reverse+=str.charAt(str.length()-1);
//           str =str.substring(0,str.length()-1);
//       }
        return reverse;
    }

    // solution 2:
    public static String StrReverse2(String str) {
        return new StringBuffer(str).reverse().toString();
    }
}
