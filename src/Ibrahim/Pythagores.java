package Ibrahim;

import java.util.Scanner;

public class Pythagores {
    public static void main(String[] args) {
        System.out.println("     ^\n    | \\\na<--|  \\-->c"+"\n    |   \\\n    |    \\\n    -------\n      |\n      V\n      b");

        Scanner k=new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("islemler:\n"+"1-Hipotenus bulmak icin\n"+"2-Dik kenarlari bulmak icin");
        System.out.println("=================================");
        System.out.print("Islem seciniz: ");
        int s=k.nextInt();

        if (s==1){

            System.out.print("a: ");
            double a=k.nextDouble();
            System.out.print("b:");
            double b=k.nextDouble();
            double c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
            System.out.println("Hypotenus: "+c);

        }
            else{
            System.out.print("a: ");
            double a=k.nextDouble();
            System.out.print("c:");
            double c=k.nextDouble();
            double b=Math.sqrt(Math.pow(c,2)-Math.pow(a,2));
            System.out.println("Hypotenus: "+b);



        }


        }
    }

