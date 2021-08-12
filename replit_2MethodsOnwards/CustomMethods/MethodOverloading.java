package CustomMethods;

public class MethodOverloading {
    /*
    In this task, you need to write 2 overloaded methods findMax() that will find a
     maximum number in the array. First version should work with array of integers (int[])
     and return int, and second method should work with an array of doubles (double[])
     and return double as a result.
Methods must have the same name and different parameters.
     */
    public static void main(String[] args) {
        int[] arr={2,3,4,50,6};
        System.out.println(findMax(arr));

        double[] arr2={2.5,3,4.6,59.7,60};
        System.out.println(findMax(arr2));
    }




    public static int findMax(int[] array1){
      int max=0;
      for (int each:array1){
         if (each>max){
                  max=each;
              }
          }

      return max;
    }
    public static double findMax(double[] array1) {
        double max = 0;
        for (double each : array1) {

                if (each > max) {
                    max = each;
                }
            }

        return max;
    }
}
