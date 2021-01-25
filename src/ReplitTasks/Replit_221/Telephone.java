package ReplitTasks.Replit_221;

public class Telephone {

    public String number;

    public static int quantity;
    public  static double total;

    static {
        quantity=250;
        total = 15658.92;
    }

    public String getNumber(){
        return number;
    }

    public void setNumber(String number){
        this.number=number;
    }
}
/*
Write the definition of a class Telephone.
The class has one instance variable of type String called number, and two public static variables.
One is of type int called quantity, initialized to 250;
the other is of type double called total, initialized to 15658.92
Create getNumber() method that returns the number and setNumber() method that sets the instance variable number
 */