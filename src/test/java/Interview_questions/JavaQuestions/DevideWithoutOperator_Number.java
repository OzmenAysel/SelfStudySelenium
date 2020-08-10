package Interview_questions.JavaQuestions;

public class DevideWithoutOperator_Number {

    // Write a method that can divide two numbers without using division operator

    public static void main(String[] args) {
        divide1(2, 12);
        System.out.println("==============================");
        divide2(2, 12);
        System.out.println("===============================");
        divideMySolution(15, 2);
    }

    public static void divideMySolution(int a, int b) {
        if (b == 0) {
            System.out.println("Invalid number");
        }else if(b>a){
            System.out.println(a+" can not divide by "+b);
        }
        int count = 0;
        while (a >= b) {
            a = a - b;
            count++;
        }
        System.out.println(count);
        System.out.println("remainder is " + a);
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
        int count = 0;
        if(num2==0) {
            System.out.println("Cannot divide by zero!");
        }else if(num1<num2){
            System.out.println(num1+" Cannot be divided by "+num2);
        }else {
            while (num1 >= num2) {
                num1 -= num2;
                count++;
            }
            System.out.println(count + " with a remainder of " + num1);
        }
    }


}
