import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class bosssss {

    public static void main(String[] args) {

       String [] list = {"a","b","f","r","f","a","y","u","o","r","t","y","g","h","e","t","y","o"};


        ArrayList<String> last_list =new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            int count = 0;

            for (int j = 0; j < list.length; j++) {

                if (list[i].equals(list[j])){
                    count++;
                }
               /*
                if (count == 2){
                    last_list.add((list[i]));
                }

                */
            }
            if (count == 2){
                if (!last_list.contains(list[i])) {
                    last_list.add((list[i]));
                }

            }
        }


        System.out.println("duplicated elements: "+ last_list);
    }

}
