package Day20;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String sentence="C# C# C# C# C#";  // "C#" - 2 characters
        int count=0;
        // to create multiple substrings to get each 6 character word use for loop
        for (int i = 0; i <=sentence.length()-2 ; i++) {
            String each = sentence.substring(i, i + 2);
            //                0, 6
            //                1,7    these steps will be repeated
            if (each.equals("C#")) {  //if
                count++;  // increase the count by 1
            }
            System.out.println(each);
        }


            System.out.println(count);




    }
}
