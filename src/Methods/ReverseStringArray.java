package Methods;

import java.util.Arrays;

public class ReverseStringArray {

    public static void main(String[] args) {

        String[] names = {"Sayyohat" , "Livio" , "Marwan" , "Inna" , "Halim" , "Afrooz" , "Maryam"};
        revese(names);



    }

    public  static  void revese(String [] names){
        for (int i = 0; i < names.length; i++){
            String each="";
            for (int j = names[i].length()-1; j >= 0; j--){
                each += names[i].charAt(j);
            }
            names[i] = each;
        }
        System.out.println(Arrays.toString(names));
    }

}
