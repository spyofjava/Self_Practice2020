import Utility.Perm_Comb;

public class bosssss {


    public static void main(String[] args) {

        Permutation(5,2);
        Combination(5,2);



        Perm_Comb.Permutation(6,2);
        Perm_Comb.Combination(7,2);



    }

    public static void Permutation(int a , int b){

        int result =1;
      for (int i = 1 ; i <= b ; i++){

          result *= a;
          a--;

      }

        System.out.println(result);

    }

    public static void Combination(int a , int b){

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



        System.out.println(result/denominator);

    }


}
