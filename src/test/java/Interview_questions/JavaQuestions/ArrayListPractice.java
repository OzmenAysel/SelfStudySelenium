package Interview_questions.JavaQuestions;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {

    //Initialize with add() method
    //Initialize with asList() method
    //Initialize with another ArrayList


    public static void main(String[] args) {

        // add() method
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Java");
        list1.add("Groovy");
        list1.add("Scala");

        //asList() method
        List<String> list2 = Arrays.asList("Java", "Groovy", "Scala");
        ArrayList<String> list3 = new ArrayList<String>(list2);


        System.out.println("===============================");
        // How to convert list to array in Java?
        // ArrayListName.toArray(array name)

        List<String> movies = Arrays.asList("Captain", "Avatar", "Harry Potter");
        String[] arrayOfMovies = new String[movies.size()];
        movies.toArray(arrayOfMovies);

        System.out.println("list of String"+ movies);   //[Captain, Avatar, Harry Potter]
        System.out.println("array of String"+ Arrays.toString(arrayOfMovies)); //[Captain, Avatar, Harry Potter]


        System.out.println("===============================");
        // How to loop over ArrayList in Java?

        ArrayList<String> games = new ArrayList<String>();
        games.add("Cricket");
        games.add("Soccer");
        games.add("Hockey");
        games.add("Chess");

        for(String each: games){
            System.out.println(each);
        }
        System.out.println("------------");

        for (int i=0; i<games.size(); i++){
            System.out.println(games.get(i));
        }
    }
}