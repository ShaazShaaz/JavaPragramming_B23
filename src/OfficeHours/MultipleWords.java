package OfficeHours;

import java.util.Arrays;

public class MultipleWords {
    public static void main(String[] args) {
        /*
         Write a program that accepts string and prints multiple words in the string
        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”
        output : wooden spoons
                 trash can
                  dish washer
         */
        String words="knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";

        // first split by ", " and convert to a string array
        // run for loop and if contains " "
        String[] split= words.split(", ");
        for (int i=0;i< split.length;i++) {
            System.out.println(Arrays.toString(split));

            if (split[i].contains(" ")){

            }

        }
    }
}
