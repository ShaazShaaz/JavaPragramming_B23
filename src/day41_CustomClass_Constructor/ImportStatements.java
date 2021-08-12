package day41_CustomClass_Constructor;
import java.util.Arrays; // all static and nonstatic members can be imported from Arrays class
//import utilities.Data;
import static utilities.Data.str3; // or for all static- Data.*
import static utilities.Data.str4;
import static utilities.Data.method3;
import static utilities.Data.method4;

public class ImportStatements {
    public static void main(String[] args) {
        /*
        Data obj=new Data();
        System.out.println(obj.str1);
        System.out.println(obj.str2);

        System.out.println(Data.str3);
        System.out.println(Data.str4);

         */
        System.out.println("----------------------------------");

        // if u only need static str3, then only import static member
        System.out.println(str3);



    }

}
/*

 */
