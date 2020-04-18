package Interview_questions.Java;

public class Numbers_ArmstrongNumbers {

//    Write a method that can check if a number is Armstrong  number

    public static void main(String[] args) {

        System.out.println(ArmStrongNumber(153));

        int d=3;
        System.out.println(Math.pow(2, 2));

    }

//    Solution:

    public  static  boolean ArmStrongNumber (int  num) {

        int a = 0,    b =0,    c= num;

        while(num>0){
            a=num%10;
            num/=10;
            b=b+(a*a*a);
        }
        if(c==b) {
            return true;
        }
        return false;
    }

    //Fatma hoca
    /*

    public static boolean ArmStrongNumber(int num) {//153 => 27+125+1=153
//      int a = 0, b = 0, c = num;
//      while (num > 0) {//0
//          a = num % 10;//1
//          num /= 10;//0
//          b = b + (a * a * a);//152+1=153
//      }
//      if (c == b) {
//          return true;
//      }
//      return false;

        int sum = 0;
        int temp = num;
        while(num >0) {//0
            sum += Math.pow(num%10, 3);//(1,3)==>1 //(7,3)==>343 //(3,3)==>27
            //1+343+27=371
            num /= 10;//0
        }
        if(sum == temp) {
            return true;
        }
        return false;
    }
}
     */

}
