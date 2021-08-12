package Recap;

public class LoopsRemoveDupl {
    public static void main(String[] args) {
        String s1="aabbbacfcdd";
        String s2="";

        for (int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            int count=0;
            for (int j = 0; j < s1.length(); j++) {

                if (s1.charAt(j)==ch){
                    count++;
                }
                if (count==1){
                    s2+=s1.charAt(j);
                }
            }


        }
       // System.out.println(s2);
    }
}
