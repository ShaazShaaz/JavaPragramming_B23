public class LoopEven {
    public static void main(String[] args) {
        /*
        Write a for loop that prints all even integers
         from 80 through and including 20. Separate each number with a space
         */
        for (int i = 80; i >=20; i--) {
            if (i%2==0){
                System.out.print(i+" ");
            }

        }

    }
}