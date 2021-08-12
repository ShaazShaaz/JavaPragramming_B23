package CustomMethods;

public class FrequencyOsString {
    /*
    Create a method that has two parameters of an array of strings and a string and should returns an int.
It counts how many times the given string appears in the array and returns the count.
for example (pseudo code):
array = ["a","foo","bar","foo","bla"]
string = "foo"
countAppearance(array , string ) -> 2
     */
    public static void main(String[] args) {
        String[] array={"Java","Java","Shazia"};
        int result=countOfAppearance(array,"Java");
        System.out.println(result);
    }



    public static int countOfAppearance(String[] arr,String t ){
        int frequency=0;
        for (String each:arr){

                if (each.equalsIgnoreCase(t)){
                    frequency++;

            }
        }
return frequency;
    }






}
