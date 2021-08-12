public class ArrayTemperatture {
    public static void main(String[] args) {
        /*
        Given an array temps with temperature values find and print the average value
Example:
input: 80 88 88 84 82 78 60 68
output: 78.5
         */
        double[] temps={80, 88, 88, 84, 82, 78, 60, 68};
        int sum=0;

        for (double element:temps) {
            sum += element;
        }
        double average = (double)sum / temps.length;
        System.out.println(sum);
        System.out.println(average);
    }
}
