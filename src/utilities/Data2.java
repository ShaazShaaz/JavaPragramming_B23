package utilities;

public class Data2 {

    public String s1="public";
    protected String s2="protected";
    String s3="default";
    private String s4="private";


    public void publicMethod(){
        System.out.println("public method");
    }
    protected void protectedMethod(){
        System.out.println("protected method");
    }
    void defaultMethod(){
        System.out.println("default method");
    }
    private void privateMethod(){
        System.out.println("private method");
    }


}
