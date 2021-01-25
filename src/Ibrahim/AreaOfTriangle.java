package Ibrahim;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.print("Bottom of Triangle: ");
        double a=k.nextDouble();
        System.out.print("Heigh of Triangle: ");
        double h=k.nextDouble();
        double A=a*h/2;
        System.out.println("Area of Triangle: "+A);


    }
}
