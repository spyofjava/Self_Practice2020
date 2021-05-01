package Empty;

import Utility.Perm_Comb;

public class Empty1  {

    public double radius;
    private double perimeter;
    protected double PI;
    final double area;


    public Empty1(double radius ) {
        this.radius = radius;
        PI=Math.PI;
        area = PI*radius*radius;
        perimeter = 2* PI*radius;



    }



}
