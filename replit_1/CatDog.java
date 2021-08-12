public class CatDog {
    public static void main(String[] args) {
        /*
        Print true if the string "cat" and "dog" appear the same number of times in the given
        string word.
Example:
input: catdog
output: true
         */
        String word="catdogcat"; // 0 1 2 3 4 5
        int numOfCats=0;
        int numOfDogs=0;
        for (int i = 0; i <= word.length()-3; i++) {
            String each=word.substring(i,i+3);

            if (each.equals("cat")){
                numOfCats++;
            }
            if (each.equals("dog")){
                numOfDogs++;
            }
        }
        if (numOfCats==numOfDogs){
            System.out.println("true");
        }else {
            System.out.println("false");
        }


    }
}
