package day40_CustomClassStatic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class MovieMain {
    public static void main(String[] args) {
        /*
         title: Journey to SDET: Cybertek Batch 23
                    country: USA
                    Genre: Adventure, Comedy, Thriller, Horror
                    release date: May/17/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Mehmet, Akbar and 5 more students from your group
            print the full info of the movie
         */
        Movie movie1=new Movie();
        movie1.setInfo("Journey to SDET: Cybertek Batch 23","USA","Adventure, Comedy" ,
                "Kuzzat Altay", LocalDate.of(2021,5,17));

        String[] casts={"Mehmet","Akbar"};
        movie1.addCast("Asiya");
        movie1.addCast(casts);

        ArrayList<String> students=new ArrayList<>();
        students.addAll(Arrays.asList("Dilem","Ahmet","Tugba","Shazia"));
        movie1.addCast(students);

        System.out.println(movie1);




    }
}
