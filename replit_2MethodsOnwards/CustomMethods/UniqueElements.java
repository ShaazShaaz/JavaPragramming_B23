package CustomMethods;

public class UniqueElements {
    /*
    Write a void method printUniqueNumbers that will print unique numbers from an array of ints.`
Example:
input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
output:
2
9
34
     */
    public static void main(String[] args) {
        int[] arr={2,5,5,6,3,6,9,34,3};
        printUniqueNumbers(arr);
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
