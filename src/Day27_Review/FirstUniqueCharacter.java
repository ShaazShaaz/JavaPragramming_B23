package Day27_Review;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        /*
        write the first unique character from the string
         */
        String str="aaab cccdd efggggh";
        //indexOf('a')==>0
        //lastIndexOf('a')==>2

        // if the indexOf == lastIndexOf, then we cn assume that the character is unique
        /* we can retrieve the characters by for loop also
        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);
        }
         */
        for (char each:str.replace(" ","").toCharArray()) {
            // we have to convert string into an array in order to use for each
            if (str.indexOf(each)==str.lastIndexOf(each)){
                System.out.print(each);
                break;  // if we don't break after 1st loop, it will retrieve all the unique characters


            }

        }




    }
}
