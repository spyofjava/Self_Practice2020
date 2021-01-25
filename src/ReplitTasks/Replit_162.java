package ReplitTasks;

import java.util.Scanner;

public class Replit_162 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int [] fibonacci=new int[num+1];
        fibonacci[0]=0;
        fibonacci[1]=1;
        for (int i=2;i<fibonacci.length;i++){
            fibonacci[i]=fibonacci[i-2]+fibonacci[i-1];
        }
        System.out.println(fibonacci[num]);









    }
}
