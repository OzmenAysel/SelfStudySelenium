package Interview_questions.JavaQuestions;

public class SwapNumbers {


    public static void main(String[] args) {
        //solution 1:
        int a = 5;
        int b = 10;

        // 1.Using + operator
//        a = a + b; //a=15
//        b = a - b; //b=5
//        a = a - b; //a=10
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

        // 2.Using * operator  (Naveen)
//        a = a * b; // 50
//        b = a / b; // 5
//        a = a / b; // 10
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

        // 3.Using XOR: ^   means 0101 format  5 = 0101  10 = 1010
//        a = a ^ b; // 15 --> 1111
//        b = a ^ b; // 10 --> 1010
//        a = a ^ b; // 5 --> 0101
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);


        // 4.Using third variable
//        int temp =a+b;
//        a=temp-a;
//        b=temp-a;
//        System.out.println("a is " + a);
//        System.out.println("b is " + b);

        // 5.Using third variable (Hakan Abi)
//        int temp = a;
//        a=b;
//        b=temp;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

        // 6.Seyfo
        a += b - (b=a);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
