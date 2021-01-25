package Ibrahim;

public class MaxMinWithArray {
    public static void main(String[] args) {


        int [] numbers={1,2,3,41,-50,6,74,8,-9};

        int max=numbers[0];
        int min=numbers[0];
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]>max){
                max=numbers[i];
            }
            if (numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
