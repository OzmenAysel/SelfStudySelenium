package Interview_questions.JavaQuestions;

// Albert

public class Palindrome_BiggestPalindrome {

    public static void main(String[] args) {
        String str = "Strawwarts"; //AToyotasaToyota // level
        System.out.println(biggestPalindrome(str));
    }

    public static String biggestPalindrome(String str){
        str = str.toLowerCase();
        String biggestPalindrome = "";
        String[] arr = str.split(" ");

        for(String each : arr){
            String reverse = "";
            for(int i = each.length() -1; i >= 0; i--){
                reverse += each.charAt(i);
            }
            if( each.equals(reverse) && each.length() > biggestPalindrome.length() ){
                biggestPalindrome = each;
                return biggestPalindrome;
            }
            }
        return "The String is not a palindrome";
    }
}
