package Interview_questions.JavaQuestions;

public class Numbers_odd_even {

    //Write  a method which can identifies given number is even or odd
    public static void main(String[] args) {

        int num = 5 ;

        System.out.println(OddEven(num));
        System.out.println(OddEven2(num));

//Hakan Abi solution
        String result = num%2==0 ? "Even" : "Odd";
        System.out.println(result);
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
