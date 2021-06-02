package Arrays;

import java.util.Arrays;

public class concate_two_Arrays {
    public static void main(String[] args) {

        int[] list1 = {17, 234, 3, 423, 5};
        int[] list2 = {55, 4, 512, 6, 7};
        int[] concated_list = new int[list1.length + list2.length];

        for (int i = 0; i < list1.length; i++) {
            concated_list[i] = list1[i];
        }

        int i=0;
        for (int j = list1.length; j < (list1.length + list2.length); j++) {
                concated_list[j] = list2[i];
            i++;
        }

        System.out.println(Arrays.toString(concated_list));

    }
}
