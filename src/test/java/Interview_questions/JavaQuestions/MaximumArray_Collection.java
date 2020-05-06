package Interview_questions.JavaQuestions;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Albert

public class MaximumArray_Collection {

    public static void main(String[] args) {

        Integer[] numbers = {4,3,2,12,54,34,88};
        System.out.println(returnMax1(numbers,7));
        System.out.println(returnMax2(numbers,7));
    }

    public static int returnMax1(Integer[] numbers, int total){
        List<Integer> list = Arrays.asList(numbers);
        Collections.sort(list);
        int max = list.get(total-1);
        return max;
    }

    public static int returnMax2(Integer[] numbers, int total){
        List<Integer> list = Arrays.asList(numbers);
        Collections.sort(list);
        int max = list.get(total-1);
        return max;
    }

}
