package ReplitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_142 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter How many row are:");
        int rows = inp.nextInt();
        System.out.println("Enter How many colons are");
        int cols = inp.nextInt();
        int[][] arr = new int[rows][cols];//arr={{12,234,14},{23,56,78,123},{12,4,67}}
        for(int i=0 ;i<=rows-1;i++){
            for(int j=0 ;j<=cols-1;j++){
                arr[i][j]=inp.nextInt();
            }//end for cols
        }
        System.out.println(Arrays.deepToString(arr));
        int max=arr[0][0];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(max);

    }
}
