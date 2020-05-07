package Interview_questions.JavaQuestions;

import java.util.Arrays;

public class Convert_StringToString {

    // How do you convert this string "CBA534FDE" to this "ABC345DEF" ?

    public static void main(String[] args) {
        String word = "CBA534FDE";
        char[] arr = word.toCharArray();
        Arrays.sort(arr);

        String characters = "";
        String numbers = "";

        for(int i = 0; i < word.length(); i++){
            if(arr[i] >= 65){
                characters += arr[i];
            }else{
                numbers += arr[i];
            }
        }
        String result = characters.substring(0,3) + numbers + characters.substring(3);
        System.out.println(result);

    }
    }
