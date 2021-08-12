package day34_LocalDateTime_Wrapper;

public class PasswordValidation {
    public static void main(String[] args) {
        /*
        PasswordValidation:
    Write a program to verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one uppercase letter
                3. PassWord should at least contain one lowercase letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
         */
        String password="CybbrTek!";//"Cyb3rTek!";

        boolean r1=password.length()>=8 && !password.contains(" ");
        boolean r2=false; // has uppercase
        boolean r3=false; // has lowercase
        boolean r4=false; // has digit
        boolean r5=false; // has special character

        for (char each : password.toCharArray()) {
            if (Character.isUpperCase(each)){
                r2=true;
            }else if (Character.isLowerCase(each)){
                r3=true;
            }else if (Character.isDigit(each)){
                r4=true;
            }else {
                r5=true;
            }

        }
        boolean isStrongPassword= r1 && r2 && r3 && r4 && r5;
        System.out.println(isStrongPassword);

        if (!r1){
            System.out.println("Password does not have 8 characters or does not contain space");
        }
        if (!r2){
            System.out.println("Password does not have uppercase letter");
        }
        if (!r3){
            System.out.println("Password does not have lowercase letter");
        }
        if (!r4){
            System.out.println("Password does not have any digit");
        }
        if (!r5){
            System.out.println("Password does not have any special character");
        }

    }
}
