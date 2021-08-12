public class IfStatement {
    public static void main(String[] args) {
        /*
        Use an if statement to determine if a or b is bigger. Then print:

$number is greater

Examples:

a=1
b=2

output:
2 is greater
a=1
b=2

output:
2 is greater
a=5
b=7

output:
7 is greater
         */
        int a=1;
        int b=2;


        if (a>b){
            System.out.println(a + " is greater");
        }
        if (b>a){
            System.out.println( b + " is greater");
        }


    }
}
