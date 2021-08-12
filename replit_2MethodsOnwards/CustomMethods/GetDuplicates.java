package CustomMethods;

public class GetDuplicates {
    /*
    getDup accepts an array and returns an int.
If there is any element is duplicated, the method counts how many of those present in the array.
Example :
getDup(["1","2","aa"',"1"])
returns:2
("1" is duplicated and there are two "1"s so return is 2)
hint:
you will need a nested array the will run on the array we get from the method argument.
inside the nested loop you will need to check if the main array element is equal to the current
     */
    public static void main(String[] args) {
        String[] arr={"1","2","aa","1","2"};
        System.out.println(getDup(arr));
    }
    public static int getDup(String[] r){
        int duplicateCount=0;

       for (String each:r){ // 1 2
           int count=0;
           for (String element:r){ // 1 2 aa 1 ....1
               if (each.equalsIgnoreCase(element)){
                   count++;
               }

           }
           if (count>1){
               duplicateCount++;
           }
       }
       return duplicateCount;



    }
}
