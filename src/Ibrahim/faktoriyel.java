package Ibrahim;

import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        System.out.println("========================");
        Scanner k=new Scanner(System.in);
        System.out.print("Bir sayi girin: ");
        int x=k.nextInt();
        System.out.print(x+"!= ");

        int t=1;
        for (int i=1;i<=x;i++){
            System.out.print(t);
            if (i==x) {
                break;
            }
            System.out.print(".");
            t=t+1;

        }








        int y=1;
        int z=1;
        for(int i=1;i<x;i++){

            y*=z+1;
            z+=1;
        }
        System.out.println("= "+y);






        System.out.println("==========================");

    }
}


