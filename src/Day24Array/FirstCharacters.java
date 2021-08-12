package Day24Array;

import java.util.Arrays;

public class FirstCharacters {
    public static void main(String[] args) {
        /*
        create string array, and store the names of your  class mates (10)
            print the first three characters of each name
         */
       String[] classNames={"SHazia","Chala","Toray","Yulia","Alexandria","Victoria","Faluk", "Ozden","Beryl","Hilal"} ;
       System.out.println(Arrays.toString(classNames));
        for (int i = 0; i <classNames.length ; i++) {
            //String each=classNames[i];
            System.out.println(classNames[i].substring(0,3));
        }

    }
}
