package Interview_questions.JavaQuestions;

public class PrimeNumbers {

    // Write a method that can check if a number is prime or not
    // 2 is the lowest prime number. Any negative (-) is not a prime number.
    public static void main(String[] args) {

        System.out.println(primeNumber(17)); // True
        System.out.println(primeNumber(15)); // False

        getPrimeNum( 13 );  // 2 3 5 7 11

        System.out.println();
        System.out.println(countPrimeNum(13)); // 5
    }

    public static boolean primeNumber(int num) {
        if(num <= 1) {
            return false;
        }
        int count = 0;
        for(int i = 2; i < num; i++) {
            if(num % i == 0 ) {
                return false;
            }
        }
        return true;
    }

    public static void getPrimeNum(int num ){  // Naveen
        System.out.println("prime number upto "+num);
        for(int i = 2; i < num; i++) {  // //2,3,4,5,6,7...10
            if(primeNumber(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static int countPrimeNum(int num ){  // me :)
        System.out.println("count prime number upto "+num);
        int count =0;
        for(int i = 2; i < num; i++) {
            if(primeNumber(i)){
                count++;
            }
        }
        return count;
    }

}
