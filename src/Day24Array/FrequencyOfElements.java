package Day24Array;

public class FrequencyOfElements {
    public static void main(String[] args) {
        /*
        write a program that can print out the unique numbers from an array of integers
        Ex:
            int[] arr ={1,1,2,3,3,4}
            output:
                2 4
         */
        int[] arr = {1, 1, 2, 3, 3, 4, 6};
        for (int i = 0; i <=arr.length-1 ; i++) {
            int element=arr[i];
            int count=0;
            for (int j=0;j<=arr.length-1;j++){
                if (arr[j]==element){
                    count++;
                }
            }
            if (count==1){
                System.out.println(element);
            }
        }









    }
}


