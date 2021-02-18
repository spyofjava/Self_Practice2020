package Encapulation;

public class circleObject {

    public static void main(String[] args) {

        Circle circle =new Circle(3);
        System.out.println(circle.area());
        circle.setRadius(5);
        System.out.println(circle.area());
        System.out.println(circle.getRadius());
        System.out.println(Circle.PI);
        circle.setRadius(40);
        System.out.println(circle.getRadius());
        circle.getisOvalshape();

    }
}
