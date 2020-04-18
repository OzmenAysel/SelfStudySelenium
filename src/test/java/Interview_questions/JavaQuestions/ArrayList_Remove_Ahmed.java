package Interview_questions.JavaQuestions;

import java.util.*;

public class ArrayList_Remove_Ahmed {

    /*
	 Given a list of people' names: "Ahmed", "John", "Eric", "Ahmed".....
	 Write a java operation to remove all the names named Ahmed
	 */

    public static void main(String[] args) {

//        ArrayList<String> names = new ArrayList<String >();
//        names.add("Ahmet");
//        names.add("John");
//        names.add("Eric");
//        names.add("Ahmed");
//        System.out.println(names);
//        //OR

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        // Solution 1:
        names.removeAll(Arrays.asList("Ahmed"));
        System.out.println("names " + names);

//        // Hakan Abi 1
//        // ConcurrentModificationException
//        // Iterator is the legit way to remove from list
//        ArrayList<String> names1 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
//        for(String each : names1 ){
//            if(each.equals("Ahmed"))
//                names1.remove(each);
//        }
//        System.out.println("names1 "+names1);


//      // Hakan Abi 2
        ArrayList<String> names1 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        ArrayList<String> newNames = new ArrayList<String>();

        for (String each : names1) {
            if (!each.equals("Ahmed"))
                newNames.add(each);
        }
        System.out.println("newNames " + newNames);


        // Hakan Abi Iterator
        ArrayList<String> names2 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
       // List<String> names6 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));  // Bu da olabilir. One of the Muhtar's solution

        Iterator itr = names2.iterator();

        while (itr.hasNext()) {
            if (itr.next().equals("Ahmed"))
                itr.remove();
        }
        System.out.println("names2 " + names2);


        // Solution 2:
        List<String> names3 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

        for (ListIterator<String> it = names3.listIterator(); it.hasNext(); )
            if (it.next().equals("Ahmed"))
                it.remove();
        System.out.println("names3 " + names3);


        // Solution 3:
        List<String> names4 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        List<String> names5 = new ArrayList<>();
        names4.forEach(p -> {
            if (!p.equals("Ahmed")) names5.add(p);
        });
        System.out.println(names5);


        // Solution 4:
    }
    }
