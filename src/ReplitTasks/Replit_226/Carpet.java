package ReplitTasks.Replit_226;

public class Carpet {

    public double width, length,unitPrice,totalPrice;
    public boolean isPersian;

    public  Carpet() {
        double defaultPrice=200;
        totalPrice=defaultPrice;
        isPersian=false;
        width=300;
        length=300;
        unitPrice=0;
    }


    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
        //totalPrice=(width+length)*unitPrice;
        if (isPersian){
            totalPrice=(width+length)*unitPrice+200;
        }else {
            totalPrice=(width+length)*unitPrice;
        }
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width= " + width +
                ", length= " + length +
                ", unitPrice= " + unitPrice +
                ", isPersian= " + isPersian +
                ", totalPrice= " + totalPrice +
                '}';
    }
}
/*
Carpet class has following public double instance variables: width, length, unitPrice, totalPrice
and a public boolean variable isPersian. true if carpet object is Persian and false if it is not.

Add following constructors:

1) No-Args constructor
  -sets default values for the Carpet object
   Size is 300 x 300 and totalPrice for that is 200. And also it is not a Persian carpet. unitPrice is set as 0.

2) 4-Args  Constructor:
- accepts width, length, unitPrice, isPersian  parameters and assigns values to public instance variables. try to use this. keyword

Set totalPrice as the width + length multiplied by the unitPrice.

if its a Persian carpet add 200 to totalPrice.

Carpet c2 = new Carpet(20.0, 20.0 , 2.0 ,false);
System.out.println(c2.totalPrice); // 80
the calculation:(20+20)*2


Carpet c3 = new Carpet(20.0, 20.0 , 2.0 ,true);
System.out.println(c3.totalPrice); // 280

the calculation:(20+20)*2 +200

 */