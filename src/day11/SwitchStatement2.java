package day11;

public class SwitchStatement2 {
    public static void main(String[] args) {
        String name="chrome";

        switch (name){
            case "chrome" :
                System.out.println("chrome browser is selected");
                break;

            case "firefox" :
                System.out.println("firefox browser is selected");
                break;

            default:
                System.out.println("Invalid browser name");// System.err.println() will give msg in RED error

        }


    }
}
