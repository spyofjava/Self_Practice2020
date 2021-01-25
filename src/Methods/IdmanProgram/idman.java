package Methods.IdmanProgram;

public class idman {

    public int burpeeSayisi;
    public int pushUpSayisi;
    public int sitUpSayisi;
    public int squatSayisi;


    public idman(int burpeeSayisi, int pushUpSayisi, int sitUpSayisi, int squatSayisi) {
        this.burpeeSayisi = burpeeSayisi;
        this.pushUpSayisi = pushUpSayisi;
        this.sitUpSayisi = sitUpSayisi;
        this.squatSayisi = squatSayisi;
    }

    public void burpeeYap(int sayi){
        if (burpeeSayisi==0){
            System.out.println("Hedefinize ulastiniz...");
        }
        if (burpeeSayisi>sayi){
            System.out.println("Hedefini gectin ..Tebrikler...");
            burpeeSayisi=0;
            System.out.println("Kalan Burpee sayisi: "+burpeeSayisi);
        }

        else {
            burpeeSayisi-= sayi;
            System.out.println("Kalan Burpee sayisi: "+burpeeSayisi);

        }
    }
    public void squatYap(int sayi){
        if (squatSayisi==0){
            System.out.println("Hedefinize ulastiniz...");
        }
        if (squatSayisi>sayi){
            System.out.println("Hedefini gectin ..Tebrikler...");
            squatSayisi=0;
            System.out.println("Kalan Burpee sayisi: "+squatSayisi);
        }

        else {
            squatSayisi-= sayi;
            System.out.println("Kalan Burpee sayisi: "+squatSayisi);

        }
    }
    public void pushupYap(int sayi){
        if (pushUpSayisi==0){
            System.out.println("Hedefinize ulastiniz...");
        }
        if (pushUpSayisi>sayi){
            System.out.println("Hedefini gectin ..Tebrikler...");
            pushUpSayisi=0;
            System.out.println("Kalan pushup sayisi: "+pushUpSayisi);
        }

        else {
            pushUpSayisi-= sayi;
            System.out.println("Kalan pushup sayisi: "+pushUpSayisi);

        }
    }
    public void situpYap(int sayi){
        if (sitUpSayisi==0){
            System.out.println("Hedefinize ulastiniz...");
        }
        if (sitUpSayisi>sayi){
            System.out.println("Hedefini gectin ..Tebrikler...");
            sitUpSayisi=0;
            System.out.println("Kalan Burpee sayisi: "+sitUpSayisi);
        }

        else {
            sitUpSayisi-= sayi;
            System.out.println("Kalan Burpee sayisi: "+sitUpSayisi);

        }
    }


    @Override
    public String toString() {
        return  "burpeeSayisi= " + burpeeSayisi +
                "\npushUpSayisi= " + pushUpSayisi +
                "\nsitUpSayisi= " + sitUpSayisi +
                "\nsquatSayisi= " + squatSayisi;
    }

    public void harekeYap(String hareket,int TurSayisi){
        if (hareket.equalsIgnoreCase("burpee")){
            burpeeYap(TurSayisi);
        }
        else if (hareket.equalsIgnoreCase("pushup")){
            pushupYap(TurSayisi);
        }else if (hareket.equalsIgnoreCase("situp")){
            situpYap(TurSayisi);
        }else if (hareket.equalsIgnoreCase("squat")){
            squatYap(TurSayisi);
        }else {
            System.out.println("Gecersiz hareket...");
        }
    }

    public boolean idmanBittiMi(){
        return (burpeeSayisi==0)&&(pushUpSayisi==0)&&(squatSayisi==0)&&(squatSayisi==0);
    }

}
