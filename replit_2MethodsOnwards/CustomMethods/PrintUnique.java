package CustomMethods;

public class PrintUnique {
    /*
    Complete a void method printUniqueNumbers() that will print all unique numbers from an array
     of ints. Every single unique int should be printed from the new line.
`Example:`
`input:[2, 5, 5, 6, 3, 6, 9, 34, 3]`
`output:`
`2`
`9`
`34`
     */
    public static void main(String[] args) {
        int[] array={1,1,2,3,4,4,5,5,6,7};
        printUniqueNumbers(array);
    }
    public static void printUniqueNumbers(int[] nums){

        for (int each:nums){
            int count=0;
            for (int element:nums){
                if (each==element){
                    count++;
                }
            }
            if (count==1){
                System.out.println(each);
            }
        }
    }
}
