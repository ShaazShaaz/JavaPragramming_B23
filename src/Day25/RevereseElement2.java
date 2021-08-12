package Day25;

import java.util.Arrays;

public class RevereseElement2 {
    public static void main(String[] args) {
        String[] array = {"Java", "Python", "C#"};
        for (String element:array){
            String reverse="";

            for (int i = element.length() - 1; i >= 0; i--) {
                reverse += element.charAt(i);
                // INNER LOOP IS RESPONSIBLE FOR REVERSING THE STRING
            }
            System.out.println(reverse);
        }

    }
}
