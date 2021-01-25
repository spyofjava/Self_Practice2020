package Ibrahim;

import java.util.Scanner;

public class BasamakAzaltma {
    public static void main(String[] args) {
                Scanner s=new Scanner(System.in);
                int k1= s.nextInt();
                int x=k1;
                    for (int i=1; i<=9 ;i++){

                        System.out.println(x);
                        x=x/10;
                    }


    }
}
