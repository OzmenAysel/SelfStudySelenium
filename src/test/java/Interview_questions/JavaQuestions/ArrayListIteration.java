package Interview_questions.JavaQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

// Naveen
public class ArrayListIteration {
    // DIFFERENT WAYS OF ITERATING AN AArrayList
    public static void main(String[] args) {

        ArrayList<String> family = new ArrayList<String>();
        family.add("Aysel Aysel");
        family.add("Kadir Kadir Kadir");
        family.add("Zeynep Zeynep");
        family.add("Bera Bera Bera Bera");

        System.out.println(family); // [Aysel Aysel, Kadir Kadir Kadir, Zeynep Zeynep, Bera Bera Bera Bera]

        // 1.using java 8 --> for each loop with lambda expression
        System.out.println("======= 1- 1print using for each with lambda expression in java 8 ========");
        family.forEach(each ->{
            System.out.println(each);
        });

        // 2. Using iterator
        System.out.println("======== 2- print using iterator========");
        Iterator<String> it = family.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // 3. Using iterator and java 8 forEachRemaining() method
        System.out.println("======== 3- print using iterator and java 8 forEachRemaining() method========");
        Iterator<String> it2 = family.iterator();
        it2.forEachRemaining(each ->{
            System.out.println(each);
        });

        // 4. Using for each loop
        System.out.println("======== 4- print using for each loop========");
        for(String each: family){
            System.out.println(each);
        }

        // 5. Using for loop wit order/index
        System.out.println("======== 5- print using for loop wit order/index========");
        for(int i=0; i<family.size(); i++){
            System.out.println(family.get(i));
        }

        // 6. Using listIterator() to traverse in both directions
        System.out.println("======== 6- listIterator() to traverse in both directions========");
        ListIterator<String> familyListIterator = family.listIterator(family.size());
        while (familyListIterator.hasPrevious()){
            System.out.println(familyListIterator.previous());
        }
    }
}
