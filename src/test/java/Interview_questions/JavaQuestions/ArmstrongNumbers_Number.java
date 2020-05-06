package Interview_questions.JavaQuestions;

public class ArmstrongNumbers_Number {

//    Write a method that can check if a number is Armstrong  number

    public static void main(String[] args) {
        System.out.println(ArmStrongNumber(370));
        System.out.println(ArmStrongNumber2(370));
        System.out.println(ArmStrongNumber3(370));
        int d=3;
        System.out.println(Math.pow(2, 2));
    }

    public  static  boolean ArmStrongNumber(int  num) {//153 => 27+125+1=153
      int a = 0, b = 0, c = num;
      while (num > 0) {//0
          a = num % 10;//1
          num /= 10;//0
          b = b + (a * a * a);//152+1=153
      }
      if (c == b) {
          return true;
      }
      return false;
    }

        //Fatma hoca
        public static boolean ArmStrongNumber2( int num){
            int sum = 0;
            int temp = num;
            while (num > 0) {//0
                sum += Math.pow(num % 10, 3);//(1,3)==>1 //(7,3)==>343 //(3,3)==>27
                //1+343+27=371
                num /= 10;//0
            }
            if (sum == temp) {
                return true;
            }
            return false;
        }

    public  static  boolean ArmStrongNumber3(int  num) {
        int sum = 0, digit = 0, temp = num;
        while (temp > 0) {
            digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }
        if (num == sum) {
            return true;
        }
        return false;
    }


    }
