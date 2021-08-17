package day34_LocalDateTime_Wrapper;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str="123";
       // int num=Integer.parseInt(str);// converts String to int
       // System.out.println(num);
        int num=Integer.valueOf(str); // unboxing, converts str into Integer Wrapper class first

        System.out.println(num-1);
        Integer num2=Integer.parseInt(str); // autoboxing
        int num3=Integer.parseInt(str); // will return int value cuz none are Wrapper class
        System.out.println(num2);
        System.out.println(num3);

        String str2="true";
        boolean r1=Boolean.parseBoolean(str2);
        // return a primitive value

        boolean r2= Boolean.valueOf(str2); // unboxing
        // return a primitive after converting String into a Wrapper Class

        Boolean r3=Boolean.parseBoolean(str2); // autoboxing
        //converts string to Wrapper Class
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println("--------------------------------");

        char ch='4';
        boolean isDigit=Character.isDigit(ch);
        boolean isLetter=Character.isLetter(ch);
        boolean isSpecialChar=!Character.isLetterOrDigit(ch);

        System.out.println("------------------------------");
        // INTERVIEW TASK

        String s="a1b2c3";
        int sum=0;
        for (char each : s.toCharArray()) {
            if (Character.isDigit(each)){
               sum +=Integer.parseInt(""+each);
            }
        }
        System.out.println(sum);
        System.out.println("---------------------------------");

        String s2="AAABBBCC21C!@#$%^",
        digits="",
        letters="",
        specialChar="";

        for (char each : s2.toCharArray()) {
            if (Character.isDigit(each)){
                digits+=each;
            }else  if (Character.isLetter(each)){
                letters+=each;
            }else {
                specialChar+=each;
            }

        }
        System.out.println("Letters: "+letters);
        System.out.println("digits: "+digits);
        System.out.println("Special Characters: "+specialChar);




    }
}
