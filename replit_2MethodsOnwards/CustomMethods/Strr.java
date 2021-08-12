package CustomMethods;

public class Strr {
    public static void main(String[] args) {
        String a="abcd";
        String b="1234";
        String result="";
        for (int i = 0,j=0; i < a.length(); j++,i++) {
            result+=""+a.charAt(i)+b.charAt(j);
        }
        System.out.println(result);
    }
}
