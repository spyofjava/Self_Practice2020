package JetBrainAcademy;



import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        int yEaR=scanner.nextInt();

        if (yEaR>=1900&&yEaR<=3000) {
            if (yEaR % 100 != 0&&yEaR % 4 == 0||yEaR % 400 == 0) {
                    System.out.println("Leap");
            } else if (yEaR%100==0&&yEaR%4==0){
                    System.out.println("Regular");
            }else if (yEaR%100==0&&yEaR%4!=0){
                System.out.println("Regular");
            }else if (yEaR%100!=0&&yEaR%4!=0){
                System.out.println("Regular");
            }

        }

    }

}
