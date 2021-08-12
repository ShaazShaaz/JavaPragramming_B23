public class Alejandro {
    public static void main(String[] args) {
        /*
        Alejandro has many emails and only has time to read the emails that refer to him and a project.
        Check if his name is found in the email and if project
         is also included and if it does print "read", but if his name is not in the email print
         "don't read"
Example:
a = "dear alejandro.....alot of text"
output: "don't read"
         */
       String a="Dear Alejandro," ;
       String name="Alejandro";
       if ((a.contains("Alejandro") || (a.contains("alejandro"))) && a.contains("project")){
           System.out.println("read");
       }else {
           System.out.println("don't read");
       }


    }
}
