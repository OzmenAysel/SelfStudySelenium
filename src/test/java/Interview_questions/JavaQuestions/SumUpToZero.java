package Interview_questions.JavaQuestions;

import java.util.Arrays;

public class SumUpToZero {

    public static void main(String[] args) {
            int  number = 6;
            System.out.println(Arrays.toString(sumUpToZero(number)));
        }

        public static int[] sumUpToZero(int num){
            int[] result = new int[num];
            int sum = 0;
            for(int i =0; i<num-1; i++){
                result[i]+=i;
                sum+=i;
            }
            result[num-1]=-sum;

            return result;
        }
}

