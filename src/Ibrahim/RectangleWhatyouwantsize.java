package Ibrahim;

import java.util.Scanner;

public class RectangleWhatyouwantsize {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i=0;i<=n+1;i++){
            for (int j=1;j<=3;j++){
                if (i==0||i==n+1){
                    System.out.print("x");

                }else{
                    if (j==2){
                        System.out.print(" ");
                    }else {
                        System.out.print("x");
                    }
                }
            }
            System.out.println();
        }


    }
}
