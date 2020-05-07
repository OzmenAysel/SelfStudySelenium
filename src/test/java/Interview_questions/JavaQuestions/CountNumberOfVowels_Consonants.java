package Interview_questions.JavaQuestions;

//Albert

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountNumberOfVowels_Consonants {

    public static void main(String[] args) {
        String str = "Aysel Dalcicek";
        System.out.println(numberOfVowels(str));
    }

    public static String numberOfVowels(String str){
        int countVowels = 0;
        int countConsonants = 0;
        List<Character> vowels = Arrays.asList('a','e','i','o','u');
        List<Character> consonants = new ArrayList<>();
        str = str.replaceAll(" ", "");

        for(char i = 'a'; i<= 'z'; i++){
            if(!vowels.contains(i)){
                consonants.add(i);
            }
            str = str.toLowerCase();
        }
        for(int i = 0; i<str.length(); i++){
            if(vowels.contains(str.charAt(i))){
                countVowels++;
            }else {
                countConsonants++;
            }
        }
        return "number of vowels is "+ countVowels + " and number of consonants is "+ countConsonants;
    }
}
