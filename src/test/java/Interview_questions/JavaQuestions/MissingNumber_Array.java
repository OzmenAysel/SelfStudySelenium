package Interview_questions.JavaQuestions;

// Naveen

public class MissingNumber_Array {

    public static void main(String[] args) {

      //  int[] number = {-1,0,1,2,3,4,6,7,8,9,10};  // It should be sequence
        //  It should be  --> (int j=-1; j<=10; j++)
        int[] number = {1,2,4,5};
        System.out.println(missingNum(number));

        // 1+2+4+5=12
        // 1+2+3+4+5= 15
        // 15-12 = 33 --> It is the missing number
    }

    public static int missingNum(int[] arr){
        int sum1 = 0;
        for(int i=0; i<arr.length; i++){
            sum1 += arr[i];  // 1+2+4+5=12
        }
        System.out.println(sum1);
        int sum2 = 0;
        for(int j=1; j<=5; j++) {  // 1 den 5 e kadar sayilari toplar
            sum2 += j;  // 1+2+3+4+5= 15
        }
        System.out.println(sum2);
        return (sum2-sum1);
    }
}
