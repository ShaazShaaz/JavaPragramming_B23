package Day19;

public class ForLoopPractice2 {
    public static void main(String[] args) {
        // from A~Z
        for (int i=65;i<=90;i++){
            System.out.print((char)i+" ");
        }
        System.out.println();
        System.out.println("---------------");

        for (char i='A';i<='Z';i++){
            System.out.print(i+" ");
        }
        System.out.println();
        // for backwards
        for (char i='Z';i>='A';i--){
            System.out.print(i+" ");
        }
        System.out.println();
        // for lowercase backwards
        for (char i='z';i>='a';i--) {
            System.out.print(i + " ");
        }
        // print the characters from 1000~3000 in same line separated by a space

        for (char i=20;i<=100;i++){
            System.out.print(i+" ");
        }


    }
}
