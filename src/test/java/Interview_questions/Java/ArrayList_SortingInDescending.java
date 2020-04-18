package Interview_questions.Java;

import java.util.List;

public class ArrayList_SortingInDescending {

   // Write a method that can sort the ArrayList in descending order without using the sort method



   // Solution:

    public static void SortingArrayListDesc(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) > list.get(j)) {

                    Integer temp = list.get(i);

                    list.set(i, list.get(j));

                    list.set(j, temp);

                }

            }

        }

    }
}
