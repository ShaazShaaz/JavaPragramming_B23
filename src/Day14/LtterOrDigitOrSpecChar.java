package Day14;

public class LtterOrDigitOrSpecChar {
    public static void main(String[] args) {
        char ch='0';
        boolean isDigit=ch>=48 && ch<=57;  // ch>='0' && ch<='9'
        boolean isLetter=(ch>=65 && ch<=90)||(ch>=97 && ch<=122);// ch>='A' && ch<='Z'
        // if the character is uppercase or lowercase letter
        // boolean isSpecialCharacter= ch!isDigit && ch!isLetter;
        //String result="";
        /*if (isDigit){
            result=ch+" is digit";
        }else if(isLetter){
            result=ch+" is Letter";
        }else{
            result=ch+" is Special Character";
        }
        */
        String result= (isDigit)?ch+" is digit":(isLetter)?ch+" is letter":ch+" is special character";

        System.out.println(result);

    }
}
