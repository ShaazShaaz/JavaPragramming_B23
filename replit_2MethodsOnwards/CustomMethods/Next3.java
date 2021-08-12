package CustomMethods;

public class Next3 {
    /*
    Create a method called next3 . This method has an int argument and prints the next
    3 numbers after that number. Call the method from main method and pass num to it.
flow:
enter number
1
next 3 are:
2 3 4
     */
    public static void main(String[] args) {
        next3(1);
    }

    public static void next3(int n){
        for (int i = n+1; i <=n+3; i++) {
            System.out.print(i+" ");
        }
    }
}
