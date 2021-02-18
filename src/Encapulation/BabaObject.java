package Encapulation;

public class BabaObject {

    public static void main(String[] args) {

        Baba baba = new Baba("ibrahim","uludag","University","married");

        System.out.println("Baba Bank_account() = " + Baba.getBank_account());

        System.out.println(baba.toString());


    }
}
