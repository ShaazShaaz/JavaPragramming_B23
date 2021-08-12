package Day20;

public class CatsDogs {
    public static void main(String[] args) {
        /*
        write a program to print true if the string "cat" and "dog" appear the same number of times
        in the given sentence
        Ex:
            sentence = "cat dog dog cat"
            output:
                true
         */
        String sentence="cat dog dog cat";
        int numOfCats=0;
        int numOfDogs=0;
        for (int i = 0; i <=sentence.length()-3; i++) { // i: 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14
            String each = sentence.substring(i, i + 3);
            System.out.println(each);
            if (each.equals("cat")) {
                numOfCats++;
            }
            if (each.equals("dog")){
                numOfDogs++;
        }
            System.out.println(numOfCats);
            System.out.println(numOfDogs);
        }
        boolean equal=numOfCats==numOfDogs;
        System.out.println(equal);



    }
}
