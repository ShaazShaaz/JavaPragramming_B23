package day40_CustomClassStatic;

public class ExecutionOfStaticBlock {

    static {
        System.out.println("Static block");
    }

    public static void method() {
        System.out.println("hi");
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }

}
