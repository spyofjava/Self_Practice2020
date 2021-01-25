package Ibrahim;

import java.util.Scanner;

public class Inhabitants {
    public static void main(String[] args) {




        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int i=0;
        if (inhabitants==0){
            System.out.println("---- EXTINCT ----");

        }else {
            while (true) {
                System.out.println("Day " + i + " [" + inhabitants + "]");
                i++;
                inhabitants /= 2;
                if (inhabitants == 1) {
                    System.out.println("Day " + i + " [" + inhabitants + "]");
                    System.out.println("---- EXTINCT ----");
                    break;
                }

            }
        }




    }
}
