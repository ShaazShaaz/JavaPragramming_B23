package day43_OOP_Encapsulation;

public class CredentialsObjects {
    public static void main(String[] args) {
        Credentials facebook=new Credentials("qw","ws");
        facebook.setUsername("L23456");
        facebook.setPassword("katt12dert#");

        System.out.println(facebook.getUsername());
        System.out.println(facebook.getPassword());
    }
}
