package OfficeHours.Practice_11_11_2020;

public class CommonNumberof2Array {
    public static void main(String[] args) {

        int[] arr1 = {1,2,10,3,4,5,13,6,7,8,9};

        int[] arr2 = {10,11,2,12,13,14,8,15,1};


        for (int i=0;i< arr1.length;i++){
            for (int j=0;j< arr2.length;j++){
                if (arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }


    }
}
