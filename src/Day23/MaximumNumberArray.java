package Day23;

public class MaximumNumberArray {
    public static void main(String[] args) {
        // write  a program that can find the maximum number and the minimum number from an array of integers
        //e.g  array={10,5,4,400,50,0,-1};
        //     output= 400, -1
        int[] numbers={10,5,4,400,50,0,-1};
        int max=numbers[0];
        int min=numbers[0];
        for (int i = 0; i <=numbers.length-1 ; i++) {
            int each=numbers[i];
            //System.out.println(each);

            if (each>max){   // if any greater num is occurred, it will be assigned to max
              max=each;
            }
            if (each<min){
                min=each;
            }

        }
        System.out.println("max: "+max);
        System.out.println("min: "+min);


    }
}
