package Interview_questions.Java;

public class Numbers_odd_even {

    //Write  a method which can identifies given number is even or odd
    public static void main(String[] args) {

        System.out.println(OddEven(8));
        System.out.println(OddEven(5));

        System.out.println(OddEven2(6));


    }

    public static String OddEven(int n){
        String result = "";
        if(n%2==0){
            result="even";
        }else if(n%2==1){
            result="odd";
        }
        return result;
    }

    public static String OddEven2(int n){
        return n%2==0 ? "even" : "odd" ;
    }

}
