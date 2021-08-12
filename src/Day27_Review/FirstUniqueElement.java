package Day27_Review;

public class FirstUniqueElement {
    public static void main(String[] args) {
        /*
         // INTERVIEW TASK.
        // write a program that can return the 1st unique element in the array
        we cn use either for loop or for each loop
        for(int element:array){
        frequency=0;
        for(int each:array){
        if(element==each){
        frequency++;
        }
        }
        if(frequency==1){
        firstUniqueElement=each;
        break;
        }
         */
        int[] array={1,1,2,3,3,4};
        int firstUniqueElement=0;
        //outer loop to repeat the inner loop and find indexes of the comparing element
        for (int j = 0; j < array.length; j++) {

        int frequency=0;
        for (int i = 0; i <array.length ; i++) { // inner loop to find the frequency of 1 element
            if (array[i] == array[j]) {
                frequency++;
            }
        }
        if (frequency==1){
            firstUniqueElement=array[j];
            break;// to exit the loop and find 1st unique element otherwise it last unique element
            // will be assigned

        }

        }
        // to print all unique elements, we can sout=> array[j] instead of assigning it to firstUnique
        System.out.println(firstUniqueElement);


    }
}
