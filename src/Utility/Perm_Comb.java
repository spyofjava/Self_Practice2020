package Utility;

public class Perm_Comb {


    public static void Permutation(int a , int b){
        int x=a;
        int y=b;
        int result =1;
        for (int i = 1 ; i <= b ; i++){

            result *= a;
            a--;

        }

        System.out.println("P("+x+" , "+y +")= "+result);

    }

    public static void Combination(int a , int b){

        int x=a;
        int y=b;
        int result =1;
        for (int i = 1 ; i <= b ; i++){

            result *= a;
            a--;

        }

        int denominator=1;
        for (int i = b; i >0 ; i--) {

            denominator *= b;
            b--;

        }



        System.out.println( "C("+x+" , "+y +")= "+ result/denominator);

    }

}
