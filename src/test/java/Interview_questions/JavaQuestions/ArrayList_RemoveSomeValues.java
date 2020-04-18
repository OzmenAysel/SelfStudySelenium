package Interview_questions.JavaQuestions;

import java.util.*;

public class ArrayList_RemoveSomeValues {

    // Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

    public static void main(String[] args) {

        // Solution 1:
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));
        ArrayList<Integer> myList = new ArrayList<>();
        for (Integer each : list1) {
            if (each < 100) {
                myList.add(each);
            }
        }
        list1 = myList;
        System.out.println("list1 " + list1);


        // Solution 2:
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));
        Iterator<Integer> it = list2.iterator();
        while (it.hasNext())
            if (it.next() > 100)
                it.remove();
        System.out.println("list2 " + list2);


        // Solution 3:
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));

        for (ListIterator<Integer> li = list3.listIterator(); li.hasNext(); )

            if (li.next() > 100)
                li.remove();
        System.out.println("list3 " + list3);


        // Solution 4:  Iterator
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));
        Iterator<Integer> itr = list4.iterator();

        while (itr.hasNext()) {
            if (itr.next() > 100)
                itr.remove();
        }
        System.out.println("list4 " + list4);


        // Solution 5:  Copying another list
        ArrayList<Integer> myList2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));
        ArrayList<Integer> list5 = new ArrayList<>();

        for (int each : myList) {
            if (each <= 100)
                list5.add(each);
        }
        System.out.println("list5 " + list5);


        // Solution 6:
        ArrayList<Integer> list6 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));

        list6.removeIf(p -> p > 100);
        System.out.println("list6 "+list6);

    }






}
