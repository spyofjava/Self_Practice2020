package Constructors;

public class ConstructorIntro {

    static int b;
    int a;

    static {
        System.out.println("hello");
        b=200;
    }

    public ConstructorIntro(int a) {
        System.out.println("constructor that accept int variable");
        this.a=a;
    }



    public static void main(String[] args) {

        ConstructorIntro obj1= new ConstructorIntro(4);



    }
}
