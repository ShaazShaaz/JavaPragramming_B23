package Day7;

public class ValidTriangle {
    public static void main(String[] args) {
        int angle1=60;
        int angle2= 90;
        int angle3=75;
        boolean isValid= (angle1+angle2+angle3==180);

        System.out.println("figure is a triangle: " + isValid);
    }
}
