package Recap;

public class BrowserName {
    public static void main(String[] args) {
        /*
         write a program that can display the selected browser
                1. declare a String variable called browserName
                2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                3. if the browser name does not match with the valid browsers' names, output should be: Invalid Browser Name

             Ex:
                browserName = "chrome";

                output:
                    Chrome Browser is Selected
         */
        String browserName="chrome";
        if (browserName=="chrome"){
            System.out.println(browserName+ " browser is Selected");
        }else if (browserName=="firefox"){
            System.out.println(browserName+ " browser is Selected");
        }else if (browserName=="opera"){
            System.out.println(browserName+ " browser is Selected");
        }else if (browserName=="safari"){
            System.out.println(browserName+ " browser is Selected");
        }else {
            System.out.println(" Invalid browser name");
        }

    }
}
