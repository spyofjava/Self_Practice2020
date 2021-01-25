package Ibrahim;

import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        int result=1;
        for (int i=number;i>=1;i--){
            result*=i;
        }
        System.out.println(number+"!= "+result);

    }
}
