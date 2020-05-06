package Interview_questions.JavaQuestions;

// Naveen

public class MissingNumber_Array {

    public static void main(String[] args) {

        int[] number = {-1,0,1,2,3,4,6,7,8,9,10};  // It should be sequence
        System.out.println(missingNum(number));
    }

    public static int missingNum(int[] arr){
        int sum1 = 0;
        for(int i=0; i<arr.length; i++){
            sum1 += arr[i];
        }
        int sum2 = 0;
        for(int j=-1; j<=10; j++) {
            sum2 += j;
        }
        return (sum2-sum1);
    }
}
