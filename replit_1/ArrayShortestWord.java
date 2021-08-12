public class ArrayShortestWord {
    public static void main(String[] args) {
        /*
        Write a program that will print the shortest word in the given array str.
input: java, cable, red, vivid, remedy, grace
output: red
         */
        String[] str = {"java", "cable", "red", "vivid", "remedy", "grace"};
        String shortest = str[0];
        for (String each : str) {
                if (each.length() < shortest.length()) {
                    shortest = each;
                }
            }
        System.out.println(shortest);
    }
}
