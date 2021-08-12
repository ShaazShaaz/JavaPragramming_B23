package Recap;

public class SP3 {
    public static void main(String[] args) {
        String email="Cybertek@gmail.com";
        // find the domain
        System.out.println("Domain: "+(email.substring(email.indexOf('@')+1,email.indexOf('.'))));
        System.out.println("--------------------------------------------------");

        /*
        enter a three letter word. Check if the middle character of
         the given word is 'a'. In the case it is print: "Cool word", but in the case the middle
         letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"
         */
        String s="cat";
        if (s.length()>3 || s.length()<3){
            System.out.println("word is too long or short");
        }else if (s.charAt(1)=='a'){
            System.out.println("cool word");
        }else if (s.charAt(1)!='a'){
            System.out.println("okay word");
        }





    }
}
