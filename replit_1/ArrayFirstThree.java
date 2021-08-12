public class ArrayFirstThree {
    public static void main(String[] args) {
        /*
        The code provided in your main method will take in five Strings and save them into an
        array called arr. Print out the first three letter of each element on seperate lines.
         You can assume that every element of arr is at least 3 letters long.
Example:
arr -> ["hello", "how", "are", "you", "doing"]
Output:
hel
how
are
you
doi
         */
String[] arr={"hello","how","are","you","doing"};

        for (int i = 0; i <5 ; i++) {
            String each = arr[i];


            System.out.println(each.substring(0,3));
        }

    }
}
