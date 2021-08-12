public class Switch {
    public static void main(String[] args) {
        /*
        Write a switch statement that tests the value of the char variable response and performs the following actions:

if response is y, the message Your request is being processed is printed
if response is n, the message Thank you anyway for your consideration is printed
if response is h, the message Sorry, no help is currently available is printed
for any other value of response, the message "Invalid entry, please try again!" is printed
         */
        char letter='f';
        String name="";
        switch (letter){
            case 'y':
                name= "Your request is being printed";
                break;
            case 'n':
                name="Thank you anyway for your consideration";
                break;
            case 'h':
                name="Sorry, no help is currently available";
                break;
            default:
                name="Invalid entry, please try again!";

        }
        System.out.println(name);





    }
}
