package Interview_questions.Java;

public class Numbers_SwapNumbers {


    public static void main(String[] args) {

        //solution 1:
        int a = 10;
        int b = 20;

//        a = a + b; //a=30   10+20
//        b = a - b; //b=10   30-20
//        a = a - b; //a=20   30-10
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

        //solution 2:

//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

        //Solution 3:
//        int temp =a+b;
//        a=temp-a;
//        b=temp-a;
//        System.out.println("a is " + a);
//        System.out.println("b is " + b);

        //Hakan Abi:
//        int temp = a;
//        a=b;
//        b=temp;
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

        // Seyfo
        a += b - (b=a);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
