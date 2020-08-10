package Interview_questions.JavaQuestions;


import java.util.ArrayList;
import java.util.Arrays;

public class IsFourLetters_kubra {

    public static void main(String[] args) {
        String[] arr = {"domates", "biber", "sala", "kapa"};
        isFourLetters1(arr);
        System.out.println(isFourLetters2(arr));
    }

    public static void isFourLetters1(String[] arr) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == 4) {
                System.out.print(list.get(i) + " ");
            }
        }
        System.out.println();
    }

    public static String isFourLetters2(String[] arr) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == 4) {
                    result += list.get(i) + " ";
                }
            }
            return result;
        }
    }







