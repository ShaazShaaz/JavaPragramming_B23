import java.util.Scanner;

public class Laptop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double price=0;

        System.out.println("Select screen size:");
        double size= scan.nextDouble();
        if (size==13.3){
            price+=200;
        }else if (size==15.0){
            price+=300;
        }else if (size==17.3){
            price+=400;
        }
        System.out.println("Select CPU type:");
        String cpuType= scan.next();
        if (cpuType.equals("i3")){
            price+=150;
        }else if (cpuType.equals("i5")){
            price+=250;
        }else if (cpuType.equals("i7")) {
            price += 350;
        }
        System.out.println("Select RAM size:");
        int Ram= scan.nextInt();
        int ramPrice=(Ram/4)*50;
        price+=ramPrice;
        System.out.println("Select storage type:");
        String storage= scan.next();
        System.out.println("Enter memory size:");
        int memory= scan.nextInt();
        if (storage.equals("HDD")&& memory>0){
            price+=(memory/500)*50;
        }else  if (storage.equals("SDD") && memory>0){
            price+=(memory/500)*100;
        }
        System.out.println("Enter screen resolution:");
        String screen= scan.next();
        if (screen.equals("FULLHD")){
            price+=100;
        }else if (screen.equals("4K")){
            price+=200;
        }
        System.out.println("Laptop price is: $"+price);


    }
}
