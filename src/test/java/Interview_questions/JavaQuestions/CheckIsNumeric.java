package Interview_questions.JavaQuestions;
// Naveen
public class CheckIsNumeric {

    // How to verify if the String contains only digits

    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    public static boolean isNumeric(CharSequence cs){
        if(isEmpty(cs)){
            return false;
        }

        int len = cs.length();
        for(int i =0; i<len; i++){
            if(!Character.isDigit(cs.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isNumeric(null));  // false
        System.out.println(isNumeric(""));  // false
        System.out.println(isNumeric(" "));  // false
        System.out.println(isNumeric("1"));  // true
        System.out.println(isNumeric("Aysel"));  // false
        System.out.println(isNumeric("1690"));  // true
        System.out.println(isNumeric("Aysel89"));  // false
        // Unicode also return as true
    }
}
