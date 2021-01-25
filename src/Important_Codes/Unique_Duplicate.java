package Important_Codes;

import java.util.Scanner;

public class Unique_Duplicate {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a String");//"aabccde"
        String str=input.next();
        String unique="";
        String duplicate="";
        for (int j=0;j<str.length();j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(j) == str.charAt(i)) {
                    count++;
                }
            }
            if (count==1){
                unique+=str.charAt(j);
            }
            if (count>1){

                duplicate += str.charAt(j);

            }

        }
        System.out.println(unique);
        System.out.println(duplicate);


    }
}
