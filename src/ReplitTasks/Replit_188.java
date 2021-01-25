package ReplitTasks;

public class Replit_188 {


    public static void main(String[] args) {
        int [] arr={1,2,3};
        double[] arr1 = {1.5,2.5,3.5};
        System.out.println(findMax(arr));
        System.out.println(findMax(arr1));


    }
    public static int findMax(int[] arr) {
        int max=arr[0];
        for (int each:arr){
            if (each>max){
                max=each;
            }
        }
        return max;
    }

    public static double findMax(double[] arr) {
        double max=arr[0];
        for (double each:arr){
            if (each>max){
                max=each;
            }
        }
        return max;
    }
}
