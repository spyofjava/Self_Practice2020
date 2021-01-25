package Ibrahim;

import java.util.Scanner;

public class areaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please give the lengh of Isosceles Side:");
        double a=s.nextDouble();
        System.out.print("Please give the lengh of bottom of the triangle:");
        double b=s.nextDouble();
        double A=b/4*Math.sqrt(4*a*a-b*b);
        System.out.println("Area Of Isosceles Triangle: "+A);



    }
}
