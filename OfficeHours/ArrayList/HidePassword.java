package ArrayList;

import java.util.ArrayList;

public class HidePassword {
    public static void main(String[] args) {
        /*
         Hide Passwords
                    Given an array of passwords (String). Hide each password as a star () and show the hidden password
                    Ex:
                    Input:
                    {"one", "hi", "hold}
                    Output:
                    [ **, , ** ]
         */
    String[] password={"one","hi","hold"};
        ArrayList<String> hiddenPassword=new ArrayList<>();
        for (String each:password){
            String star="";
            for (int i = 0; i < each.length(); i++) {
                star+="*";

            }
            hiddenPassword.add(star);
        }
        System.out.println(hiddenPassword);

    }

}
