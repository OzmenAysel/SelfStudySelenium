package Interview_questions.JavaQuestions;
// Naveen
public class Factorial {

    public static void main(String[] args) {
        // 1=1   fac(0)=1 (always)
        //   System.out.println(factorial1(0)); // 1
        //  System.out.println(factorial1(5)); // 120
        //  System.out.println(factorial2(5)); // 120

    }

    public static int factorial1(int num){
        int fac = 1;
        if(fac == 0)
            return 1;
        else {
            for (int i = 1; i <= num; i++) {
                fac = fac * i;  // 1*2*3*4*5
            }
        }
        return fac;
    }

    public static int factorial2(int num){
        if(num == 0)
            return 1;
        else
        return (num*factorial2(num-1));
    }
}
