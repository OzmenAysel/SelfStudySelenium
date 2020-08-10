package Interview_questions.JavaQuestions;

import java.util.*;

public class SaadetH {
    public static void main(String[] args) {
        //print uniq 1,2,3,3,22,1====>1,2,3,22
//	finduniq();
        TreeSet<Integer> uniq = new TreeSet<>(Arrays.asList(1, 2, 3, 3, 22, 1));
        System.out.println(uniq);
        //generate ordered collection out of the list
//1,4,3,2,22,100
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 3, 2, 22, 100));
        Collections.sort(list);
        System.out.println(list);
        int highest = list.get(list.size() - 1);
        System.out.println(highest);
        int lowest = list.get(0);
        System.out.println(lowest);
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(12);
        list2.add(30);
        list2.add(200);
        list2.add(120);
        list2.add(400);
        list2.remove(3);
        System.out.println(list2);
        Collections.sort(list2);
        List<Integer> viewpart = list2.subList(2, 4);
        System.out.println(list2);
        System.out.println(viewpart);
        System.out.println(viewpart.set(0, 10));
        System.out.println(list2);
        ListIterator<Integer> it = list2.listIterator();
        while (it.hasNext()) {
            int each = it.next();
            if (each > 12) {
                it.set(15);

            }

            System.out.print(each + " ");
        }
        System.out.println(list2);

    }
}

