package Interview_questions.JavaQuestions;

public class DevideWithoutOperator_Number {

	// Write a method that can divide two numbers without using division operator

    public static void main(String[] args) {
        divide1(2,12);
        divide2(2,12);
        System.out.println("divide3 method: "+divide3(2,12));
        System.out.println("divide3 method: "+divide3(12,2));
    }

    // Solution:
    public static void divide1(int num1, int num2){
       if(num2==0){
           System.out.println("Invalid Number");
       }
        System.out.println(num1+" devide by "+num2+" is: ");

       int count = 0;
       while(num1>=num2){
           num1-=num2;
           count++;
       }
        System.out.println(count+" and remainder is "+num1);
    }

    public static void divide2(int num1, int num2){
        int result = 0;
        if(num2==0) {
            System.out.println("Cannot divide by zero!");
        }else if(num1<num2){
            System.out.println(num1+" Cannot be divided by "+num2);
        }else {
            while (num1 >= num2) {
                num1 -= num2;
                result++;
            }
            System.out.println(result + " with a remainder of " + num1);
        }
    }

         public static String divide3(int divident, int divisor) {  // Albert
            int quotient = 0;
            int remainder =0;
            while(divident >= divisor){
                divident = divident - divisor;
                quotient++;
                remainder = divident;
            }
        return "quotient = " + quotient + " remainder = " + remainder;
         }
}
