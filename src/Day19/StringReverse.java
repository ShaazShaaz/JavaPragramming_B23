package Day19;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        String name=new Scanner(System.in).nextLine();
        // eg String name="Muhtar";
        // index    012345
        String reverseName="";  // rathuM
        for (int i = name.length()-1; i >=0 ; i--) {
            reverseName+=name.charAt(i);
        }
        System.out.println(reverseName);


    }
}
