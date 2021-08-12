public class MessageRetrieve {
    public static void main(String[] args) {
        /*
        Given a String message in the following format: Sender:<Mike Smith>.
        From Number:[202-123-3456]. Message:{I love programing and problem solving} assign the
        value of the sender, phoneNumber, and messageBody variables and print them.
Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving
         */
        String message="Sender:<Mike Smith>. From Number:[202-123-3456]. " +
                "Message:{I love programing and problem solving}";
        int indexOfBracket=message.indexOf("[");
        int indexOfBrac=message.indexOf("]");
        int indexOfCurly=message.indexOf("{");
        int indexOfCurl=message.indexOf("}");
        int indexOfAr=message.indexOf("<");
        int indexOfAt2=message.indexOf(">");
        String sender=message.substring(indexOfAr+1,indexOfAt2);
        String phone=message.substring(indexOfBracket+1,indexOfBrac);
        String Message=message.substring(indexOfCurly+1,indexOfCurl);
        System.out.println("Sender: "+sender);
        System.out.println("Phone Number: "+phone);
        System.out.println("Message body: "+Message);




    }
}
