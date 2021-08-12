import java.util.Scanner;

public class UserFound {
    public static void main(String[] args) {
        /*
        Write a program that will look up a user.
Assume that you have only 2 users: Max Payne and Alan Wake. First, ask user to enter full name.
 Display message: "Enter full name:". Then take input from user. If name is equals to either
  "Max Payne" or "Alan Wake", display message: "User found!". Otherwise, display message:
  "User not found!". Please make your search case insensitive!
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter full name:");
        String fullName= scan.nextLine();
        if (fullName.equalsIgnoreCase("Alan Wake") || fullName.equalsIgnoreCase("Max Payne")){
            System.out.println("User found!");
        }else {
            System.out.println("User not found!");
        }



    }
}
