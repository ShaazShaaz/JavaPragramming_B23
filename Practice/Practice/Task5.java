package Practice;

public class Task5 {
    public static void main(String[] args) {
        /*
        Write a Java program to test if an array contains a specific value
         */
        String[] array={"cat","dog","mat"};
        boolean contains=false;
        for (String element:array){
            if (element.equals("mouse")){
                contains=true;
            }
        }
        System.out.println(contains);


    }
}
