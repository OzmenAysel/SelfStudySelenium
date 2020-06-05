package Interview_questions.JavaQuestions;

public class Palindrome_String {

    public static void main(String[] args) {

        String str = "level";

        // System.out.println(isPalindrome1(str));
        //  isPalindrome2("str");
        isPalindrome3(str);
        // System.out.println(isPalindromeWithCharAt(str));
    }

    public static boolean isPalindrome1(String str){
        if(str == null)
            return  false;

        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }


    public static void isPalindrome2(String str){

        String reverse = "";

        for( int i=str.length()-1; i>=0; i--)
            reverse+=str.charAt(i);
        if(reverse.equalsIgnoreCase(str))
            System.out.println("this isa palindrome");
        else
            System.out.println("this is not a palindrome");

    }

    public static void isPalindrome3(String str){ // rebootcamp

        boolean check = true;
        for(int i=0; i<str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                check=false;
                break;
            }
        }
        System.out.println( check ? "Palindrome" : "Not Palindrome");
        /*
        if(check){
       System.out.println("Palindrome");
       }else{
       System.out.println("Not Palindrome");
         */
    }

    public static boolean isPalindromeWithCharAt(String str){
        int head = 0;
        int tail = str.length()-1;
        while(head < tail){
            if(str.charAt(head) != str.charAt(tail)){
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }
}
