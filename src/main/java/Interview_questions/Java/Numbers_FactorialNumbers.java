package Interview_questions.Java;

public class Numbers_FactorialNumbers {
   /* Write a return method that returns the factorial number of any given number
    Ex:
    Input: 5
    outPut: 120
    2!=2*1=2
    3!=3*2*1=6
    4!=4*3*2*1=24
 */
   public static void main(String[] args) {

       System.out.println(factorialNumber(5));
   }
   // Solution:

    public static int factorialNumber(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result = result * i;
        }
        return result;

    }
}
