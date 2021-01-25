package Methods;

public class MaxMinInArray {

    public static void main(String[] args) {

        int [] arr={14,1,84,97,1243,46};

        String maxmin= MaxAndMin(arr);
        System.out.println(maxmin);
    }
    public static String MaxAndMin(int[] arr){
        int min=arr[0];
        int max=arr[0];

        for (int each:arr){
            if (each<min){
                min=each;
            }
            if (each>max){
                max=each;
            }
        }

        return "Max: "+max+"\n"+"Min: "+min;
    }


}

