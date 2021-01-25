package Ibrahim;

public class sep_28 {
    public static void main(String[] args) {
        int year=2025;

        boolean leapyear=year%4==0;


        String h=(leapyear)? year + " is leap year: " + leapyear: year + " is leap year: " + leapyear;

        System.out.println(h);

        System.out.println("-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/\n");

        int n=45652149;


        boolean divisibleby2=n%2==0;
        boolean divisibleby3=n%3==0;
        boolean divisibleby5=n%5==0;

        String R1=(divisibleby2)? n+" is devisible by 2: "+divisibleby2:n+" is devisible by 2: "+divisibleby2;
        String R2=(divisibleby3)? n+" is devisible by 3: "+divisibleby3:n+" is devisible by 3: "+divisibleby3;
        String R3= (divisibleby5)? n+" is devisible by 5: "+divisibleby5:n+" is devisible by 5: "+divisibleby5;
        System.out.println(R1+"\n"+R2+"\n"+R3);

        System.out.println("-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/-*/\n");



        int gallons=51;
        int cnvrt= (int) (gallons*3.785);
        System.out.println(gallons+" gallons equal to "+cnvrt+" liters");



    }
}
