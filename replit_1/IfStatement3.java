public class IfStatement3 {
    public static void main(String[] args) {
        /*
        Create an object of Scanner class named scanner. (DONE)
Create double variable named version. (DONE)
Write an if statement that will print android version name based on value of the version variable.
Versions 1.5 - Cupcake 1.6 - Donut 2.1 - Eclair 2.2 - Froyo 2.3 - Gingerbread 3.1 - Honeycomb
4.0 - Ice Cream Sandwich 4.1 - Jelly Bean 4.4 - KitKat 5.0 - Lollipop 8.0 - Oreo 9.0 - Pie

Example:

input: 1.5
output: Cupcake
input: 1.5
output: Cupcake
input: 9.0
output: Pie
input: 9.0
output: Pie
input: 11.0
output: Sorry, I don't know this version!
         */
        double version= 1.5;
        boolean cupcake=version==1.5,
                pie= version==9.0,
                donut=version==1.6,
                eclair=version==2.1,
                froyo=version==2.2,
                gingerbread=version==2.3,
                honeycomb=version==3.1,
                icecreamsandwich=version==4.0,
                jellybean=version==4.1,
                kitkat=version==4.4,
                lollipop=version==5.0,
                oreo=version==8.0;
        if (version==1.5){
            System.out.println("cupcake");
        }





    }
}
