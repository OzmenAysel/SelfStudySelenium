package Interview_questions.JavaQuestions;

public class Fibonacci {

    public static void main(String[] args) {

        Fibonacci(8);  // 0+1=1 1+2=3 2+3=5 5+3=8 8+5=13 13+8=21
                                                // 0 1 1 2 3 5 8 13 21
    }                                           //   a b c
                                                //     a b c

    public static void Fibonacci(int num) {

        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 0; i <= num; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
