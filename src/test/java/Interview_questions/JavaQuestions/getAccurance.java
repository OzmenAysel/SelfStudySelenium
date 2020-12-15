package Interview_questions.JavaQuestions;

public class getAccurance {

   // Write a method that read a text file and return most occurrence word from the text file.

//    input.txt
//    I am currently working at Experian. It is a great company that experian known for collaboration.
//    I would recommend Experian for any future employee.

//    word2 word2 word2
//    word3 word3 word3

//    get_occurence(input.txt) -> ['experian', 'word2', 'word3']

   public static void main(String[] args) {
       String str = "I am currently working at Experian. It is a great company that experian known for collaboration. I would recommend Experian for any future employee.";
       MostOccurrence(str);
   }
    public static void MostOccurrence(String str) {

        String[] word = str.split("\\s+");
        String result = "";

        for (int i = 0; i < word.length; i++) {
            int count =0;
            for (int j = 0; j < word.length; j++) {
                if (word[j] == word[i]) {
                    count++;
                    result += word[i];
                }
                System.out.println(result);
            }





            //    result = result.replaceAll("\\[" , "");
            //    result = result.replaceAll("\\]", "");
        }
    }
}
