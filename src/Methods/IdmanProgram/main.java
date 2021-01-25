package Methods.IdmanProgram;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Idman programina Hosgeldiniz");

        String idmanlar=("Gecerli hareketler.....\nBurpee..." +
                "\nPushUp..." +
                "\nSitUp..." +
                "\nSquat... ");


        System.out.println(idmanlar);


        System.out.println("Bir idman olusturun...");

        System.out.println("Burpee sayisi: ");
        int burpee= scanner.nextInt();
        System.out.println("pushup sayisi: ");
        int pushup= scanner.nextInt();
        System.out.println("situp sayisi: ");
        int situp= scanner.nextInt();
        System.out.println("squat sayisi: ");
        int squat= scanner.nextInt();


        idman hareket=new idman(burpee, pushup, situp, squat);
        System.out.println("idmaniniz basliyor...");
        scanner.nextLine();
        while (hareket.idmanBittiMi()==false){
            System.out.println("Hareket Turu(Burpee,Pushup,Situp,Squat): ");
            String hareketturu=scanner.nextLine();
            System.out.println("Bu hareketten kac tane yapacaksiniz?: ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            hareket.harekeYap(hareketturu,sayi);

        }
    }
}
