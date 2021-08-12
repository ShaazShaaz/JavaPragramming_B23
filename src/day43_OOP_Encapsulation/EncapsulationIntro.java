package day43_OOP_Encapsulation;

public class EncapsulationIntro {
    //public String username="Cybertek",password="Cybertek123";
    private String username="Cybertek",password="Cybertek123";

public String getUsername(){  // getter= allows us to read the private data outside the class
    return username;
}

public String getPassword(){
    return password;
}

public void setUsername(String username){
    if (username.length()<5){
        System.out.println("username must be 5 characters or longer");
        return;
    }
    this.username=username;
}

public void setPassword(String password){
    if (!password.contains(""+'@')){
        System.out.println("password should contain @");
    }
    this.password=password;
}

}
