package day43_OOP_Encapsulation;

public class Credentials {

    /*
    create a class named Credentials
            variables:
                username, password
            methods:
                isStrongPassWord(): takes an argument of string and verifys if the given string is strong password
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit
                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                                    the new password MUST be a strong password
                toString()
                requirements for username=
                must start with a letter
                must have at least 5 characters

     */
    private String username,password;

    public Credentials(String username, String password) {
       setUsername(username);
       setPassword(password);
    }

    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }

    public void setUsername(String username) {
        boolean startsWithLetter=Character.isLetter(username.charAt(0));
        if (!startsWithLetter || username.length()<5){
            return;
        }
        this.username = username;
    }

    public void setPassword(String password) {
        if (!isStringPassword(password)){
            return;
        }
        this.password = password;
    }

    public static boolean isStringPassword(String password){
        boolean r1=password.length()>=8 && !password.contains(" ") && !password.contains(",");
        boolean r2=false,
                r3=false,
                r4=false;

        for (char each:password.toCharArray()) {
            if (Character.isLetter(each)){
                r2=true;
            }
            else if (!Character.isLetterOrDigit(each)){
                r3=true;
            }else {
                r4=true;
            }
        }
        return r1 && r2 && r3 && r4;
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
