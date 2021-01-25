package Ibrahim;

public class HousePaternNested {
    public static void main(String[] args) {


        for (int i=15;i<=21;i++){
            for (int j=25;j>=i-7;j--) {
                System.out.print(" ");
            }
            for (int k=-19;k<=2*i-1;k++){
                System.out.print("^");
            }
            System.out.println();
        }
        for (int i=0;i<11;i++){
            for (int k=1;k<15;k++){
                System.out.print(" ");
            }
            for (int j=1;j<58;j++) {
                System.out.print("|");

            }

            System.out.println();
        }



    }
}
