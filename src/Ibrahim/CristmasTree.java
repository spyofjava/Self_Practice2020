package Ibrahim;

public class CristmasTree {
    public static void main(String[] args) {



        for (int i=1;i<=9;i++){
            for (int k=10;k>=i;k--){
                System.out.print(" ");
            }

            for (int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for (int t=1;t<=5;t++){

            for (int m=1;m<=8;m++){
                System.out.print(" ");
            }
            for (int l=1;l<=5;l++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
