package ForEachLoop;

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {

        String[] names = {"Delaram", "Aysel", "Snoop", "Ayse", "Erjon"};

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]+" ");
        }

        System.out.println();
        //-----------------for each---------------

        for (String each:names) {         //names[1] ,names[2], names[3]...
            System.out.print(each+" ");
        }

        System.out.println();

        String[] Myname={"Ibrahim","Sabiha","Muhammet Taha","Sare Meliha"};
        for (String each:Myname){
            System.out.println(Arrays.toString(each.split("")));
        }


        for (String each:Myname){
            System.out.println(each);
        }

        System.out.println();


        int[] a={1,2,3,4,5,6,7,8,9,10,11,12,13};
         int countOdd=0;
         int countEven=0;
         for (int each:a){
             if (each%2==0){
                 countEven++;
             }else {
                 countOdd++;
             }
         }
        System.out.println("Count Of Odd: "+countOdd);
        System.out.println("Count Of Even: "+countEven);

        System.out.println("\n\n\n");
        int[] num={-61,-48,-94,-16,-65,-32,-150,-28};
        int max=num[0];
        int min=num[0];

        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        for (int each:num){
            if (each>max){
                max=each;
            }
            if (each<min){
                min=each;
            }
        }
        System.out.println("Max number: "+max);
        System.out.println("Min number: "+min);






    }
}
