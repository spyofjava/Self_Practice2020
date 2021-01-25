package Ibrahim;

import java.util.Scanner;

public class threetimesPassword_Input {
    public static void main(String[] args) {

        Scanner x=new Scanner(System.in);
        System.out.println("Parola giriniz: ");




        int i=2;
        while(true){
            int parola=123;
            int y=x.nextInt();
            if (parola==y){
                System.out.println("Correct Password. welcome in");
                break;
            }




            if(parola!=y){

                if (i ==0) {
                    System.out.println("Sorry, you have been locked out.");
                    break;
                }


                System.out.println("(You have left right: "+i +")\n Something went wrong. Please try again: ");
                i=i-1;



            }


        }


    }
}
