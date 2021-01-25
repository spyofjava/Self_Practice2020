package Ibrahim;

public class unaryOperators {
    public static void main(String[] args) {
        int c=100;
        -- c;
        System.out.println(c);

        int a=5;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println();

        System.out.println("========================");

        int b=8;
        int x=b++;
        System.out.println(b);
        System.out.println(b++);
        System.out.println(++b);
        System.out.println(x);
        System.out.println("========================");

        int x4=5;
        int y4=x4++;
        System.out.println(y4);
        System.out.println(x4);
    }
}
