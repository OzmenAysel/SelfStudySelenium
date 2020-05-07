package Interview_questions.JavaQuestions;

// Albert

public class BubbleSort {

 // Current element is compared with the next element. If current element is grater than the next element, it is swapped.

    public static void main(String[] args) {
       int[] array = {3,60,35,2,45,320,5};
       bubbleSort(array);
        System.out.println("Array After Bubble Sort");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1]; // swap element
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
