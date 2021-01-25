package ReplitTasks;

import java.util.Scanner;

public class DivingSport {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE

        for (int i = 0; i < 7; i++) {
            System.out.println("Enter score for judge "+(i+1));
            score[i] = input.nextFloat();
        }
        System.out.println("Enter difficulty:");
        float difficulty=input.nextFloat();

        float max = score[0];
        float min = score[0];
        int k=0;
        int l=0;
        for (int i=0;i<score.length ; i++) {
            if (max < score[i]) {
                max = score[i];
                k=i;
            }
            if (score[i] < min) {
                min = score[i];
                l=i;
            }
        }
        System.out.println("k"+k+"\n"+"l"+l);
        double total=0;
        for (int i=0;i<score.length;i++){
            if (i==k || i==l) {
                continue;
            }else{
                total += score[i];
            }
        }
        System.out.println(total);
        total=total*difficulty*0.6;

        System.out.printf("Total: %.2f", total);



    }
}
