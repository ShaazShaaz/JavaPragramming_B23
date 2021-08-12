package Day25;

import java.util.Arrays;

public class ReverseElements {
    public static void main(String[] args) {
        /*
         write a program that can  reverse each elements in an array of string
        Ex:
            array = {"Java", "Python", "C#"}
            output:
                ["avaJ", "nohtyP", "#C"]
                NEEDS NESTED LOOP. FIRST REVERSE THE CHARS OF FIRST ELEMENT,
                THEN ADD NESTED LOOP TO REPEAT FOR REST OF THE ELEMENTS
         */

        String[] array = {"Java", "Python", "C#"};

        for (int j=0;j<array.length;j++) {//
            String element = array[j];  // element of the array starting from 0
            String reverse = ""; //  to store the reversed version of the element

            for (int i = element.length() - 1; i >= 0; i--) {
                reverse += element.charAt(i);
                // INNER LOOP IS RESPONSIBLE FOR REVERSING THE STRING
            }
            array[j] = reverse;  // assigning reversed element to the index of the array

        }
        System.out.println(Arrays.toString(array));
    }
}
// write a program that can count the number of palindromes are in the array
// ex: {"anna", "level","Java"};
//output: 2     DO NOT CHANGE THE ELEMENTS