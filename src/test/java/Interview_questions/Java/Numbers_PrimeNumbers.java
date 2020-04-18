package Interview_questions.Java;

public class Numbers_PrimeNumbers {

//    Write a method that can check if a number is prime or not

    public static void main(String[] args) {
        System.out.println(primeNumber(17));
    }

//    Solution:

    public static boolean primeNumber(int num) {
        boolean result = false;
        if(num <= 1) {
            return result;
        }
        for(int i = 2; i < num; i++) {
            if(num % i == 0 ) {
                return true;
            }
        }
        return result;
    }

    //Fatma h
    /*
        public static boolean primeNumber(int num) {
        if(num <= 1) {
            return false;
        }
        for(int i = 2; i < num; i++) {//2,3,4,5,6,7...10
            if(num % i == 0 ) {

            return false;

            }
        }

        return true;
    }
     */
}
