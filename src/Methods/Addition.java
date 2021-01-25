package Methods;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        plus(input.nextInt(), input.nextInt());

    }
    public static void plus(int a,int b){
        System.out.println(a+b);
    }
}
