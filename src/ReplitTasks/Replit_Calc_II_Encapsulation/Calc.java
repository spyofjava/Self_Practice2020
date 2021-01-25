package ReplitTasks.Replit_Calc_II_Encapsulation;

public class Calc {

    private int X, Y, result;

    public void setX(int x) {
        X = x;
    }

    public int getX() {
        return X;
    }

    public void setY(int y) {
        Y = y;
    }

    public int getY() {
        return Y;
    }

    public int getResult() {
        return result;
    }


    public void plus(){
        System.out.println(result=(getX()+getY()));
    }


    public void minus(){
        System.out.println(result=getX()-getY());
    }



}
