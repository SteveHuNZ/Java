package stringArray;

import java.util.AbstractList;
import java.util.ArrayList;

public class move {
    public static void main(String[] args) {
        //define a movie class
        //define an Arraylist collection to store these object
        ArrayList<Movie> movies = new ArrayList< >();
        //create  object to obtain movie information and then put these in the collection;

        movies.add(new Movie("william",9,"william "));
        movies.add(new Movie("kai",8,"mat "));
        movies.add(new Movie("wil",7,"wia "));
        //traversal the collection and display all the objects
        System.out.println(movies);
        for (int i = 0; i < movies.size(); i++) {
            Movie movie= movies.get(i);
            System.out.println("name:"+ movie.getName());
            System.out.println("score:"+ movie.getScore());
            System.out.println("actor:"+ movie.getActor());

        }
    }
}
