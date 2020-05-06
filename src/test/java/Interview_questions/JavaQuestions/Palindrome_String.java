package Interview_questions.JavaQuestions;

public class Palindrome_String {

    public static void main(String[] args) {

        String str = "level";
        isPalindrome2("str");
        System.out.println(isPalindrome(str));
        System.out.println(isPalindromeWithCharAt(str));
    }

    public static boolean isPalindrome(String str){
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
            System.out.println(true);
        else
            System.out.println("this is not a palindrome");

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
