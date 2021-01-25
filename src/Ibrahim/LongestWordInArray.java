package Ibrahim;

import java.util.Arrays;

public class LongestWordInArray {
    public static void main(String[] args) {

        String[] words = {"Monday", "Apple", "Banana", "Strawberry", "Programming"};

        int lengthword=0;
        int[] length=new int[5];
        for (int i=0; i<words.length;i++){

            lengthword=0;
            String a=words[i];

            for (int j=0;j<words[i].length();j++){
                lengthword++;
            }
            length[i]+=lengthword;

        }
        int k=0;
        for (int i=0;i<length.length;i++) {
            int max=length[0];
            if (length[i]>max){
                max=length[i];
                k=i;
            }
        }
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(length));
        System.out.println("longest word is: "+(k+1)+"rd in the list");

        System.out.println("Longest Word: "+words[k]);

    }
}
