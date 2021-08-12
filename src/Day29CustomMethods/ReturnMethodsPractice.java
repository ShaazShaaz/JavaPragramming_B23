package Day29CustomMethods;

public class ReturnMethodsPractice {

    public static void main(String[] args) {
        int max=max(10,20);
        int min=min(30,10);
        int result2=min*2; // re-use the method
        int result=max*2;
        System.out.println(result);
        System.out.println(result2);
        System.out.println("---------------------------------");
        int[] arr1={1,2,300,43};
        int maximum=arr1[0];
        for (int each:arr1){
             maximum=max(each,maximum); // re-use the method
        }
        System.out.println(maximum);

        int[] array={3,2,4,8,10};
        int minimum=array[0];
        for (int each:array){
            minimum=min(each,minimum);
        }
        System.out.println(minimum);

    }
    /*
    create a method to return the maximum number between 2 numbers and then multiply it by 2
     */

    public static int max(int a,int b){
        int max=0;
        if (a>b){
            max=a;
        }else {
            max=b;
        }

       return max;  // no if statement just >> return (a>b)?a:b;
    }

    /*
    create a return method that can return max num from the array
    create a return method to return min num from the array
     */
    public static int min(int x,int y){
    int min=0;
    if (x<y){
        min=x;
    }else {
        min=y;
    }
    return min;
}





}
