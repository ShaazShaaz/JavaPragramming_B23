package Day16;

public class EmailDomain {
    public static void main(String[] args) {
        /* String email="Cybertek@gmail.com";
        int beginningIndex=email.indexOf("@")+1;
        int endingIndex=email.indexOf(".");
        String domain=email.substring(beginningIndex,endingIndex);
        System.out.println("domain:"+ domain);
*/
        String email="Cybertek.School@gmail.com";
        int beginningIndex=email.indexOf("@")+1;  // 1 unit after the @ character
        int endingIndex=email.lastIndexOf("."); //or (".com")
        String domain=email.substring(beginningIndex,endingIndex);
        System.out.println("domain:"+ domain);




    }
}
