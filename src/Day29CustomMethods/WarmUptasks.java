package Day29CustomMethods;

import java.util.Arrays;

public class WarmUptasks {
    public static void main(String[] args) {
        posNegZero(10);
       int[] numbers={10,20,0,-30,-5};
        for (int each:numbers){
            posNegZero(each);
        }
        System.out.println("--------------------------------");

        int[] arr1={1,2,3,4,5},
        arr2={6,7,8,9};
        merger2Arrays(arr1,arr2);
        System.out.println("--------------------------------");

        formatFullName("cyberTek","schOOL");
        maxNum(20,10);
        System.out.println("--------------------------------");

        int[] arr={3,45,6,1,98,1,17};
        printDescending(arr);

    }

    /*
    create a function that can check if the given integer is positive, negative or zero
2. create a function that can print out the combination of two integer arrays
3.  write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYbErTeK", "SCHOOL");
                output:
                    "Cybertek School"
4. create a function that can print out the maximum number between two numbers
5. create a function that can print out the array of integers in descending order
     */
    public static void posNegZero(int number){
     if (number>0){
         System.out.println(number+" is positive");
     }else if (number<0){
         System.out.println(number+" is negative");
     }else {
         System.out.println(number+" is Zero");
     }

    }

    public static void merger2Arrays(int[] arr1, int[] arr2){
     int[] arr3=new int[arr1.length+arr2.length];
     int i=0;
     for (int number: arr1){
         arr3[i++]=number;
     }
     for (int number:arr2){
         arr3[i++]=number;
     }
        System.out.println(Arrays.toString(arr3));


}

    public static void formatFullName(String firstname,String lastName){
        firstname=firstname.substring(0,1).toUpperCase()+firstname.substring(1).toLowerCase();
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        String fullName=firstname+" "+lastName;
        System.out.println(fullName);
    }

    public static void maxNum(int num1,int num2){

        System.out.println(num1>num2?num1:num2);


    }

    public static void printDescending(int[] arr){
        int[] result=new int[arr.length];
        Arrays.sort(arr);
        for (int i = arr.length-1,j=0; i >=0 ; i--) {  // step used to reverse array
            result[j++]=arr[i];
        }
        System.out.println(Arrays.toString(result));
    }


}
