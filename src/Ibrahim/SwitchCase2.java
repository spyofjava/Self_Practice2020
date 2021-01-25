package Ibrahim;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);
        int emotion= read.nextInt();

        switch (emotion){
            case 1:
                System.out.println("You are happy!");
                break;
            case 2:
                System.out.println("You are sad!");
                break;
            case 3:
                System.out.println("You are angry!");
                break;
            case 4:
                System.out.println("You are surprised!");
                break;
            default:
                System.out.println("i don\'t know that emotion.");






        }
    }
}
