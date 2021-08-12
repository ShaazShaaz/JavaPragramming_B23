package day33_Methods;

import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
       /* String c="abcd";
        c=c.substring(1,7);
        System.out.println(c);

        */
        String s="The game was tied at 2-2";
        String s2=s.substring(5);
        int index1=s.indexOf("game");
        int index2=s2.indexOf("game");
        if (index1==index2){
            System.out.println(index1);
        }else {
            System.out.println(index2);
        }

        int number=5;
        while (number<100){
            number+=number;
        }
        System.out.println(number);

        int a=0;
        do{
            a=a++ + --a - (a%3);

        }while(++a < 4);
        System.out.println(a);

        String s1="I will find the lost book";
        String word="";
        for (int i = s1.length()-1; i <=0 ; i--) {
            word+=s1.charAt(i);

        }
        System.out.println(word);
        String input="today it will be 100 degrees !";
        int n=0;
        while (n++<input.length()){
            if (n==8){
                continue;
            }else if (n==9){
                break;
            }
        }
        System.out.println(input.charAt(++n));

        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int iterate= scan.nextInt();
        int total=0;
        for (int i = 0; i < iterate; i++) {
            if (i%3==0)
                continue;
                total+=num1+num2;
            }
        System.out.println(total);





    }
}
