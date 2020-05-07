package Interview_questions.JavaQuestions;

// Albert

public class RemoveExstraSpace_String {

    public static void main(String[] args) {
        String str = "Try  to     remove   extra     spaces.";
        removeExtraSpaces(str);
    }

    public static void removeExtraSpaces(String str){
      String result = str;
      while (result.contains("  ")){ // two spaces
          result = result.replace("  ", " ");  // first must be two spaces second one space
      }
        System.out.println(str);
        System.out.println(result);  // Try to remove extra spaces.
    }
}
