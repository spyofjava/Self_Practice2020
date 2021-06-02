import java.util.Arrays;
import java.util.Scanner;

public class bosssss2 {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Please input how much number do you want?: ");
        int size = scan.nextInt();
        int [] list = new int[size];
        for (int j = 0; j < size; j++) {
            System.out.println("please add number "+(j+1));
            list[j] = scan.nextInt();
        }

        int max_number = list[0];


        for (int i = 0; i < list.length; i++) {

            if (list[i] > max_number ){
                max_number = list[i];
            }

        }

        System.out.println(Arrays.toString(list));
        System.out.println("Max number : "+ max_number);
    }

}
