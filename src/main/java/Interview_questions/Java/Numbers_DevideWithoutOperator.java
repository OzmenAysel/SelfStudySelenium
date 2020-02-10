package Interview_questions.Java;

public class Numbers_DevideWithoutOperator {

	// Write a method that can divide two numbers without using division operator

    public static void main(String[] args) {
        devide(40,12);
        devide(10,2);
        devide(10,3);
    }

    // Solution:
    public static void devide(int num1, int num2){
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
}
