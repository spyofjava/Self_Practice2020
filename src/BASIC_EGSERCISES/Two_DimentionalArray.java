package BASIC_EGSERCISES;

import java.util.Scanner;

public class Two_DimentionalArray {
    public static void main(String[] args) throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        Boolean[][] list = {{scan.nextBoolean(),scan.nextBoolean(),scan.nextBoolean()},{scan.nextBoolean(),scan.nextBoolean(),scan.nextBoolean()}};

        String result="";
        for(int i = 0 ; i < list.length; i++){
            for (int j = 0; j < list[i].length; j++) {

                if (list[i][j].equals(true)) {
                    result += "t";
                } else {
                    result += "f";
                }
                System.out.print("\r" + result);
                Thread.sleep(1000);

            }
            System.out.println();
            result="";
        }



    }
}
