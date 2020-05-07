package Interview_questions.JavaQuestions;

//Albert

public class BinarySearch {

    /*
    It finds the position of a target value within a sorted array. Binary search compares the target value to the
    middle element of the array. If it is match then return true, if not you divide it again until you reach.
     */

    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        int key = 30;
        int last = array.length-1;
        binarySearch(array,0,last,key);
    }

    public static void binarySearch(int arr[], int first, int last, int key ){
        int mid = (first + last) / 2;
        while( first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
         if (first > last) {
             System.out.println("Element is not found!");
        }

    }
}
