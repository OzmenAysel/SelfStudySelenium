package Interview_questions.JavaQuestions;

public class ArmstrongNumbers_Number {

//    Write a method that can check if a number is Armstrong  number
    // kuplerin toplami

    public static void main(String[] args) {
        System.out.println(ArmStrongNumber1(153));
        System.out.println(ArmStrongNumber2(153));
        System.out.println(ArmStrongNumber3(153));
        System.out.println(ArmStrongNumber4(153));
        int d=3;
        System.out.println(Math.pow(2, 2));
    }

    public  static  boolean ArmStrongNumber1(int num) {//153 => 27+125+1=153
      int a = 0, b = 0, c = num;
      while (num > 0) {//0
          a = num % 10;//1
          num /= 10;//0
          b = b + (a * a * a);  //152+1=153
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

    public static boolean ArmStrongNumber4(int number){
        // 153 --> 1*1*1   5*5*5    3*3*3   Don not forget--> 1 % 10 --> 1  BUT  1 / 10 --> 0
        int cube= 0;
        int remainder =0;
        int t =number;

        while(number > 0 ) {
            remainder = number % 10; // 3  5  1
            number = number / 10;  // 15   1  0
            cube = cube+(remainder*remainder*remainder); // 27  + 125  + 1 = 153
        }
        if(t==cube){
            return true;
        }
        return false;
    }


    }
