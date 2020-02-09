package Interview_questions.Java;

import java.sql.SQLOutput;

public class Numbers_SwapNumbers {


    public static void main(String[] args) {

        //solution 1:
        int a = 10;
        int b = 20;

        a = a + b; //30   10+20
        b = a - b; //10   30-20
        a = a - b; //10   30-10

        System.out.println("a is :" + a);
        System.out.println("b is :" + b);


        //solution 1:
        int A = 10;
        int B = 20;

        A = A ^ B;
        B = A ^ B;
        A = A ^ B;

        System.out.println("A is :" + A);
        System.out.println("B is :" + B);
    }
}
