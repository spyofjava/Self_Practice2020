package Encapulation;

public class Circle {
//------------------ encapsulation is to reach and use  private variable---------
    public static final double PI ;
     private double radius ;

     static {
         PI =  Math.PI;
         System.out.println("merhaba");
     }

     private void isOvalshape(){
         System.out.println("Circle is an Oval shape");
     }



     public void getisOvalshape(){
         isOvalshape();
     }






    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double area(){
         return PI*radius*radius;
    }

    public double perimeter(){
         return 2*PI*radius;
    }






}
