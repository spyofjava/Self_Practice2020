package Ibrahim;

public class MaxMinWithNested {
    public static void main(String[] args) {

        int[] num = {125, 2, 3, 4, 555, 6, 7, 8, 9, 10};
        int maxNum = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > maxNum) {
                maxNum = num[i];
            }
        }
        int minNum = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < minNum) {
                minNum = num[i];
            }
        }
        System.out.println("Min num: " + minNum + "Max num: " + maxNum);





    }
}
