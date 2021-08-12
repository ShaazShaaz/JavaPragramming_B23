package Day25;

public class UniqueElements {
    public static void main(String[] args) {
        /*
        write a program that can print the unique elements from an array of string
            Ex:
                {"java", "java", "python", "c#"}
         */

        String[] words={"java", "java", "python", "c#"};

        for (String each:words) {

            int count = 0;
            for (String word : words) {
                if (word.equals(each)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);
            }
        }
    }
}
